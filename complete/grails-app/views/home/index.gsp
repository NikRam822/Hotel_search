<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 20.01.2023
  Time: 2:14
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Try view Hotel table</title>
    <asset:stylesheet src="home.css"/>
</head>

<body>

<table>
    <g:form controller="Home" action="search">
        <g:select noSelection="${['all': 'All countries']}" name="selection" from="${countries.title}"
                  value="${selection}"/>

        <g:textField name="find" value="${find}"/>
        <g:submitButton name="Search"/>
    </g:form>

</table>
<g:if test="${result?.size() == 0}">
    Not found
</g:if>
<div class="form">
    <g:form controller="Home" action="home">
        <g:submitButton name="Home"/>
    </g:form>
    <g:form controller="Home" action="hotels">
        <g:submitButton name="Hotels"/>
    </g:form>
    <g:form controller="Home" action="countries">
        <g:submitButton name="Countries"/>
    </g:form>
</div>
</body>
</html>