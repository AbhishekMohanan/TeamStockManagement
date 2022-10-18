<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="view"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page</title>
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
</style>

</head>
<body>
	<div class="container my-2">
		<h1>Student List</h1>
		<br> <a href="form" class="btn btn-primary btn-sm mb-3"> Add
			Student </a>

		<h2></h2>

		<view:if test="${studentdetails.size()==0}">
			<h2>No Students Registered</h2>
		</view:if>

		<table border="1" class="table table-striped table-responsive-md">
			<thead>
				<tr>
					<th scope="col">Student ID</th>
					<th scope="col">Student Name</th>
					<th scope="col">Student Password</th>
					<th scope="col">Branch</th>
					<th scope="col">Actions</th>

				</tr>
			</thead>
			<view:forEach var="student" items="${studentdetails}">
				<tr>
					<td>${student.getStudentId()}</td>
					<td>${student.getStudent_name()}</td>
					<td>${student.getStudent_password()}</td>
					<td>${student.getBranch()}</td>
					<td>
						<button type="sumbit" class="btn btn-primary">
							<a href='/e/${student.getStudentId()}'>Edit</a>
						</button> &nbsp;&nbsp;&nbsp;
						<button type="sumbit" class="btn btn-danger">
							<a href='delete/${student.getStudentId()}'> Delete</a>
						</button>
					</td>

				</tr>
			</view:forEach>



		</table>
	</div>
</body>
</html>
