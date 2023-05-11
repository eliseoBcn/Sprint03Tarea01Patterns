package n3ejercicio1.operaciones;

import n3ejercicio1.vehiculos.Vehiculos;

public class AcelerarVehiculo implements Command {

	private  Vehiculos vehiculo;
	public AcelerarVehiculo(Vehiculos vehiculo) {
		// TODO Auto-generated constructor stub
		this.vehiculo = vehiculo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		vehiculo.acelerar();
	}

}
