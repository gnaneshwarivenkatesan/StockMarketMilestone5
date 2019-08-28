<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css"href="css/styles.css">
<title>Stock</title>
</head>
<body>
<div class="container1">
                <div class="topnav">
                  <a class="active" href="#home">Stock Market <i class="fa fa-line-chart" style="color: black;"></i></a>
            <a href="/addCompany">Import Data</a>
            <a href="/addCompany">Manage Company</a>
            <a href="/stockExchange">Manage Exchange</a>
            <a href="/ipoDetails">Update IPO details</a>
             <a href="#logout">Logout</a>
        
            </div>
             <form:form class="form-horizontal" method="POST" action="/upload" modelAttribute="import">
            <div class="container">
                <h2 id="h">Import Excel</h2>

              <label id="label">
                  Select Excel file to be uploaded
              </label>
              <form:input class="col-sm-4"type="text" name="excelFile" id="excel"/>
              <input class="btn btn-warning"type="submit" value="Upload" name="upload"><br>
              
            </div >
           <div class="a1">
                <a id="a2" href="#">Click here to download sample Excel file</a>
               
           </div>
            </form:form>   
           
        </div><div class="copy">
            <footer><h5>Copyrights &copy 2019</h5></footer>
        </div>
</body>
</html>