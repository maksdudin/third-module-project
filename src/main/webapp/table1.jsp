<%--
  Created by IntelliJ IDEA.
  User: maks-
  Date: 13.08.2023
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Title</title>
    <style>
        table{
            border-collapse: collapse;<%--одинарная рамка для таблицы--%>
            width: 13%;<%--ширина таблицы--%>
            height: 12%;<%--высота таблицы--%>
        }
        th, td {
            border: 3px solid red;
        }
    </style>
</head>
<body>
<form action="answer" method="POST">

    <label class="form-label">${question1}</label>
    <ol>
        <li><input type="radio" name="answer" onclick="getAnswer('y')" value="y" checked>${question2}</li>
        <li><input type="radio" name="answer" onclick="getAnswer('n')" value="n">${question3}</li>

    </ol>
    <input type="submit" name="submit" value="Ответить">
</form>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<table>
    <td>
        <div style="line-height: 1 ">
        <p>Статистика:
            <br>
            Имя в игре: <em>${playerName}</em>
            <br>
            Количество игр: <em>${sessionNumber}</em>
            <br>
            выиграл: <em>${vin} раз</em>
            <br>
            проиграл: <em>${lose} раз</em>
        </p>

        </div>
    </td>
</table>



</body>
</html>
