<%@ page import="utilitaire.UtilDB" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="models.HetraArrAnnee" %>
<%@ page import="bean.CGenUtil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
  UtilDB utildb=new UtilDB();
  Connection connection= utildb.GetConn();
  HetraArrAnnee[] lists=(HetraArrAnnee[]) CGenUtil.rechercherCritere(new HetraArrAnnee(), "1<2" , connection).getResultat();
  connection.close();
%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
  <title>Taxe Payée par arrondissement</title>
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
<div class="container">
<h1>Taxe Payée par arrondissement
</h1>
<br/>
  <table class="table table-hover">
    <thead>
    <tr>
      <th>Arrondissement</th>
      <th>Taxe à payer</th>
      <th>Taxe déjà payer</th>
      <th>Reste à payer</th>
      <th>Année</th>
    </tr>
    </thead>
    <tbody>
    <%
      for(HetraArrAnnee h : lists){
    %>
    <tr>
      <td><%=h.getNom_arrondissement()%></td>
      <td><%=h.getHetra_aloha()%>Ar</td>
      <td><%=h.getHetra_voaloha()%>Ar</td>
      <td><%=h.getReste()%>Ar</td>
      <td><%=h.getAnnee()%></td>
    </tr>

    <%
      }
    %>
    </tbody>
  </table>

</div>

</body>
</html>