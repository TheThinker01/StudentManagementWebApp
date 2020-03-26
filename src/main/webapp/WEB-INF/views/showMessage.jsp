<%--
  Created by IntelliJ IDEA.
  User: archi
  Date: 26-03-2020
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Site Says..</title>
<%--    <%@include file="../common/commonlinks.jsp"%>--%>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.css" rel="stylesheet">

</head>
<body>
    <div class="container">
        <div class="alert alert-${mtype}" role="alert">
            <h4 class="alert-heading">${heading}</h4>
            <p>${message}</p>
            <hr>
            <p class="mb-0"><button class="btn btn-primary">HOME</button></p>
        </div>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.js"></script>

</body>
</html>
