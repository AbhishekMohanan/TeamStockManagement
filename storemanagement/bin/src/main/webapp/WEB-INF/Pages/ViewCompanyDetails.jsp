<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="view"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Company Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style>
h2 {
	text-align: center;
	
}

a:link, a:visited {
	color: white;
	text-align: center;
	text-decoration: none;
	display: inline-block;
}

a:hover, a:active {
	
}
body{
margin-top:10%;
}
.h1{
margin-left:16%;
}

table {
	width: 60%;
	margin-left:16%;
}

</style>	

</head>
<body>
 <%@include file="Dashboard.jsp"%>
	<div class="container my-2">
	<div class ="h1">
		<h1>Company List</h1>
		<br> <a href="CompanyAdd" class="btn btn-primary btn-sm mb-3"> Add
			Company </a>
</div>
		

		<view:if test="${companydetails.size()==0}">
			<h2>No Company Registered</h2>
		</view:if>

		<table border="1" class="table table-striped table-responsive-md">
			<thead>
				<tr>
					<th scope="col">Company ID</th>
					<th scope="col">Company Name</th>
					<th scope="col">Actions</th>                                                                                                         
				</tr>
			</thead>
			<view:forEach var="company" items="${companydetails}">
				<tr>
					<td>${company.getCompanyId()}</td>
					<td>${company.getCompanyName()}</td>
					
					<td>
						<button type="sumbit" class="btn btn-primary">
							<a href='/ce/${company.getCompanyId()}'>Edit</a>
						</button> &nbsp;&nbsp;&nbsp;
						<button type="sumbit" class="btn btn-danger">
							<a href='cd/${company.getCompanyId()}'> Delete</a>
						</button>
					</td>

				</tr>
			</view:forEach>



		</table>
	</div>
</body>
</html>
