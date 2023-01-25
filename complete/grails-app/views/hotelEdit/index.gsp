<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 24.01.2023
  Time: 6:44
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
    <th>Rating</th>
    <th>Title</th>
    <th>Site</th>
    <th>Country</th>
    </thead>
    <tbody>
    <tr>
        <g:form controller="HotelEdit" action="update">

            <td><g:select name="rating" from="${[1, 2, 3, 4, 5]}" value="${rating}"/></td>

            <td><g:textField name="title" value="${title}"/></td>
            <td><g:textField name="site" value="${site}"/></td>
            <td><g:select name="country" from="${countries.title}" value="${country}"/></td>
            <g:submitButton name="Save"/>

        </g:form>


        <g:form controller="HotelEdit" action="delete">
            <g:submitButton name="Delete"/>
        </g:form>

        <g:form controller="Home" action="hotels">
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