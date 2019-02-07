<%-- 
    Document   : home
    Created on : 4 Feb, 2019, 5:38:59 PM
    Author     : parth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <hr/>
        
        <!-- Display User and Roles!! -->
        User: <security:authentication property="principal.username" />
        <br/>
        Role: <security:authentication property="principal.authorities" />
        <hr/>
        
        <!-- Add a link that points to /leaders : Only for Managers -->
        <security:authorize access="hasAnyRole('ROLE_ADMIN', 'ROLE_TEAMLEADER')">
            <a href="${pageContext.request.contextPath}/leaders">Leadership meeting</a>
            (Only for managers)
        </security:authorize>
        <!-- Add a link that points to /system : Only for Admin -->
        <hr/>
        
        <security:authorize access="hasRole('ROLE_ADMIN')">
        <a href="${pageContext.request.contextPath}/system">Admin Panel</a>
        (Only for Admin)
        </security:authorize>
        
        
        <!-- Add logout button -->
        
        <form:form action="${pageContext.request.contextPath}/logout" method="POST">
            
            <input type="submit" value="Logout"/>
            
        </form:form>
        
    </body>
</html>
