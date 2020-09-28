<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- viewform given in form action means it will look for the request mapping of that name and go to that method  -->
<form action="viewform" method="GET">
Username: <input type="text" name="firstname" /></br>
Password: <input type="password" name="password" /></br>
Date of birth: <input type="date" name="dob" /></br>
<input type="submit" value="submit" />
</form>
</body>
</html>