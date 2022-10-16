<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  User: CaioNunes
  Date: 15/10/2022
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>
      Número da Sala : <%=request.getParameter("sala_num")%> <br>
      Andar da Sala : <%=request.getParameter("sala_andar")%> <br>
      Capacidade Máxima de Alunos : <%=request.getParameter("sala_max_aluno")%> <br>
      Quantidade de Máquinas da Sala: <%
            String qtd = request.getParameter("sala_qtd_maq");
            if (qtd==null) {
                out.write("0");
            } else {
                out.write(qtd);
            }
      %>
  </h1>
</body>
</html>
