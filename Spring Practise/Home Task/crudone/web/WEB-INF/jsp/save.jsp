<%-- 
    Document   : save
    Created on : Dec 23, 2020, 11:26:43 PM
    Author     : mohdm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/save" method="Post">
            Id <input type="number" name="id" />
            <br>
            Name <input type="text" name="name" />
            <br>
            Address <input type="text" name="subject" />
            <br>
            <input type="submit" value="Save"/>
        </form>


    </body>
</html>
