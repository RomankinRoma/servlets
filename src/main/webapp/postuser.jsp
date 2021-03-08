<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 08.02.2021
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<a href="index.jsp">Home</a>
<br>

<%
    String userName = null;
    String sessionID = null;
    Cookie[] cookies = request.getCookies();
    if(cookies !=null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("inputEmail")) userName = cookie.getValue();
            if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
        }
    }
    if(userName == null) response.sendRedirect("login.jsp");
%>
<h3>Hi <%=userName %>, Login successful. Your Session ID=<%=sessionID %></h3>
<h3>Hi <%=userName %>, Login successful.</h3>
<br>

<form action="LogoutServlet" method="post">
    <input type="submit" value="Logout" >
</form>

</body>
</html>
