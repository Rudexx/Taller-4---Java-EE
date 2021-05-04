<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Carga de Imagenes</title>
</head>
<body>
<%
    String name = request.getParameter("usuario");
    out.println("Bienvenido a FourPaws Citizens " + name
    + "\nA continuacion debes Ingresar la imagen de tu mascota");
%>
<br>
<br>
<%= java.util.Calendar.getInstance().getTime() %>
<h1> Bienvenido a FourPawsCitizens</h1>
<form action="">

</form>

<br/>
<a href="https://docs.google.com/document/d/1JdND5vwoKtc08y3Y5yjF0JNJx9revQnW7SI24FivMEo/edit">Link del taller</a>
</body>
</html>