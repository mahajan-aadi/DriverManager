<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is the Driver Main Page</h1>
<h1>${msg}</h1>

<form:form action="updatedriver" modelAttribute="driver">

 <form:hidden path="driverID" />
Name : <form:input path = "driverName"/><br/><br/>
Number: <form:input path ="driverNumber"/> <br/><br/>

<input type="submit" value="Edit Driver"/>

</form:form>
 </body>
</html>