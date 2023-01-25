<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 25.01.2023
  Time: 17:12
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

    <g:each in="${result}">

        <tbody>
        <tr>

        <td>${it.capital}</td>
        <td>
            <g:link controller="CountryEdit" action="index"
                    params="[title: it.title, capital:it.capital]">
                ${it.title}
            </g:link>


        </td>

        </tr>
    </g:each>
</table>
<g:form controller="CountryEdit" action="save">
    <g:submitButton name="+"/>
</g:form>


<g:form controller="Home" action="index">
    <g:submitButton name="Home"/>
</g:form>

<g:paginate next="Forward" prev="Back" controller="Home" action="countryList" total="${total}"/>
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