<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="controleur.php" method="post">
        Mot Cle: <input type="text" name="motCle" value="${modele.motCle}">
        <input type="submit" value="OK">
    </form>
<table border="1" width="80%">

    <tr>
        <th>ID </th><th>NOM </th><th>PRIX </th>
    </tr>
    <c:forEach items="${modele.produits}" var="p">
        <tr>
            <td>${p.idProduit}</td>
            <td>${p.nomProduit}</td>
            <td>${p.prix}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
