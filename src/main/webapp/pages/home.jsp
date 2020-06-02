<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<style> body { padding: 2% 7% 7% 7% }</style>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h2 class="d-flex justify-content-center">Rechercher des offres</h2>
	<form class="form-inline d-flex justify-content-center" action="/search" method="POST">
  		<div class="form-group mx-sm-3 mb-2">
    		<label class="sr-only">Titre</label>
    		<input type="text" name="title" class="form-control">
  		</div>
  		<div class="form-group mx-sm-3 mb-2">
    		<label class="sr-only">Date de début</label>
    		<input type="date" name="startDate" class="form-control">
  		</div>
  		<div class="form-group mx-sm-3 mb-2">
    		<label class="sr-only">Ville</label>
    		<select name="city" class="form-control">
        		<c:forEach var="location" items="${locations}">
            		<option value="${location}">${location}</option>
        		</c:forEach>    
        	</select>
  		</div>
  		<button type="submit" class="btn btn-primary mb-2">Rechercher</button>
	</form>
</body>
</html>