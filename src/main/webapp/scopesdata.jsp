<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>request scope data is ....</h1>
${msg} 
<h1>session scope data is ....</h1>
${email}
<br>
<h1>application scope data is ....</h1>
${company}
<br>

<a href="scopesdata2.jsp"> click here to see scopes data on scopesdata2.jsp</a>



</body>
</html>