<%--
  Created by IntelliJ IDEA.
  User: maks-
  Date: 14.08.2023
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Third</title>
    <link href="static/main.css" rel="stylesheet">
    <<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<script>
    function restart() {

        $.ajax({
            url: '/restart',
            type: 'POST',
            contentType: 'application/json;charset=UTF-8',
            async: false,
            success: function () {
                location.reload(); <!--method reloads the current URL, like the Refresh button. -->
            }
        });
    }
</script>

<h2>${badChoise}</h2>
<br>
<h2>${resume}</h2>
<br>
<br>
<br>
<br>
<br>
<br>
<hr>


<button onclick="restart()">Start again</button> <!--кнопка не работает, хотя точно так же в прошлом проекте работала-->
</body>
</html>
