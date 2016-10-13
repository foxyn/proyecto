<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        
        <h1 style="text-align: center">Formulario Alcoholemia</h1>
        <form method="post" action="/Servlet">
            <table style="margin: 0 auto;">
            <tr>
                    <td>Correo:</td>
                    <td> <input type="email" id="correo" name="correo" required > </td>
            </tr>
            <tr>
                <td>Mililitros:</td>
                <td> <input type="number" id="mili" name="mili" required > </td> <br>
            </tr> 
                <td>Grados:</td>
                <td> <input type="number" id="grados" name="grados" required > </td> <br>
            <tr>
                <td>Peso:</td>
                <td> <input type="number" id="peso" name="peso" required ></td> <br>
            </tr>    
            <tr>
                <td>Sexo:</td> 
                <td> <input type="radio" name="sexo" checked value="1"> Masculino </td>
                <td> <input type="radio" name="sexo" value="2"> Femenino</td>
                
            </tr>
            
            <tr colspan="2">
                <td></td>
                <td> <input type="submit" value="ENVIAR"  </td>
            </tr>
            </table>
        </form>
    </body>
</html>
