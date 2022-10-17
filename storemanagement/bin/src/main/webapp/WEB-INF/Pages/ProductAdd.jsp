<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	<style >
	
	form{
	      text-align: center;
	      width:35%;
	}
	
	#body{
	text-align: center;
	padding-left: 520px;
	padding-top: 45px;
	}
	
	h2{
	 text-align: center;
	  padding-top: 10px;
	 
	}
	
	button{
	width:15%;
	}
	</style>
	
	
</head>
<body >

   <h2> Add Student Details</h2>
	<div id = "body">
	<form action="/added" method="post" modelAttribute ="studentdetails">

  <div class="form-outline mb-4">
    <input type="text"  name="student_name" id="form4Example1" class="form-control" />
    <label class="form-label" for="form4Example1">Name</label>
  </div>


  <div class="form-outline mb-4">
				<input type="password" name="student_password" id="form4Example2"
					class="form-control" /> <label class="form-label" for="form4Example2">Password</label>
  </div>
  
    <div class="form-outline mb-4">
    <input type="Text" name="branch" id="form4Example2" class="form-control" />
    <label class="form-label" for="form4Example2">Branch</label>
  </div>


  <button type="submit" class="btn btn-primary btn-block mb-4">Register</button>
</form>
</div>
</body>
</html>