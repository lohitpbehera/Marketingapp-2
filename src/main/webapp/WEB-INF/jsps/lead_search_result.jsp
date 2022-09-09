<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h2>List Of All Leads</h2>
    
    <form>
        
        <table  id="customers" style="width:10%">
        
            <tr>
                <th>Id</th>
               <th>FirstName</th>
               <th>LastName</th>
               <th>Email</th>
               <th>Mobile</th>
               <th>Delete</th>
               <th>Update</th>
            </tr>
        
           <c:forEach var="leads" items="${Lead}"> 
            <tr>
                <td>${leads.id}</td>
                <td>${leads.firstName}</td>
                 <td>${leads.lastName}</td>
                  <td>${leads.email}</td>
                   <td>${leads.mobile}</td>
                   
                   <td><a href="delete?id=${leads.id}">Delete</a></td>
                   <td><a href="update?id=${leads.id}">Update</a></td>
            </tr>
           </c:forEach>
        
        </table>
    
    </form>

</body>
</html>