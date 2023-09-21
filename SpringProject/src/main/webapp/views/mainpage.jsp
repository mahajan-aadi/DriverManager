<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous"> -->

</head>
<body>
<h1>This is the Main Page</h1>
<h1>${msg}</h1>
<form:form action="driverpage" modelAttribute="driver">
 	<input type="submit" value="Driver">  
</form:form>
<%-- <form:form1 action=connectionpage modelAttribute="connectionDoer"> --%>
<!--  	<input type="submit" value="RouteMapping">   -->
<%-- </form:form1> --%>
</body>
</html>