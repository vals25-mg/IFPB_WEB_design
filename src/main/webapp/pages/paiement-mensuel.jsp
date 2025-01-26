<%@ page import="utilitaire.UtilDB" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="models.V_Maison" %>
<%@ page import="bean.CGenUtil" %><%--
  Created by IntelliJ IDEA.
  User: valisoa
  Date: 26/01/2025
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
    <title>Pament taxe</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="../index.jsp">IFPB</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
    UtilDB utildb = new UtilDB();
    Connection connection = utildb.GetConn();
    V_Maison[] listsMaison = (V_Maison[]) CGenUtil.rechercherCritere(new V_Maison(), "1<2", connection).getResultat();
    connection.close();
%>
<div class="container mt-5">
    <h1 class="text-center mb-4">Formulaire Maison</h1>
    <form action="${pageContext.request.contextPath}/hello-servlet" method="POST" class="shadow p-4 rounded bg-light">
        <!-- Select Maison -->
        <div class="mb-3">
            <label for="maison" class="form-label">Sélectionnez une maison :</label>
            <select class="form-select" id="maison" name="maison" required>
                <option value="" selected disabled>Choisissez une maison</option>
                <%
                    for (V_Maison maison : listsMaison) {
                %>
                <option value="<%=maison.getIdmaison()%>">
                    <%=maison.getAddresse()%>
                </option>
                <%
                    }
                %>
            </select>
        </div>

        <!-- Input Mois et Année -->
        <div class="mb-3">
            <label for="moisAnnee" class="form-label">Sélectionnez le mois et l'année :</label>
            <input type="month" class="form-control" id="moisAnnee" name="moisAnnee" required>
        </div>

        <!-- Bouton de soumission -->
        <button type="submit" class="btn btn-primary w-100">Payer</button>
    </form>
</div>
</body>
</html>
