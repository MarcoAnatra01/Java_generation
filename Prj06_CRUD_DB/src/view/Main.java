package view;

import database.TodoDatabase;
import model.Todo;

public class Main {

	public static void main(String[] args) {

		Todo t1 = new Todo("pane");
		System.out.println(t1);

		t1.completa();
		System.out.println(t1);
		
		TodoDatabase db = new TodoDatabase();
		
		db.connetti();
		
		db.addTodo("pane");
		db.addTodo("riso");
		db.addTodo("uova");
	}

}
