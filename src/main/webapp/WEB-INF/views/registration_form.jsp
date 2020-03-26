<%--
  Created by IntelliJ IDEA.
  User: archi
  Date: 26-03-2020
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>
<h1>Enter The Details Below To Register</h1>
    <form action="/register" method="post">
        <span>Enter The Name :<input required name="name" type="text"/></span>
        <span>Enter The Address :<input required name="address" type="text"/></span>
        <span>Enter The Contact :<input required name="contact" type="text"/></span>
        <span>Enter The Admission Date :<input required name="admission_date" type="date"/></span>
        <span>Enter The Fees :<input required name="fees" type="text"/></span>
        <span>Enter The Course :<input required name="course" type="text"/></span>
        <span>Enter The Username :<input required name="username" type="text"/></span>
        <span>Enter The Password :<input required name="password" type="password"/></span>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
