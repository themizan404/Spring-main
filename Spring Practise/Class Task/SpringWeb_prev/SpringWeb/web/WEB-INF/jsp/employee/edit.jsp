<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Create</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <span></span><br><br>
        <div class="row">
            <div class="col-md-12">
                <div class="col-md-4">
                    <h3 style="color: dodgerblue">${editTitle}</h3>
                    <form action="/employee/update" method="post">
                        <div class="form-group">
                            <label for="id">ID : </label>
                            <input type="text" class="form-control" id="id" placeholder="Enter ID" name="id" value="${emp.id}">
                        </div>
                        <div class="form-group">
                            <label for="name">Name : </label>
                            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name" value="${emp.name}">
                        </div>
                        <div class="form-group">
                            <label for="salary">Salary : </label>
                            <input type="text" class="form-control" id="salary" placeholder="Enter salary" name="salary" value="${emp.salary}">
                        </div>
                        <div class="form-group">
                            <label for="nid">NID : </label>
                            <input type="text" class="form-control" id="nid" placeholder="Enter NID" name="nid" value="${emp.nid}">
                        </div>
                        <div class="form-group">
                            <label for="area">Area : </label>
                            <input type="text" class="form-control" id="area" placeholder="Enter area" name="area" value="${emp.area}">
                        </div>
                        <div class="form-group">
                            <label for="city">Select City : </label>
                            <select class="form-control" id="city" name="city">
                                <option value="${emp.city}" selected="selected">${emp.city}</option>
                                <option value="Dhaka">Dhaka</option>
                                <option value="Chittagong">Chittagong</option>
                                <option value="Sylhet">Sylhet</option>
                                <option value="Khulna">Khulna</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-default">Update</button>
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
                            <tr>
                                <td>${emp.id}</td>
                                <td>${emp.name}</td>
                                <td>${emp.salary}</td>
                                <td>${emp.nid}</td>
                                <td>${emp.area}</td>
                                <td>${emp.city}</td>
                                <td>
                                    <a href="/employee/delete/${emp.id}" style="color: red">Delete</a>
                                </td>
                            </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</html>
