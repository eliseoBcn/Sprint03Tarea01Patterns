package n3ejercicio1.vehiculos;

public class Avion implements Vehiculos {

	private int velocidad = 0;
	public Avion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println( " Avión arrancado "); 
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		velocidad++;
		System.out.println( " Operacion Acelerar : Avión a velocidad " + velocidad );
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		velocidad--;
		System.out.println( "  Operacion Frenar : Avión a velocidad " + velocidad );
		
	}

}
