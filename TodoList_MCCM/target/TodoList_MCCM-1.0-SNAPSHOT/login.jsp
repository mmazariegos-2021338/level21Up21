<%-- 
    Document   : login.jsp
    Created on : Mar 21, 2023, 4:12:56 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <jsp:useBean class="edu.levelup.entities.Usuario" scope="session" id="usuarioBean"/>
        <jsp:setProperty param="apellido" property="apellido" name="usuarioBean"/>
        <jsp:setProperty param="nombre" property="nombre" name = "usuarioBean" />
        <jsp:setProperty param="email" property="email" name = "usuarioBean" />
        
        <jsp:setProperty param="password" property="password" name = "usuarioBean" />
        <jsp:setProperty param="confpassword" property="confPassword" name = "usuarioBean" />
        
        <% if (usuarioBean.getPassword().equals(usuarioBean.getConfPassword())){ %>
        <jsp:useBean class="edu.levelup.services.UsuarioService" scope="session" id="usuarioService" />
        <%usuarioService.crearUsuario(usuarioBean);%>
        <form action="tareas.jsp">
            Usuario <input type="text" name="usuario" /> <br><!-- comment -->
            Password <input type="password" name="password" /> <br>
            <input type="submit" value="Acceder" />
        </form>
        <%} else {%>
            <h2>Datos invalidos de registro de usuario</h2>
        <%}%>
        
        
        
    </body>
</html>
