<%@ page import="DAO.StudentOperation" %>
<%@ page import="Bean.Student" %><%--
  Created by IntelliJ IDEA.
  User: archi
  Date: 01-04-2020
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Student Details</title>
    <%@include file="../common/commonlinks.jsp"%>
</head>
<body>

<div class="container">
    <form method="post" action="/AdminPanel/UpdateStudent?id=${st.getS_id()}">
        <fieldset class="form-group">
            <label>Name</label>
            <input type="text" name="name" value="${st.getName()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Address</label>
            <input type="text" name="address" value="${st.getAddress()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Contact</label>
            <input type="text" name="contact" value="${st.getContact()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Admission Date</label>
            <input type="text" name="admission_date" value="${st.getAdmission_date()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Fees</label>
            <input type="text" name="fees" value="${st.getFees()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Course</label>
            <input type="text" name="course" value="${st.getCourse()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Username</label>
            <input type="text" name="username" value="${st.getUsername()}" class="form-control"/>
        </fieldset>
        <fieldset class="form-group">
            <label>Password</label>
            <input class="form-control" type="password" value="${st.getPassword()}" name="password"/>
        </fieldset>
        <button type="submit" class="btn btn-success">Update Details</button>
    </form>
</div>
</body>
</html>
