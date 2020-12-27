<%-- 
    Document   : view
    Created on : Dec 25, 2020, 9:05:08 PM
    Author     : fmrasel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student List</h1>
        <table class="table">
  <thead>
    <tr>
      
      <th scope="col">Name</th>
      <th scope="col">Address</th>
      
    </tr>
  </thead>
  <tbody>
      <c:forEach items="${map.students}" var="stu">
          
      
    <tr>
      
      <td>${stu.name}</td>
      <td>${stu.address}</td>
      
    </tr>
   
    </c:forEach>
  </tbody>
</table>
    </body>
</html>
