<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create lead</title>
</head>
<style>
     
     div {
  border-radius: 5px;
  background-color: #55B4B0;
  padding: 10px;
}

</style>

<body>

    <h2>Create New Lead</h2>
   
     <div>
   
      <form action="saveLead" method="post">
        <pre>
               
         FirstName<input type="text" name="firstName"/></br>
          LastName<input type="text" name="lastName"/></br>
             Email<input type="email" name="email"/></br>
            Mobile<input type="number" name="mobile"/></br>
     
                          <input type="submit" value="Save"/>
           
         </pre>  
         
    </form>

   </div>

       ${msg}
</body>
</html>