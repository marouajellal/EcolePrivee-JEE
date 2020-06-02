<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <h1>Register</h1>
    
<form method="POST" action="/registering">
  <input type="hidden"  value="${idSession}" name="idSession">
  <div class="form-group">
    <label>Nom</label>
	<input class="form-control" type="text" name="nom">
  </div>
  <div class="form-group">
    <label>Prenom</label>
	<input class="form-control" type="text" name="prenom">
  </div>
  <div class="form-group">
    <label>Adresse</label>
    <input class="form-control" type="text" name="adresse">
  </div>
  <div class="form-group">
    <label>Telephone</label>
    <input class="form-control" type="text" name="telephone">
  </div>
  <div class="form-group">
    <label>Email</label>
    <input class="form-control" type="email" name="email"><br>
  </div>
  <input class="btn btn-primary" type="submit" value="s'inscrire">
</form>

</body>
</html>