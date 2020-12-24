<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p id="el1">Element 1</p>
        <p id="el2">Element 2</p>
        <input type="button" value="Click Me" id="btnClick"/>
        <table class="table table-hover" id="tbl">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
            $("#btnClick").click(function () {
                console.log("clicked");
                $("#el1").hide();
            });

            var tblData = "<tr>";
                tblData += "<td>id1</td>";
                tblData += "<td>name1</td>";

            for (var i = 0; i < 5; i++) {
                $("#tbl tbody").append(tblData);
            }
        </script>
    </body>
</html>
