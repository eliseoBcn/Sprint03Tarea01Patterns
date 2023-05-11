package n3ejercicio1.operaciones;

import n3ejercicio1.vehiculos.Vehiculos;

public class ArrancarVehiculo implements Command {

	
	private  Vehiculos vehiculo;
	public ArrancarVehiculo(Vehiculos vehiculo) {
		// TODO Auto-generated constructor stub
		this.vehiculo = vehiculo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		vehiculo.arrancar();
	}

}
