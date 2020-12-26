<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <script>
            function deleteStudent(sid) {
                if (confirm('Do you want to delete this product?')) {
                    var url = 'delete/' + sid;
                    window.location.href = url;
                }
            }
        </script>
    </head>

    <body>
        <c:url var="action" value="/student/add" ></c:url>
        <form:form method="POST" action="%{action}" commandName="student">
            <table>
                <c:if test="${! empty student.name}">
                    <tr>
                        <td>
                            <form:label path="id"></form:label>
                            <spring:message code="label.id"/>
                        </td>
                        <td> 
                            <form:input path="id"/>
                        </td>
                    </tr>
                </c:if>
                <tr>
                    <td>
                        <form:label path="name"></form:label>
                        <spring:message code="label.name"/>
                    </td>
                    <td> 
                        <form:input path="name"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="subject"></form:label>
                        <spring:message code="label.subject"/>
                    </td>
                    <td> 
                        <form:input path="subject"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <c:if test="${! empty student.name}">
                            <input type="submit" value="<spring:message code="label.editstudent"/>"/>
                        </c:if>
                        <c:if test="${ empty student.name}">
                            <input type="submit" value="<spring:message code="label.addstudent"/>"/>
                        </c:if>
                    </td>

                </tr>
            </table>
        </form:form>
        <h3>List Student</h3>
        < c:if test="${! empty studentList}">
        <table>
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Subject</td>
            </tr>
            <c:forEach items="${studentList}" var="s">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
                    <td>${s.subject}</td>
                    <td><a href="/edit/${s.id}">Edit</a>
                        <a href="#" onclick="javascipt:deleteStudent(${s.id})">Delete</a>
                    </td>

                </tr>

            </c:forEach>
        </table>
    </c:if>

</body>
</html>
