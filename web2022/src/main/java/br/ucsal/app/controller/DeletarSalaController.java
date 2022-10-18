package br.ucsal.app.controller;

import br.ucsal.app.SalaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/deletar")
public class DeletarSalaController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String numSala = req.getParameter("sala_num");
        SalaDAO.removerByNumSala(numSala);
//        req.getRequestDispatcher().forward(req, resp);
        resp.sendRedirect("home.jsp");
    }
}
