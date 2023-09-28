package services;

import java.util.List;

import model.Libro;
import repos.LibroDAO;
import repos.LibroDAOImpl;

public class LibroServiceImpl implements LibroService{

	LibroDAO dao = new LibroDAOImpl();
	
	// sovrascrivo il metodo getLibri() dell'INTERFACCIA LibroService
	
	// per l'override sfrutto il metodo datiDB() di un oggetto tipo LibroDAOImpl
	
	// STRATO SERVICE DI UNA WEB APPLICATION:
	// serve per separare lo strato CLIENT (strato in cui l'utente finale visualizza la pagina sul browser) da tutti gli strati sottostanti
	// 
	
	@Override
	public List<Libro> getLibri() {

		return dao.datiDB();
	}

}
