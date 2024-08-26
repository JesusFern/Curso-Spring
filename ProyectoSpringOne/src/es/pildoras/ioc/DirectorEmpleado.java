package es.pildoras.ioc;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de  campo tipom CreacionInforme (interfaz)

	private CreacionInformes informeNuevo;
	
	//Creación de construcción que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: "+ informeNuevo.getInforme();
	}

}
