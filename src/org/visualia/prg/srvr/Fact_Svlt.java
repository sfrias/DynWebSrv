package org.visualia.prg.srvr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Fact_Svlt
 */
@WebServlet(asyncSupported = true, description = "Calcula el factorial entre 1 y 20", urlPatterns = { "/Fact_Svlt" })
public final class Fact_Svlt extends HttpServlet {
	private static final long serialVersionUID = 1L;     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fact_Svlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	//public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see Servlet#destroy()
	 */
	//public void destroy() {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see Servlet#getServletConfig()
	 */
	//public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
	//	return null;
	//}

	/**
	 * @see Servlet#getServletInfo()
	 */
	//public String getServletInfo() {
		// TODO Auto-generated method stub
	//	return null; 
	//}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		//Solo funciona si entro valor numérico, casca si meto letras
		Long valor = Long.parseLong(JOptionPane.showInputDialog("Entra valor de 1 a 20"));
		//Integer valor =100;
		String entrada = valor.toString();
		Long resultado = valor;
		if ((valor < 0)||(valor>20)) {
			pw.println("Valor fuera del rango calculable.");
		}else{
			if ((valor == 1)||(valor == 0)) {
				resultado = valor;
			}else{
				do {
					valor = valor - 1;
					resultado = resultado * valor;
					pw.println("resultado = "+resultado+" valor= " + valor+"<br>");
				} while (valor > 2);
			}
			pw.println("Cálculo del factorial de "+entrada+": "+resultado);
		}
	}	
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	//protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	//protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doHead(HttpServletRequest, HttpServletResponse)
	 */
	//protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	//protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doTrace(HttpServletRequest, HttpServletResponse)
	 */
	//protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

}
