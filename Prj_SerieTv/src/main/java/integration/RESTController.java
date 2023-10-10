package integration;

import java.io.IOException;

import org.json.JSONArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.SerieService;
import service.SerieServiceImpl;

@WebServlet("/api/serie")
public class RESTController extends HttpServlet{

	SerieService service;
	
	public RESTController() {
		service = new SerieServiceImpl();
	}	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// setto il tipo della response come JSON
		
		response.setContentType("application/json");
		
		// mi faccio ritornare dal livello SERVICE l'AL con tutte le serie
		// creo un OGGETTO ARRAY JSON con dentro l'AL di serie ritornato
		
		JSONArray array = new JSONArray(this.service.getSerie());
		
		// scrivo nella response l'oggetto array json convertito in stringa con toString()
		
		response.getWriter().print(array.toString());
		
	}
	
	
	
	
}