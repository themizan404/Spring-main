<%-- 
    Document   : create
    Created on : Dec 14, 2020, 6:25:12 PM
    Author     : Faculty Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
    </head>
    <body>
        <h1>Craete  Product</h1>
<!--        <a href="/product/edit">Edit</a>-->

<form action="/product/save" method="POST">
    <input type="text" name="productCode"/> <br>
    <input type="text" name="productName"/>
    <input type="submit" value="Create" />
</form>

<a href="/product/view">View All</a>
    </body>
</html>
