<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="org.gradle.demo.Usuario " %>
<%@page import="java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="larissa" %>


<html>
    <head>
        <title>Hello Page</title>
    </head>
    <body>
        <larissa:forEach var= "user" items="${lista}">
            
            <larissa:out value = "${user.id}"/><br/>
            <larissa:out value = "${user.nome}"/><br/>
            <larissa:out value = "${user.telefone}"/><br/><br/>
           
        </larissa:forEach>
    
    </body>
</html>