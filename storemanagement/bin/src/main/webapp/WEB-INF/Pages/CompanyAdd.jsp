<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Company Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	<style >
	
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
	
	
</head>
<body >
 <%@include file="Dashboard.jsp"%>
<h2> Add Company Details</h2>
	<div id = "body">
	<form action="/companyadded" method="post" modelAttribute ="companydetails">

  <div class="form-outline mb-4">
    <input type="text"  name="companyName" id="form4Example1" class="form-control" />
    <label class="form-label" for="form4Example1"> Company Name</label>
  </div>


  <button type="submit" class="btn btn-primary btn-block mb-4">Add Company</button>
</form>
</div>
</html>