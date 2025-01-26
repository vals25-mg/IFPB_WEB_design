<%@ page import="utilitaire.UtilDB" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="models.HetraMaisonAnnee" %>
<%@ page import="bean.CGenUtil" %>
<%@ page import="models.HetraMaisonAnnee" %><%--
  Created by IntelliJ IDEA.
  User: valisoa
  Date: 26/01/2025
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">

    <title>Details des taxes des maisons par année</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="../index.jsp">IFPB</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link " aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Maisons</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/pages/arrondissement.jsp">Arrondissement</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/pages/paiement-mensuel.jsp">Paiement taxe</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%
    String idmaison= request.getParameter("idmaison");
    if(  !idmaison.isEmpty() && !idmaison.equals(null)){
    UtilDB utildb=new UtilDB();
    Connection connection= utildb.GetConn();
    HetraMaisonAnnee[] lists=(HetraMaisonAnnee[]) CGenUtil.rechercherCritere(new HetraMaisonAnnee(), "1<2 and idmaison="+idmaison , connection).getResultat();
    connection.close();

%>
<div class="container">
    <h1>Taxe des maisons par année
    </h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Maison</th>
            <th>Arrondissement</th>
            <th>Année</th>
            <th>Montant à payer</th>
            <th>Montant déjà payer</th>
            <th>Reste</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <%
            for(HetraMaisonAnnee h : lists){
        %>
        <tr>
            <td><%=h.getAddresse()%></td>
            <td><%=h.getNom_arrondissement()%></td>
            <td><%=h.getAnnee()%></td>
            <td><%=h.getHetra_aloha()%>Ar</td>
            <td><%=h.getHetra_voaloha()%>Ar</td>
            <td><%=h.getReste()%>Ar</td>
            <td>
                <a class="btn btn-outline-dark" href="/pages/details-maison-annee.jsp?idmaison=<%=h.getIdmaison()%>">Voir plus</a>
            </td>
        </tr>

        <%
            }
        %>
        </tbody>
    </table>

</div>
<%
}

else { %>
<div class="container">
    <h1 class="text-danger">Aucune Maison Choisie</h1>
</div>
        <%
}
%>
</body>
</html>
