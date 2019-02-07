<%-- 
    Document   : index
    Created on : 31 Jan, 2019, 12:27:32 PM
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
        <h1>Hello World!</h1>
        <a href="${pageContext.request.contextPath}/test/hello">Hello</a><br/>
        <a href="${pageContext.request.contextPath}/api/employees">Employees</a>

        <a href="${pageContext.request.contextPath}/test/parth">PARTH</a>
    </body>
</html>
