<%-- 
    Document   : cupcakeside
    Created on : 17-02-2016, 09:20:46
    Author     : ümit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hi<br> 
        <br>Welcome to the Webshop</h1>
        
        <form action="servlet" method="get" >
            <input type="text" name="username" 
               value=<% request.getParameter("userName");
               %> />
        
       
        </form>
    </body>
</html>
