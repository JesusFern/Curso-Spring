package es.pildoras.ioc;

public class JefeEmpleado implements Empleados{
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

}
