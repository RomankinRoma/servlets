<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Hero Info
    </h1>
        <%
List result= (List) request.getAttribute("info");
for (Object info:result){
    out.println(info.toString()+"<br>");
}
%>
</body>
</html>
