<%-- 
    Document   : create
    Created on : Jul 19, 2020, 11:56:37 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainee Create</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <span></span><br><br>
        <div class="row">
            <div class="col-md-12">
                <div class="col-md-4">
                    <h6>${err}</h6><br>
                    <p>${obj}</p>
                    <h3 style="color: deeppink">${createTitle}</h3>
                    <form action="/trainee/store" method="post">
                        <div class="form-group">
                            <label for="id">Code : </label>
                            <input type="text" class="form-control" id="code" placeholder="Enter Code" name="code">
                        </div>
                        <div class="form-group">
                            <label for="name">Name : </label>
                            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
                        </div>
                        <div class="form-group">
                            <label for="round">Round : </label>
                            <input type="text" class="form-control" id="round" placeholder="Enter round" name="round">
                        </div>
                        <div class="form-group">
                            <label for="date">Join Date : </label>
                            <input type="date" class="form-control" id="date" placeholder="Enter Date" name="date">
                        </div>
                        <div class="form-group">
                            <label for="salary">Salary : </label>
                            <input type="text" class="form-control" id="salary" placeholder="Enter course" name="salary">
                        </div>
                        <div class="form-group">
                            <label for="course">Course : </label>
                            <input type="text" class="form-control" id="course" placeholder="Enter course" name="course">
                        </div>
                        <div class="form-group">
                            <label for="email">Email : </label>
                            <input type="text" class="form-control" id="email" placeholder="Enter email" name="email">
                        </div>
                        <div class="form-group">
                            <label for="address">Address : </label>
                            <input type="text" class="form-control" id="address" placeholder="Enter address" name="address">
                        </div>

                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
                <div class="col-md-8">
                    <h3 style="color: seagreen">${viewTitle}</h3>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Salary</th>
                                    <th>NID</th>
                                    <th>Area</th>
                                    <th>City</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                    <c:forEach items="${mapList.empList}" var="emp">
                        <tr>
                            <td>${emp.id}</td>
                            <td>${emp.name}</td>
                            <td>${emp.salary}</td>
                            <td>${emp.nid}</td>
                            <td>${emp.area}</td>
                            <td>${emp.city}</td>
                            <td>
                                <a href="/employee/edit/${emp.id}" style="color: forestgreen">Edit</a>
                                <a href="/employee/delete/${emp.id}" style="color: red">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
                </div>
            </div>
        </div>


        <script>
            $("#btnSave").click(function () {
                console.log("logged");

                $.ajax({
                    url: '/trainee/store',
                    type: 'POST',
                    data: {
                        'code': $("#code").val(),
                        'name': $("#name").val()
                    },
                    dataType: 'json',
                    success: function (data, textStatus, jqXHR) {
                        console.log(data);
                    }
                })
            });

        </script>
    </body>
</html>
