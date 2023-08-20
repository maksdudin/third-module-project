<%--
  Created by IntelliJ IDEA.
  User: maks-
  Date: 14.08.2023
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
  <title>third_module_project</title>
  <link href="static/main.css" rel="stylesheet">
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>

<div style="line-height: 1.1 ">
  <p style="font-size: 18px">
    не не не... ввести что-то нужно, какое-нибудь имя, или  типа того
    <br>
    Так что вперед!
  </p>
</div>

<!-- значит вот это внизу форма отправки имени пользователя по нажатию кнопки submit в сервлет loginServlet-->
<form name="Player form" action="login" method="POST">
  <input type="text" name="firstname" >
  <input type="submit"  value="Представиться">
  </p>
</form>

</body>
</html>
