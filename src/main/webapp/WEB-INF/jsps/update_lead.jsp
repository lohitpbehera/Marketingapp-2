<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>

<style>
     div {
  border-radius: 5px;
  background-color: #92A8D1;
  padding: 10px;
}

</style>  

<body>
    <h2>Update Lead</h2>
       
       <div>
       
       <form action="updateLead" method="post">
           <pre>
              <input type="hidden" name=id value="${coin.id}"/></br>
              FirstName<input type="text" name="firstName" value="${coin.firstName}"/></br>
               LastName<input type="text" name="lastName" value="${coin.lastName}"/></br>
                  Email<input type="email" name="email" value="${coin.email}"/></br>
                 Mobile<input type="number" name="mobile" value="${coin.mobile}"/></br>
                        <input type="submit" value="update"/>
           </pre>
       </form>
       
       </div>

</body>
</html>