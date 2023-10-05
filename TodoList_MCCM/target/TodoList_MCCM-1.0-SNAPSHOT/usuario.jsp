<%-- 
    Document   : usuario
    Created on : Mar 21, 2023, 3:25:18 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Usuario</title>
    </head>
    <body>
        <h1>Nuevo Usuario</h1>
        <form action="login.jsp">
            Apellido <input type="text" name="apellido"/> 
            Nombre <input type="text" name="nombre" /> <br><!-- comment -->
            Email <input type="text" name="email"/> <br>
            Password <input type="password" name="password" /> 
            Confirmar <input type="password" name="confpassword"/><br>
            <input type="submit" value="Grabar" /><!-- comment -->
                         
        </form>
    </body>
</html>
