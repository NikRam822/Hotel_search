<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 25.01.2023
  Time: 17:29
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <asset:stylesheet src="home.css"/>
</head>

<body>
<table>

    <thead>
    <th>Capital</th>
    <th>Title</th>
    </thead>
    <tbody>
    <tr>
        <g:form controller="CountryEdit" action="update">

            <td><g:textField name="capital" value="${capital}"/></td>
            <td><g:textField name="title" value="${title}"/></td>
            <g:submitButton name="Save"/>

        </g:form>


        <g:form controller="CountryEdit" action="delete">
            <g:submitButton name="Delete"/>
        </g:form>

        <g:form controller="Home" action="countries">
            <g:submitButton name="Back"/>
        </g:form>
    </tr>
    </tbody>
</table>

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