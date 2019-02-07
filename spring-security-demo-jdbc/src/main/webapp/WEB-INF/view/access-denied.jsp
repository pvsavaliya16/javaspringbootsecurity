<%-- 
    Document   : access-denied
    Created on : 6 Feb, 2019, 3:10:21 PM
    Author     : parth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You are not allowed to access this page!!!</h1>
        <hr/>
        <a href="${pageContext.request.contextPath}/">Back to Home</a>
    </body>
</html>
