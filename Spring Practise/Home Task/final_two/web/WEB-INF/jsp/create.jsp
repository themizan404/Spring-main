<%-- 
    Document   : create
    Created on : Dec 27, 2020, 9:11:29 AM
    Author     : mohdm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="height: 100px; width: 100%">
            <div style="height: 100px; width: 49%; float: left">
                <form action="/save" method="post">

                    Name:     <input type="text" name="name" /><br>
                    Salary:  <input type="number" name="salary" /><br>
                    Post:  <input type="text" name="post" /><br>
                    <input type="submit" value="Submit" />
                </form>

            </div>
            <div style="height: 100px; width: 49%; float: left">
                <form action="/update" method="post">

                    <input type="hidden" name="id" value="${pt.id}"/><br>
                    Name:     <input type="text" name="name" value="${pt.name}"/><br>
                    Salary:  <input type="number" name="salary" value="${pt.salary}"/><br>
                    Post:  <input type="text" name="post" value="${pt.post}"/><br>
                    <input type="submit" value="Update" />
                </form>

            </div>
        </div>
        <hr>
        <table>
            <thead>
                <tr>

                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Salary</th>
                    <th scope="col">Post</th>
                    <th scope="col">Action</th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${map.employee}" var="stu">


                    <tr>

                        <td>${stu.id}</td>
                        <td>${stu.name}</td>
                        <td>${stu.salary}</td>
                        <td>${stu.post}</td>
                        <td><a href="/edit/${stu.id}" ><input type="button"  value="Edit"/>
                            </a> <a href="/delete/${stu.id}" ><input type="button"  value="Delete"/></a></td>
                    </tr>

                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
