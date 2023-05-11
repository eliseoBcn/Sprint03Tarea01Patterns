package n3ejercicio1.vehiculos;

public class Coche implements Vehiculos {

	private int velocidad = 0;

	public Coche() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println(" Coche arrancada ");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		velocidad++;
		System.out.println(" Operacion Acelerar : Coche a velocidad " + velocidad);
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		velocidad--;
		System.out.println(" Operacion Frenar : Coche a velocidad " + velocidad);

	}

}
