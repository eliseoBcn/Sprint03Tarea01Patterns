package n3ejercicio1.vehiculos;

public class Bicicleta implements Vehiculos {

	private int velocidad = 0;
	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println( "  bicicleta  preparada  "); 
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		velocidad++;
		System.out.println( " Operacion Acelerar : Bici a velocidad " + velocidad );
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		velocidad--;
		System.out.println( "  Operacion Frenar : Bici a velocidad " + velocidad );
		
	}

}
