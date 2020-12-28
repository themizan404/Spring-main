<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Management</title>
    </head>

    <body>
        <jsp:include page="/WEB-INF/jsp/common/header.jsp"/>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Action 1</th>
                    <th>Action 2</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <a href="/employee/create" style="color: darkorange">Create Employee</a>
                    </td>
                    <td>
                        <a href="/employee/view1" style="color: fuchsia">View Employees</a>
                    </td>
                </tr>
            </tbody>
        </table>
        <jsp:include page="/WEB-INF/jsp/common/footer.jsp"/>    
    </body>
</html>
