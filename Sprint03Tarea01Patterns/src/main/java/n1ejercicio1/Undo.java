/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2023 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
package n1ejercicio1;

import java.util.ArrayList;

public class Undo {

	static private Undo    undo = new Undo();
	static private  ArrayList<String>   listaItems  = new ArrayList<String>();
	
	private  Undo() {
		// TODO Auto-generated constructor stub
	}
	public void  anadirItem(String  item) {
		
		listaItems.add(item);
	}
	
	public void  borrarItem(String item) {
	       for (int i=0;i<listaItems.size();i++)
	        {
 	    	   if( listaItems.get(i).equals(item) ) {
	    	         listaItems.remove(i);
	    	   }
	        }
  	}
	public void  historyItem() {
 	   
	       for (int i=0;i<listaItems.size();i++)
	        {
	    	   System.out.println( listaItems.get(i)   );
	        }
    	   System.out.println(" " );
    		       
	}

	public void  undo() {
	 	   
	       if(!listaItems.isEmpty()){
  	         listaItems.remove(listaItems.size() - 1 );
	       }
	}       
	
	
	public static Undo  getInstance() {
		return undo;
	}

}
