<%-- 
    Document   : resultado
    Created on : 18/04/2016, 17:51:41
    Author     : estagio.gleydson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="DAO.registraDAO"%>
<!DOCTYPE html>

<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        
        <h1>Hello World!</h1>
        
        <%=registraDAO.valoresTabelaPesquisa1.getID() %>
    </body>
</html>
