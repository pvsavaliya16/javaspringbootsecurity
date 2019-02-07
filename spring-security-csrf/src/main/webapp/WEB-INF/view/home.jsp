<%-- 
    Document   : home
    Created on : 4 Feb, 2019, 5:38:59 PM
    Author     : parth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <!-- Add logout button -->
        
        <form:form action="${pageContext.request.contextPath}/logout" method="POST">
            
            <input type="submit" value="Logout"/>
            
        </form:form>
        
    </body>
</html>
