package n1ejercicio1;

public class Main {
  public static void main(String[] args) {

	 
	  Undo undo = Undo.getInstance();
	  
	  undo.anadirItem("1manzanas");
	  undo.anadirItem("2peras");
	  undo.anadirItem("3uvas");
	  undo.anadirItem("4platanos");

	  undo.historyItem();
	  
	  // Borrado  
	  undo.borrarItem("2peras");

	  undo.historyItem();
  
	  // Borrado del ultimo
	  undo.undo();

	  undo.historyItem();
 	
	  //  La instancia ya esta creada 
	  Undo undo2 = Undo.getInstance();
	  undo2.historyItem();
  }
}
