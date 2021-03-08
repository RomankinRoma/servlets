<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">    <title>JSP Page</title>
    <title>Login</title>
</head>
<body>
<a href="index.jsp">Home</a>
<a href="login.jsp">Login</a>
<a href="register.jsp">Sign Up</a>
<div class="container d-flex justify-content-center" style="align-items: center">
    <div class="" style="width: 300px; height: 500px; border-color: black;">
        <form action="LoginServlet" method="post">
            <h2>Log in</h2>
            <div class="form-group">
                <label>Email</label>
                <input type="text" class="form-control" name="inputEmail" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label>Password</label>
                <input type="password" class="form-control" name="inputPassword" placeholder="Password">
            </div>
            <button class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>
