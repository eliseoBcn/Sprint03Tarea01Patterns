package n3ejercicio1;

import n3ejercicio1.operaciones.*;
import n3ejercicio1.vehiculos.*;
	
public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculos  coche 		= new Coche();
	 	Vehiculos  bicicleta 	= new Bicicleta();
		Vehiculos  avion        = new Avion();
		Vehiculos  barco        = new Barco();
		
		
		
		AcelerarVehiculo cocheAcelera = new AcelerarVehiculo(coche);
		AcelerarVehiculo bicicletaAcelera  = new AcelerarVehiculo(bicicleta);		
		AcelerarVehiculo avionAcelera  = new AcelerarVehiculo(avion);	
		AcelerarVehiculo barcoAcelera   = new AcelerarVehiculo(barco);	
		
		
		
		FrenarVehiculo cocheFrenar = new FrenarVehiculo(coche);
		FrenarVehiculo bicicletaFrenar  = new FrenarVehiculo(bicicleta);
		FrenarVehiculo avionFrenar  = new FrenarVehiculo(avion);
		FrenarVehiculo barcoFrenar   = new FrenarVehiculo(barco);
		
		
		
		
        Invoker invoker = new Invoker();
        
        invoker.add(new ArrancarVehiculo(coche) );
        invoker.add(new ArrancarVehiculo(bicicleta) );
        invoker.add(new ArrancarVehiculo(avion) );
        invoker.add(new ArrancarVehiculo(barco) );
        
        invoker.add(cocheAcelera);
        invoker.add(cocheAcelera);
        invoker.add(cocheAcelera);
        invoker.add(cocheAcelera);
 
        invoker.add(cocheFrenar);
        invoker.add(cocheFrenar);
        invoker.add(cocheFrenar);
        invoker.add(cocheFrenar);

        invoker.add(bicicletaAcelera);
        invoker.add(bicicletaFrenar);

        invoker.add(barcoAcelera);
        invoker.add(barcoFrenar);
        
        invoker.add(avionAcelera);
        invoker.add(avionFrenar);
        
        invoker.run();

	}

}
