<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 20.01.2023
  Time: 8:01
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

    </thead>

    <g:each in="${result}">

        <tbody>
        <tr>

        <td>${it.rating}</td>
        <td>
            <g:link controller="HotelEdit" action="index"
                    params="[title: it.title, rating: it.rating, site: it.site, country: it.refresh().country.title]">
                ${it.title}
            </g:link>

            <br/>
            <g:if test="${it.site != null}">
                <a href=${it.site} target="_blank">Go to website</a>
            </g:if>

        </td>

        </tr>
    </g:each>
</table>
<g:form controller="HotelEdit" action="save">
    <g:submitButton name="+"/>
</g:form>
<p>Hotels found: ${total}</p>


<g:form controller="Home" action="index">
    <g:submitButton name="Search again"/>
</g:form>

<g:paginate next="Forward" prev="Back" controller="Home" action="list" total="${total}"/>
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