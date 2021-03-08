<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">    <title>JSP Page</title>
    <title>Register</title>
</head>
<body>
<a href="index.jsp">Home</a>
<a href="login.jsp">Login</a>
<a href="register.jsp">Sign Up</a>
<div class="container d-flex justify-content-center" style="align-items: center">
    <div class="" style="width: 300px; height: 500px; border-color: black;">
        <form action="register" method="POST">
            <h2>Registration</h2>
            <div class="form-group">
                <label>Email address</label>
                <input type="email" class="form-control" name="inputEmail" aria-describedby="emailHelp" placeholder="Enter email">
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div class="form-group">
                <label>Username</label>
                <input type="text" class="form-control" name="inputUsername" placeholder="Enter username">
            </div>
            <div class="form-group">
                <label>Contacts</label>
                <input type="text" class="form-control" name="inputContacts" placeholder="Enter phone number">
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
