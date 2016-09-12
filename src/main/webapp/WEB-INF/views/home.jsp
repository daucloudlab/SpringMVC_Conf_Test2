
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link rel="stylesheet" href="<c:url value="/static/css/home.css"/>"/>
    <title>Home page</title>
</head>

<form:form action="/check-user" method="post" commandName="user" class="box login">
    <form:label path="userName">Username</form:label>
        <form:input path="userName" />

    <form:label path="birthDate">Birth Date</form:label>
    <form:input path="birthDate" />



        <form:label path="password">Password</form:label>
        <form:password path="password"  />
    </fieldset>
    <footer>
        <form:label path="admin">Keep me logged in</form:label>
        <form:checkbox path="admin"/>
        <input type="submit" class="btnLogin" value="Login" tabindex="4">
    </footer>
</form:form>
</body>
</html>
