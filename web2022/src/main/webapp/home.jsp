<%--
  Created by IntelliJ IDEA.
  User: CaioNunes
  Date: 15/10/2022
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%--  <h1>--%>
<%--      Bem Vindo, <%=request.getParameter("usuario")%>!--%>
<%--  </h1>--%>
  <form action="./listar" method="POST">
      <input name = "sala_num" placeholder="Número da Sala"><br><br>
      <input name = "sala_andar" placeholder="Andar"><br><br>
      <input name = "sala_max_aluno" placeholder="Quantidade Máxima de Alunos"><br><br>
      Possui Máquinas <input id = "tem_maq" placeholder="Possui Máquinas?" type="checkbox" onclick="alterarEstado()"><br><br>
      <input name = "sala_qtd_maq" id = "qtdMaq" placeholder="Quantidade de Máquinas" disabled = "true"> <br><br>
      <button type="submit">Cadastrar</button>
  </form>
</body>
<script>
    var maquinas = document.getElementById("tem_maq")
    function alterarEstado(){
        document.getElementById("qtdMaq").disabled = !maquinas.checked;
    }
</script>
</html>
