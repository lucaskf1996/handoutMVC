<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.*,br.edu.insper.mvc.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Pessoas</title>
</head>
<body>
<table border='1'>
<c:forEach var="pessoa" items="${pessoas}">
<tr>
<th>Nome</th>
<th>Idade</th>
<th>Dias</th>
</tr>
<tr>
<td>${pessoa.name}</td>
<td>${pessoa.idade}</td>
<td>${pessoa.idade * 365}</td>
</tr>
</c:forEach>
</table>
</body>
</html>