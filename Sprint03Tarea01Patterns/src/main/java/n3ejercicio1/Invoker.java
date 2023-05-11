package n3ejercicio1;

import java.util.ArrayList;
import java.util.List;
import n3ejercicio1.operaciones.Command;

public class Invoker {

    private List<Command> orden ;
   
    public Invoker() {
    	orden =   new ArrayList<>();
    }
    public void add( Command c ) {
    
    	orden.add(c);
    }

    public void run(){
    	
    	for(Command c :orden) {
    		c.execute();
    	}
    	
    }

}
