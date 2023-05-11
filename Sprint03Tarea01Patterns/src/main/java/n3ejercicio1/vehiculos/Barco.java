package n3ejercicio1.vehiculos;

public class Barco implements Vehiculos {

	private int velocidad = 0;
	public Barco() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println( " Barco arrancado + levantadas anclas "); 
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		velocidad++;
		System.out.println( " Operacion Acelerar : Barco a velocidad " + velocidad );
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		velocidad--;
		System.out.println( "  Operacion Frenar :  Barco a velocidad " + velocidad );
		
	}

}
