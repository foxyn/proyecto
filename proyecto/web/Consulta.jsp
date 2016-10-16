<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta</title>
    </head>
    <body>
        <h1 style="text-align: center;color: red"><u>Consulta</u></h1>
        <br>
        <br>
         <form method="post" action="RegistroController">
        <table style="margin: 0 auto;">
            <tr>
                <td>Correo:</td>
                <td> <input type="email" id="correo" name="correo" required > </td>
            </tr>
            <tr colspan="2">
                <td></td>
                <td> <input type="submit" value="CONSULTAR"  </td>
            </tr>
        </table>
        </form>
        <h3><a href="Principal.jsp"> Atrás </a></h3>
    </body>
</html>
