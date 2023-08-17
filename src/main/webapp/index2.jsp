<%--
  Created by IntelliJ IDEA.
  User: maks-
  Date: 14.08.2023
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


<c:if test="true">
    <h1>CROSSES WIN</h1>
    <button onclick="restart()">Start again</button>
</c:if>
</body>
</html>
