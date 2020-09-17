<%--
  Created by IntelliJ IDEA.
  User: austin
  Date: 9/15/20
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%-- This is a page directive that will apply to the entire page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Instance variable, like servlet variables, this will persist between page loads--%>
<%--Will run once--%>
<%! int counter = 0; %>




<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Burgers 'R Us"/>
    </jsp:include>
</head>
<body>
    <div class="container">
        <h1>Welcome to Burgers 'R Us</h1>
        <p>Currently <%= counter %> million burgers sold</p>

        <p>Path: <%= request.getRequestURL() %></p>
        <p>Query String: <%= request.getQueryString() %></p>
        <p>IP: <%= request.getRemoteAddr() %></p>
    </div>
    <%--Now lets run some arbitrary java code to increment the counter by 1 evertime we reload the page--%>
    <% counter += 1; %>
    <jsp:include page="partials/scripts.jsp"/>
</body>
</html>
