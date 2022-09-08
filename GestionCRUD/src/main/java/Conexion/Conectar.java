package Conexion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Conectar
 */
@WebServlet("/Conectar")
public class Conectar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Conectar() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// String jdbcurl = "jdbc:mysql://localhost:3306/gestionpedidoscrud";
		String url = "jdbc:mysql://yoniberserver.mysql.database.azure.com:3306/gestionpedidoscrud";
		// myDbConn = DriverManager.getConnection(url, "yoniber@yoniberserver",
		// {your_password});
		// String url
		// ="jdbc:mariadb://gestioncrudserver.mariadb.database.azure.com:3306/{your_database}?useSSL=true";
		String driver = "com.mysql.jdbc.Driver";
		PrintWriter out = response.getWriter();
		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, "yoniber@yoniberserver", "GestionCRUD09+");
			out.print("Nombre de la BBDD: " + con.getSchema());
			out.print("");
			out.print("<br>Conectado. ");
			
			//OBTENIENDO TODAS LAS TABLAS DE LA BASE DE DATOS.
			/*DatabaseMetaData md = con.getMetaData();
			ResultSet rs = md.getTables(null, null, "%", null);
			while (rs.next()) {
			  out.print(rs.getString(3));
			  out.print("<br>");
			}*/
			Runtime.Version version = Runtime.version();
			//String version = Runtime.class.getPackage().getImplementationVersion();
			out.print("<br>");
			out.print("<br>");
			out.print(version.toString());
			out.print("<br>");
			out.print("<br>");
			out.print(System.getProperty("java.version"));
			
			con.close();
		} catch (Exception e) {
			out.print("<br> error al conectar.");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
