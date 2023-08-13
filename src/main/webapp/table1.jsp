<%--
  Created by IntelliJ IDEA.
  User: maks-
  Date: 13.08.2023
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<form action="action_form.php" method="POST">
    <p>Тут должен быть текст вопроса, какая-то перменная</p>
    <ol>
        <li><input type="radio" name="age" value="18" checked>а здесь какие-то переменные с ответами</li>
        <li><input type="radio" name="age" value="18-24">а здесь какие-то переменные с ответами</li>
        <li><input type="radio" name="age" value="25-34">а здесь какие-то переменные с ответами</li>
        <li><input type="radio" name="age" value="35-50">а здесь какие-то переменные с ответами</li>
    </ol>
    <input type="submit" name="submit" value="Ответить">
</form>
</body>
</html>
