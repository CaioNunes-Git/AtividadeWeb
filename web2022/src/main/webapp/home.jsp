<%@ page import="br.ucsal.app.SalaDAO" %>

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
<form id="cadastrar" action="./cadastrar" method="POST" hidden="true">
<input name = "sala_num" placeholder="Número da Sala" required><br><br>
<input name = "sala_andar" placeholder="Andar" required><br><br>
<input name = "sala_max_aluno" placeholder="Quantidade Máxima de Alunos" required><br><br>
Possui Máquinas <input id = "tem_maq" placeholder="Possui Máquinas?" type="checkbox" onclick="alterarEstado()"><br><br>
<input name = "sala_qtd_maq" id = "qtdMaq" placeholder="Quantidade de Máquinas" disabled = "true" type="number"><br><br>
<button type="submit">Cadastrar</button>
</form>
<form id="editar" action="./editar" method="POST" hidden="true">
    <input name = "sala_num" placeholder="Número da Sala a editar" required><br><br>
    <input name = "sala_andar" placeholder="Andar" required><br><br>
    <input name = "sala_max_aluno" placeholder="Quantidade Máxima de Alunos" required><br><br>
    <input name = "sala_qtd_maq" placeholder="Quantidade de Máquinas" type="number" required><br><br>
    <button type="submit">Editar</button>
</form>
<form id="deletar" action="./deletar" method="POST" hidden="true">
    <input name = "sala_num" placeholder="Número da Sala" required><br><br>
    <button type="submit">Deletar</button>
</form>
<tr>
<button id="buttoncadastrar" onclick="exibirForm('cadastrar')">Cadastrar</button> <tr/>
<button id="buttoneditar" onclick="exibirForm('editar')">Editar</button> <tr/>
<button id="buttondeletar" onclick="exibirForm('deletar')">Deletar</button>

<h4>
    ---------------------------- <br/>
    <%=(SalaDAO.listarTodos())%>
</h4>
</body>
<script>
    var maquinas = document.getElementById("tem_maq")
    var qtdMaq = document.getElementById("qtdMaq")
    var tempForm = document.querySelectorAll("form")
    var forms = [...tempForm]
    var tempButton = document.querySelectorAll("button")
    var buttons = [...tempButton]
    function alterarEstado(){
        qtdMaq.disabled = !maquinas.checked
        if (!maquinas.checked) {
            qtdMaq.value = null
        }
    }
    function exibirForm(id) {
        forms.forEach(form => {
            form.hidden = true
        })
        esconderBotao(id)
        document.getElementById(id).hidden = false
    }
    function esconderBotao(id) {
        buttons.forEach(button => {
            button.hidden = false
        })
        document.getElementById('button'+id).hidden = true
    }
</script>
</html>
