package br.ucsal.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listar")
public class ListaController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String num = req.getParameter("sala_num");
        String andar = req.getParameter("sala_andar");
        String max_aluno = req.getParameter("sala_max_aluno");
        String qtd_maq = req.getParameter("sala_qtd_maq");

        req.getRequestDispatcher("listar.jsp").forward(req, resp);

        }
    }
