<%-- 
    Document   : edit
    Created on : Dec 25, 2020, 8:50:14 PM
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
        <h1 style="text-align: center">Exam</h1>
        <hr>

        <form>
            <table>
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Degree</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${keymap.doctor}" var="doctor">
                        <tr>
                            <td>${doctor.id}</td>
                            <td>${doctor.name}</td>
                            <td>${doctor.degree}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </form>
    </body>
</html>
