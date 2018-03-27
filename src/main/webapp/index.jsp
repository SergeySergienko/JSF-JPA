<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 20.07.2016
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<form action="/get" method="get" autocomplete="off">
    <fieldset>
        <legend>It is index.jsp</legend>
        Input id of car:<br> <input type="number" name="id" /><br>
        Input model of car:<br>
        <select name="pd">
            <option value=""></option>
            <option value="Toyota">Toyota</option>
            <option value="Honda">Honda</option>
            <option value="Mazda">Mazda</option>
        </select><br>
        Input color of car:<br>
        <select name="qd">
            <option value=""></option>
            <option value="green">green</option>
            <option value="red">red</option>
            <option value="blue">blue</option>
        </select><br>
        <input type="submit" value="Submit"/>
    </fieldset>
</form>
</body>
</html>
