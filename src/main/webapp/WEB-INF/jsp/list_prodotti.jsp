<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista Categorie</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nome</th>
    </tr>
    </thead>
    <tbody>
    <jsp:useBean id="prodotti" scope="request" type="java.util.List<psw.psw2024.model.Prodotto>"/>
    <c:forEach items="${prodotti}" var="prod">
        <tr>
            <td>${prod.id}</td>
            <td>${prod.nome}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>