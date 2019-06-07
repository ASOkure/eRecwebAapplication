<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send a new e-REC Unique Id</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>



<div class= "container">
<form>
  
  <div class="form-group row">
  <h1>Send new e-REC Unique Id</h1>
    <label for="usr">Name:</label>
  <input type="text" class="form-control" id="usr">
    
     <label for="comment">Comment:</label>
      <textarea class="form-control" rows="5" id="comment" paceholder="Free Text"></textarea>
      
       
    </div>
     <a href="/sendEmail" class="btn btn-info btn-lg" action="/sendEmail">
          <span class="glyphicon glyphicon-envelope"></span> Send to All Centres
        </a>
  </div>
  
  </form>

</div>
 <a href="http://localhost:8080/SpringMVCHibernateManyToManyCRUDExample/home.jsp" class="previous">&laquo; Back</a>
<!--<a href="https://mvls-dsd.mvls.gla.ac.uk/erec/home" class="previous">&laquo; Back</a>-->
</body>
</html>