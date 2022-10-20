package br.ucsal.app.controller;

import java.io.IOException;

import br.ucsal.app.Sala;
import br.ucsal.app.SalaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/cadastrar","/deletar","/editar"})
public class SalaController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();

        switch (action) {
            case "/cadastrar":
                cadastrar(req);
                break;
            case "/deletar":
                deletar(req);
                break;
            case "/editar":
                editar(req);
                break;
        }

        resp.sendRedirect("home.jsp");
    }

    private void cadastrar(HttpServletRequest req){
        String numSala = req.getParameter("sala_num");
        String andar = req.getParameter("sala_andar");
        String max_aluno = req.getParameter("sala_max_aluno");
        String qtd_maq = req.getParameter("sala_qtd_maq");
        Sala sala = new Sala(numSala, andar, max_aluno, qtd_maq);
        Sala salaanterior = SalaDAO.listaDAO.get(numSala);
        if (salaanterior == null) {
            SalaDAO.inserir(sala);
        }
    }

    private void editar(HttpServletRequest req) {
        String numSala = req.getParameter("sala_num");
        String andar = req.getParameter("sala_andar");
        String max_aluno = req.getParameter("sala_max_aluno");
        String qtd_maq = req.getParameter("sala_qtd_maq");
        Sala sala = new Sala(numSala, andar, max_aluno, qtd_maq);
        Sala salaanterior = SalaDAO.listaDAO.get(numSala);
        if (salaanterior != null) {
            SalaDAO.editar(sala, salaanterior.getNumSala());
        }
    }

    private void deletar(HttpServletRequest req){
        String numSala = req.getParameter("sala_num");
        SalaDAO.removerByNumSala(numSala);
    }
}




