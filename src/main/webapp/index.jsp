<%@ page import="utilitaire.UtilDB" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="models.V_Maison" %>
<%@ page import="bean.CGenUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    UtilDB utildb=new UtilDB();
    Connection connection= utildb.GetConn();
    V_Maison[] lists=(V_Maison[]) CGenUtil.rechercherCritere(new V_Maison(), "1<2" , connection).getResultat();
    connection.close();
%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
    <title>Liste des maisons</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">IFPB</a>
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
<div class="container">
<h1>Liste des maisons
</h1>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Maison</th>
            <th>Arrondissement</th>
            <th>Etage</th>
            <th>Longueur</th>
            <th>Largeur</th>
            <th>Superficie vivable (m2)</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <%
            for(V_Maison h : lists){
        %>
        <tr>
            <td><%=h.getAddresse()%></td>
            <td><%=h.getNom_arrondissement()%></td>
            <td><%=h.getNombre_etage()%></td>
            <td><%=h.getLongueur()%></td>
            <td><%=h.getLargeur()%></td>
            <td><%=h.getSuperficie_vivable()%></td>
            <td>
                <a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/pages/details-maison-mois.jsp?idmaison=<%=h.getIdmaison()%>">Voir plus</a>
            </td>
        </tr>

        <%
            }
        %>
        </tbody>
    </table>

</div>

</body>
</html>