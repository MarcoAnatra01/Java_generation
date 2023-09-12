<%@page import="model.Prodotto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Prodotti</h1>
	
	<%
	// servscript
	
	Prodotto p = new Prodotto();
	p.nome = "giacca";	
	
	%>
		
	<h2><% out.print(p);
	
	// al posto di out.print(p), si può mettere anche solo =p
	 %></h2>
</body>
</html>