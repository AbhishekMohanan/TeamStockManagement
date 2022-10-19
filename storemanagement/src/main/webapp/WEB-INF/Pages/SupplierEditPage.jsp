<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Supplier Details</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style>
	
	form{
	      text-align: center;
	      width:35%;
	      
	}
	body{
margin-top:8%;
}
	#body{
	text-align: center;
	padding-left: 550px;
	padding-top: 45px;
	}
	
	h2{
	 text-align: center;
	  padding-top: 10px;
	  margin-left:8%;
	 
	}
	
	button{
	width:15%;
	}
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"
	charset="utf-8"></script>

</head>
<body>
 <%@include file="Dashboard.jsp"%>
	<h2>Edit Supplier Details</h2>
	<div id="body">
		<form:form action="/updated" method="post"
			modelAttribute="supplierdetails">


			<div class="form-outline mb-4">
				<input type="text" name="student_name"
					value="${Editdetails.getSupplier_name()}" id="form4Example1"
					class="form-control" /> <label class="form-label"
					for="form4Example1">Supplier_ Name</label>
			</div>
			
				<div class="form-outline mb-4">
				<input type="text" name="student_name"
					value="${Editdetails.getMobile_no()}" id="form4Example1"
					class="form-control" /> <label class="form-label"
					for="form4Example1">Supplier Mobile Number</label>
			</div>
			
			<button type="submit" class="btn btn-primary btn-block mb-4">Update Details</button>

		</form:form>

	</div>
</body>
</html>