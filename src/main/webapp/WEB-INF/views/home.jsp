<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <style type="text/css">
  
  .previous {
  background-color: #f1f1f1;
  color: black;
}
  
  </style>
</head>

<body>



 
<div class="container">

<h1>  e-REC  Web Portal</h1> <br>
 
 <div class="row">
 <div class="col-sm-4">
 <div class="panel panel-primary">
      <div class="panel-heading">User Management</div>
 <!-- test  <div class="panel-body"> <a href="http://localhost:8080/SpringMVCHibernateManyToManyCRUDExample/newuser"> Users </a></div>-->
 <div class="panel-body"> <a href="https://mvls-dsd.mvls.gla.ac.uk/erec/newuser"> Users </a></div>
      
      
    
    </div>
</div>
 <div class="col-sm-4">
    <div class="panel panel-success">
      <div class="panel-heading">Send a new e-REC Id</div>
  <div class="panel-body">  <a href="http://localhost:8080/SpringMVCHibernateManyToManyCRUDExample/senderecuniqueid"> Send Unique Id</a></div> 
  <!-- test      <div class="panel-body">  <a href="https://mvls-dsd.mvls.gla.ac.uk/erec/senderecid"> Send Unique Id</a></div>-->
    </div>
</div>
 <div class="col-sm-4">
    <div class="panel panel-info">
      <div class="panel-heading">Centre Management</div>
      <div class="panel-body">Centres</div>
    </div>
</div>
    </div>
</div>

</body>
</html>
    