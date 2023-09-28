package presentation;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import services.LibroService;
import services.LibroServiceImpl;

@WebServlet("/libridb")
public class MVCController extends HttpServlet{
	
	LibroService service = new LibroServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().print("Hey sei connesso! Mi hai chiamato usando GET");
		
		// reindirizzamento ad index.jsp
		// nella barra di ricerca rimane /libridb (nome servlet) anche dopo il reindirizzamento
		
		response.sendRedirect("index.jsp");   
		
	}
	
	public List<Libro> mostraLibri(){
		
		return service.getLibri();
	}

}
