<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 1/5/2023
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Form Create</title>
</head>
<body>
<h1>Form Create</h1>
<form action="/createStudent" method="post">
  <input name="id" placeholder="nhập id" ><br>
  <input name="name" placeholder="nhập name" ><br>
  <input name="dateOfBirth" placeholder="nhập ngày sinh YYYY-MM-DD" ><br>
  <input name="address" placeholder="nhập address" ><br>
  <input name="phone" placeholder="nhập phone" ><br>
  <input name="email" placeholder="nhập email" ><br>
  <input name="classroom" placeholder="nhập classroom" ><br>
  <button type="submit">Create</button>
</form>
</body>
</html>
