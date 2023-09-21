<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL DRIVERS</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!--  //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css -->
<link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">

<script type="text/javascript">
  $(document).ready(function () { 
       $('#drivertab').DataTable({ -->
           pagingType: 'full_numbers', 
      }); 
  }); 
 </script> 


</head>
<body>


<table id="drivertab" class="table">
<thead class="thead-dark">
<tr>
<th>
DriverNumber
</th>
<th>
Name
</th>
<th>
Number
</th>
<th>Edit</th>
<th>Delete</th>
</tr>
</thead>
<tbody>
<c:forEach items="${alldrivers}" var="driver">
<tr>
<td>${driver.driverID}</td>

<td>${driver.driverName}</td>
<td>${driver.driverNumber}</td>
<td><a href="editdvr?did=${driver.driverID}">Edit</a></td>
     <td><a href="deletedvr?did=${driver.driverID}">Delete</a>

</tr>

</c:forEach>

</tbody>

</table>

<form action="/">
<input type="submit" value="Main Page"/>  
</form>

</body>
</html>