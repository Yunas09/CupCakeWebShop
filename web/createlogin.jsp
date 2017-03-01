
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create login</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>User name</th>
                    <th><input type="text" name="username" value="" /></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password" value="" /></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" value="create user" />
        <input type="submit" value="Back" onclick="window.location='login.jsp'" />
    </body>
</html>
<%
    


%>