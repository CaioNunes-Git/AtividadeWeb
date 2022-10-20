package br.ucsal.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/autenticar")
public class AutenticarController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");

		if (usuario != null && !usuario.isEmpty() && !usuario.isBlank()) {
			if (usuario.equalsIgnoreCase(senha)) {
				resp.sendRedirect("./home.jsp");
			} else {
				resp.sendRedirect("./index.jsp");
			}
		}
	}

}
