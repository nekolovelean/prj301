<%-- 
    Document   : createNewAccount
    Created on : Dec 26, 2022, 4:11:30 PM
    Author     : Teacher
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="error.RegistrationInsertError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Account</title>
    </head>
    <body>
        <h1>Create new Account:</h1>
        <form action="DispatchController" method="POST">
            <c:set var="errors" value="${requestScope.INSERTERR}"/>
            Username*<input type="text" name="txtUsername" value="${param.txtUsername}" />(6 - 20 chars)<br/>

            <c:if test="${not empty errors.usernameLengthErr}">  
                <font color ="red"> 
                ${errors.usernameLengthErr}
                </font>
                <br/>
            </c:if>

            Password*<input type="password" name="txtPassword" value="" />(6 - 30 chars)<br/>
            <c:if test="${not empty errors.passwordLengthErr}">
                <font color ="red"> 
                ${errors.passwordLengthErr}
                </font>
                <br/>
            </c:if>
            Confirm*<input type="password" name="txtConfirm" value="" /><br/>
            <c:if test="${not empty errors.confirmNotMatch}">
                <font color ="red"> 
                ${errors.confirmNotMatch}
                </font>
                <br/>
            </c:if>
            Full name<input type="text" name="txtFullname" value="${param.txtFullname}" />(6 - 50 chars)<br/>
            <c:if test="${not empty errors.fullNameLengthErr}">
                <font color ="red"> 
                ${errors.fullNameLengthErr}
                </font>
                <br/>
            </c:if>
            <input type="submit" value="Create new Account" name="btAction" />
            <input type="reset" value="Reset" />
            <c:if test="${not empty errors.usernameIsExited}">
                <font color ="red"> 
                ${errors.usernameIsExited}
                </font>
            </c:if>
        </form>
    </body>
</html>
