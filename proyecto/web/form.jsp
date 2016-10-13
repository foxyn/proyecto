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
        <h1>Formulario Alcoholemia</h1>
        <form>
            <tr>
                <th>Correo:     <input type="email" id="correo" name="correo" required > </th> <br>
            <th>Mililitros: <input type="number" id="mili" name="mili" required > </th> <br>
                <th>Grados:     <input type="number" id="grados" name="grados" required > </th> <br>
                <th>Peso:       <input type="number" id="peso" name="peso" required ></th> <br>
                <th>Sexo:       <input type="text" id="sexo" name="sexo" required > </th> <br>
                <input type="submit" value="ENVIAR"
            </tr>
        </form>
    </body>
</html>
