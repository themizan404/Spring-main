<%-- 
    Document   : create
    Created on : Dec 26, 2020, 11:32:51 PM
    Author     : mohdm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <hr>
        <div style="height: 200px; width: 100%">
            <div style="width: 49%; float: left" >
                <form action="/save" method="post">
                    <input type="text" name="name" placeholder="Name"/>
                    <input type="text" name="address" placeholder="Address"/>
                    <input type="submit" value="Submit"/>
                </form>

            </div>
            <div style="width: 49%; float: left" ></div>


            <form action="/update" method="post">
                <input type="hidden" name="id" value="${pt.id}"/>
                <input type="text" name="name" value="${pt.name}"/>
                <input type="text" name="address" value="${pt.address}"/>

                <input type="submit" value="Update"/>
            </form>

        </div>
        <hr/>

        <div>
            <h1>Student List</h1>
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>

                        <th scope="col">Name</th>
                        <th scope="col">Address</th>
                        <th scope="col">Action</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.patients}" var="stu">


                        <tr>

                            <td>${stu.name}</td>
                            <td>${stu.address}</td>
                            <td><a href="/edit/${stu.id}" ><input type="button" class="btn btn-info" value="Edit"/>
                                </a> <a href="/delete/${stu.id}" ><input type="button" class="btn btn-danger" value="Delete"/></a></td>
                        </tr>

                    </c:forEach>
                </tbody>
            </table>

        </div>

    </body>
</html>
