<%--
  Created by IntelliJ IDEA.
  User: CaioNunes
  Date: 17/10/2022
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar</title>
</head>
<body>
<h4> Editar </h4>
<form action="./cadastrar" method="POST">
    <input name = "sala_num" placeholder="Número da Sala a editar" ><br><br>
    <input name = "sala_andar" placeholder="Andar" ><br><br>
    <input name = "sala_max_aluno" placeholder="Quantidade Máxima de Alunos" ><br><br>
    <input name = "sala_qtd_maq" placeholder="Quantidade de Máquinas" type="number"><br><br>
    <button type="submit">Editar</button>
</form>
</body>
</html>
