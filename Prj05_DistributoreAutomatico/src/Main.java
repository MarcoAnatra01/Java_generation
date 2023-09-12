import controller.DistributoreController;
import view.DistributoreView;
import model.*;

public class Main {

	public static void main(String[] args) {

		DistributoreController controller = new DistributoreController();
		DistributoreView view = new DistributoreView();
		
		System.out.println(view.showMenu());
		String scelta = view.sceltaBevanda();
		Bevanda b = controller.dammiBevanda(scelta);
		System.out.println(b.getMessaggio());

	}

}
