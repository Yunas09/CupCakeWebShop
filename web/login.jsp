<%-- 
    Document   : login
    Created on : 17-02-2016, 09:20:16
    Author     : Yunas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login to cupcake.com</h1>
        <form action="servlet" method="post" >
            <table border="1">
                <thead>

                </thead>
                <tbody>

                    <tr>
                        <th>Username</th>
                        <th> <input type="text" name="username" value="" /></th>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td> <input type="password" name="password" value="" /></td>
                    </tr>

                </tbody>
            </table>
        

        <input type="submit" name="do_this" value="login"  />
        <input type="submit" value="create new user" onclick="window.location = 'createlogin.jsp'" />
        </form>
    </body>
</html>
