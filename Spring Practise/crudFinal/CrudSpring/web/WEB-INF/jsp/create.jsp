<%-- 
    Document   : create
    Created on : Dec 25, 2020, 8:21:15 PM
    Author     : fmrasel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <h1>Create Section</h1>
        
        <form action="/save" method="post">
            
            Name:<input type="text" name="name" value=""/>
            Adress:<input type="text" name="address" value=""/>
            <input type="submit" value="Save" /> 
        </form>
        <hr>
        
            <h1>Update Section</h1>
            <form action="/update" method="post">
                <input type="hidden"   name="id" value="${st.id}">
                 Name:<input type="text" name="name" value="${st.name}"/>
            Adress:<input type="text" name="address" value="${st.address}"/>
                <input type="submit" value="Update"/>
            </form>
        
        <hr/>
        
        <div>
            <h1>Student List</h1>
        <table class="table table-bordered table-striped">
  <thead>
    <tr>
      
      <th scope="col">Name</th>
      <th scope="col">Address</th>
      <th scope="col">Delete</th>
      
    </tr>
  </thead>
  <tbody>
      <c:forEach items="${map.students}" var="stu">
          
      
    <tr>
      
      <td>${stu.name}</td>
      <td>${stu.address}</td>
      <td><a href="/edit/${stu.id}" ><input type="button" class="btn btn-info" value="Edit"/></a> <a href="/delete/${stu.id}" ><input type="button" class="btn btn-danger" value="Delete"/></a></td>
    </tr>
   
    </c:forEach>
  </tbody>
</table>
            
        </div>
    </body>
</html>
