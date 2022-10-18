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
    <title>Cadastrar</title>
</head>
<body>
<h4> Cadastrar </h4>
<form action="./cadastrar" method="POST">
  <input name = "sala_num" placeholder="Número da Sala" required><br><br>
  <input name = "sala_andar" placeholder="Andar" required><br><br>
  <input name = "sala_max_aluno" placeholder="Quantidade Máxima de Alunos" required><br><br>
  Possui Máquinas <input id = "tem_maq" placeholder="Possui Máquinas?" type="checkbox" onclick="alterarEstado()"><br><br>
  <input name = "sala_qtd_maq" id = "qtdMaq" placeholder="Quantidade de Máquinas" disabled = "true" type="number"><br><br>
  <button type="submit">Cadastrar</button>
</form>
</body>
<script>
  var maquinas = document.getElementById("tem_maq")
  var qtdMaq = document.getElementById("qtdMaq")
  function alterarEstado(){
    qtdMaq.disabled = !maquinas.checked;
    if (!maquinas.checked) {
      qtdMaq.value = null;
    }
  }
</script>
</html>
