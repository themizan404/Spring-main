
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Create</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <!--        <span></span><br><br>-->

        <jsp:include page="/WEB-INF/jsp/common/header.jsp" />
        <div class="row">
            <div class="col-md-12">
                <div class="col-md-4">
                    <label id="lbl"></label>
                    <h6>${map.error}</h6><h6>${map.error1}</h6><h6>${map.found}</h6>
                    <h2>${map.success}</h2><br>
                    <h3 style="color: deeppink">Create Employee</h3>
                    <form>
                        <div class="form-group">
                            <label for="id">ID : </label>
                            <input type="text" class="form-control" id="id" placeholder="Enter ID" name="id">
                        </div>
                        <div class="form-group">
                            <label for="name">Name : </label>
                            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
                        </div>
                        <div class="form-group">
                            <label for="salary">Salary : </label>
                            <input type="text" class="form-control" id="salary" placeholder="Enter salary" name="salary">
                        </div>
                        <div class="form-group">
                            <label for="nid">NID : </label>
                            <input type="text" class="form-control" id="nid" placeholder="Enter NID" name="nid">
                        </div>
                        <div class="form-group">
                            <label for="area">Area : </label>
                            <input type="text" class="form-control" id="area" placeholder="Enter area" name="area">
                        </div>
                        <div class="form-group">
                            <label for="city">Select City : </label>
                            <select class="form-control" id="city" name="city">
                                <option value="Dhaka">Dhaka</option>
                                <option value="Chittagong">Chittagong</option>
                                <option value="Sylhet">Sylhet</option>
                                <option value="Khulna">Khulna</option>
                            </select>
                        </div>
                        <button type="button" class="btn btn-default" id="btnSave">Submit</button>
                    </form>
                </div>
                <div class="col-md-8">
                    <h3 style="color: seagreen">View Employees</h3>
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
                            <c:forEach items="${map.empList}" var="emp">
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
        <jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
        <script>
            $("#btnSave").click(function () {
                console.log("logged");

                if ($("#name").val() === "abc") {
                    $("#lbl").text("value is abc");
                } else {
                    $("#lbl").text("value is not abc");

//                     $.ajax({
//                    url: '/emp/save',
//                    type: 'POST',
//                    data: {
//                        'id': $("#code").val(),
//                        'name': $("#name").val(),
//                        'salary': $("#salary").val(),
//                        'nid': $("#nid").val(),
//                        'area': $("#area").val(),
//                        'city': $("#city").val()
//                    },
//                    dataType: 'json',
//                    success: function (data, textStatus, jqXHR) {
//                        console.log(data);
//                    }
//                })

                }


            });

        </script>
    </body>
</html>
