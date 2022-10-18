package br.ucsal.app.controller;

import java.io.IOException;

import br.ucsal.app.Sala;
import br.ucsal.app.SalaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastrar")
public class CadastrarSalaController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //PrintWriter out = resp.getWriter();
        String numSala = req.getParameter("sala_num");
        String andar = req.getParameter("sala_andar");
        Integer max_aluno = Integer.parseInt(req.getParameter("sala_max_aluno"));
        String qtd_maq = req.getParameter("sala_qtd_maq");
        Sala sala = new Sala(numSala, andar, max_aluno, qtd_maq);
        Sala salaanterior = SalaDAO.listaDAO.get(numSala);
        if (salaanterior != null) {
            SalaDAO.editar(sala, salaanterior.getId(), salaanterior.getNumSala());
        } else {
            SalaDAO.inserir(sala);
        }
//        req.getRequestDispatcher("home.jsp").forward(req, resp);
        resp.sendRedirect("home.jsp");
    }
}




