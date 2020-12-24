<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/new" method="post">
            <input type="text" name="name"/>
            <input type="text" name="address"/>
            <input type="submit" value="Submit"/>
        </form>
        <br>
        ${name}
        ${address}
    </body>
</html>
