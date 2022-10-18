<%@ page import="br.ucsal.app.SalaDAO" %>
<%@ page import="java.util.Map" %>
<%@ page import="br.ucsal.app.Sala" %><%--
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


<form action="cadastrar.jsp">
    <button type="submit">Cadastrar</button>
</form>
<tr>
<form action="editar.jsp">
    <button type="submit">Editar</button>
</form>
<tr>
<form action="deletar.jsp">
    <button type="submit">Deletar</button>
</form>

<h3>
<%=(SalaDAO.listarTodos())%>
</h3>

</body>
</html>
