 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<style> body { padding: 2% 7% 7% 7% }</style>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
	<title>DataTables example - Bootstrap 4</title>
	
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
	<script type="text/javascript" class="init">
		$(document).ready(function() {
		$('#example').DataTable();
		} );
	</script>
</head>
<body>
	<jsp:include page="home.jsp"></jsp:include>
		<table id="example" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr>
                <th>Date de début</th>
                <th>Date de la fin</th>
                <th>Nom du formation</th>
                <th>Taux de remplissage</th>
                <th>Inscription</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="session" items="${sessions}">
            <tr>
            	<td>
            		<script type="text/javascript">
            			var str = '${session.startDate}';
            			if(str.length > 10) str = str.substring(0,10);
            			document.write(str);
            		</script>
            	</td>
            	<td>
            		<script type="text/javascript">
            			var str = '${session.endDate}';
            			if(str.length > 10) str = str.substring(0,10);
            			document.write(str);
            		</script>
            	</td>
            	<td>${session.course.title }</td>
            	<td>
            		<script type="text/javascript">
            			var taux = parseInt(${session.taux})*100;
            			var max = parseInt(${session.max});
            			t=parseInt(taux/max);
            			document.write(t+"%");
            			document.getElementById("${session.id}").disabled = true;
            		</script> 
            	</td>
            	<td>
            		<form action="/register" method="POST">
            			<input type="hidden" name="idSession" value="${session.id}">
            			<input id="${session.id}" type="submit" class="btn btn-primary" value="s'inscrire">
  					</form>
  					<script type="text/javascript">
            			var taux = parseInt(${session.taux})*100;
            			var max = parseInt(${session.max});
            			if(t==100) document.getElementById("${session.id}").disabled = true;
            		</script> 
				</td>
            </tr>
        	</c:forEach> 
        </tbody>
        <tfoot>
            <tr>
                <th>Date de début</th>
                <th>Date de la fin</th>
                <th>Nom du formation</th>
                <th>Taux de remplissage</th>
                <th>Inscription</th>
            </tr>
        </tfoot>
    </table>   
		
</body>
</html>