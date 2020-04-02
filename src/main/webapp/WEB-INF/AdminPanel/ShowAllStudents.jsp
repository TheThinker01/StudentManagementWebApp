<%@ page import="DAO.StudentOperation" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ListIterator" %>
<%@ page import="Bean.Student" %><%--
  Created by IntelliJ IDEA.
  User: archi
  Date: 01-04-2020
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all students</title>
<%@include file="../common/commonlinks.jsp"%>
    <style>
        .update,.delete{
            border-radius:10px ;
            padding: 5px;
        }
        .update{
            border: thin solid green;
        }
        .delete{
            border: thin solid red;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="alert-primary mb0"> <h3>${message}</h3> </div>
        <table class="table table-hover ">
            <thead class="thead">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Address</th>
                <th scope="col">Contact</th>
                <th scope="col">Username</th>
                <th scope="col">Password</th>
                <th scope="col">Fees</th>
                <th scope="col">Admission Date</th>
                <th scope="col">
                    <form method="post" action="/AdminPanel/showallstudents.do">
                    <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search By Name" name="search">
                        <div class="input-group-append">
                            <button class="btn btn-success" type="submit">Go</button>
                        </div>
                    </div>
                    </form>
                </th>
            </tr>
            </thead>
            <tbody>
<%--            <%--%>
<%--                StudentOperation sts =new StudentOperation();--%>
<%--                List res  = (sts.selectAllStudents());--%>
<%--                ListIterator it = res.listIterator();--%>
<%--                while(it.hasNext()){--%>
<%--                    Student st =(Student) it.next();--%>
<%--                    %>--%>
            <c:forEach items="${it}" var="st">
            <tr>
                <th scope="row">${st.getS_id()}</th>
                <td>${st.getName()}</td>
                <td>${st.getAddress()}</td>
                <td>${st.getContact()}</td>
                <td>${st.getUsername()}</td>
                <td>${st.getPassword()}</td>
                <td>${st.getFees()}</td>
                <td>${st.getAdmission_date()}</td>
                <td ><a class="update" href="/AdminPanel/UpdateStudent?id=${st.getS_id()}" >Update</a></td>
                <td ><a class="delete" href="/AdminPanel/DeleteStudent?id=${st.getS_id()}">Delete</a></td>
            </tr>
            </c:forEach>

            <tr></tr>
            </tbody>
        </table>
    </div>
</body>
</html>
