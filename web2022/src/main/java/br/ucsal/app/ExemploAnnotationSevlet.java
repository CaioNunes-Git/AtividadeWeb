package br.ucsal.app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/autenticar")
public class ExemploAnnotationSevlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");

		if (usuario != null) {
			if (usuario.equalsIgnoreCase(senha)) {
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			} else {
				resp.sendRedirect("./login.jsp");
			}
		}
	}

}
