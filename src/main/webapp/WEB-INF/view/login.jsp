<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<form action="" method="POST" modelAttribute="user">
		<label>User Name:</label><input type="text" name="user_name" /><br />
		<label>Password:</label><input type="password" name="password" /><br />
		<input type="submit" value="Login" /><br />
		<p style="color: red;">${errormsg}</p>
	</form>
</body>
</html>