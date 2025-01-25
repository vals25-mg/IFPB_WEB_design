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
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.css">
    <title>Taxe Payée par arrondissement</title>
</head>
<body>
<h1>Taxe Payée par arrondissement
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<div class="container">
    <table>
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