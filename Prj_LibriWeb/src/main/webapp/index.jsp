<%@page import="model.Libro"%>
<%@page import="presentation.MVCController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% MVCController controller = new MVCController();  %>

	<h1>Libri dal db</h1>

	<!-- <a href="provami">Add canzone</a> -->

	<table>
	  <tr>
	    <th>id</th>
	    <th>Titolo</th>
	    <th>Prezzo</th>
	    <th>n Pagine</th>
	  </tr>
	  
	  <% for (Libro l : controller.mostraLibri()){ %>
	  
		  <tr>
		  	<td><%= l.getId() %></td>
		    <td> <a target="_blank" href="https://www.google.com/search?q=<%= l.getTitolo() %>"><%= l.getTitolo() %></a> </td>
		    <td><%= l.getPrezzo() %></td>
		    <td><%= l.getPagine() %></td>
		  </tr>
	  
	  <% } %>
	</table>

</body>
</html>