<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 1/4/2023
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Edit</title>
</head>
<body>
<h1>Form Edit</h1>
<form action="/edit" method="post">
    <input name="id" placeholder="nhập id" value="${student.id}" readonly><br>
    <input name="name" placeholder="nhập name" value="${student.name}"><br>
    <input name="dateOfBirth" placeholder="nhập ngày sinh" value="${student.dateOfBirth}"><br>
    <input name="address" placeholder="nhập address" value="${student.address}"><br>
    <input name="phone" placeholder="nhập phone" value="${student.phone}"><br>
    <input name="email" placeholder="nhập name" value="${student.email}"><br>
    <input name="classroom" placeholder="nhập name" value="${student.classroom}"><br>
    <button type="submit">Update</button>
</form>
</body>
</html>
