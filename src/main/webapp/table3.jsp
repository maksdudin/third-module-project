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


<form name="" action="restart" method="POST">
    <input type="submit"  value="Start agane">

</form>

</body>
</html>
