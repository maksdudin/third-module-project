<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>third_module_project</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h1>Пролог</h1>
<div style="line-height: 1.1 ">
    <p style="font-size: 18px">
    Ты стоишь в космическом порту и готов подняться на борт
    <br>
    своего корабля. Разве ты не об это мечтал? Стать капитаном
    <br>
    галактического судна с экипажем, который будет совершать
    <br>
    подвиги под твоим командованием.
    <br>
    Так что вперед!
    </p>
</div>
<h1  style="line-height: 1.5">Знакомство с экипажем</h1>
<div style="line-height: 1.1 ">
    <p style="font-size: 18px">
        Когда ты поднялся на борт корабля, тебя поприветствовала девушка
        <br>
        с чёрной папкой в руках:
        <br>
        - Здравствуйте командир! Я Марина - ваша помошница. Видите там в углу
        <br>
        пьёт кофе наш штурман - сержант Перегар, под штурвалом спит наш
        <br>
        борт механик Черный Богдан, а фотографирует его Сергей Пятка - наш навигатор.
        <br>
        А как обращаться к вам?
    </p>
</div>
<form action="action_form.php" method="POST">
        <input type="text" name="firstname" value="">
        <input type="submit" name="firstname" VALUE="Представиться">
    </p>
</form>

<form action="action_form.php" method="POST">
    <p> Тут должен быть текст вопроса</p>
    <ol>
        <li><input type="radio" name="age" value="18" checked>до 18 включительно</li>
        <li><input type="radio" name="age" value="18-24">от 18 до 24</li>
        <li><input type="radio" name="age" value="25-34">от 25 до 35</li>
        <li><input type="radio" name="age" value="35-50">более 35</li>
    </ol>
    <input type="submit" name="submit" value="Ответить">
</form>

<button type="submit">Я кнопка отправки формы</button>



</body>