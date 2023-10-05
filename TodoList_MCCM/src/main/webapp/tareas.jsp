<%-- 
    Document   : tareas.jsp
    Created on : Mar 21, 2023, 4:35:23 PM
    Author     : maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tareas</title>
    </head>
    <body>
        <h1>Tareas</h1>
         <jsp:useBean class="edu.levelup.entities.Usuario" scope="session" id="usuarioBean"/>
         <jsp:useBean class="edu.levelup.services.UsuarioService" scope="session" id="usuarioService"/>
         <%String usuario = request.getParameter("usuario");
           String password = request.getParameter("password");
            usuarioBean = usuarioService.autenticar(usuario, password);
            if (usuarioBean == null) {%>
               <h2>Error de autenticación</h2>
               <a href="login.jsp"> Intente nuevamente </a>
            <%} else{ %>
            <form action="tarea.jsp">
                Agregar tarea <input type="text" name="nombre" />
                <input type="hidden" name="agregarTarea"/>
                <input type="submit" value="Agregar"/>
            </form>
            <h3>Lista de Tareas </h3>
            <ul>
                
            </ul>
            
            
            <%}%>
         
         <form>
            
        </form>
    </body>
</html>
