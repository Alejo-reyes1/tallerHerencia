package clases;

public class EmpleadoContratista extends Empleado {
	private int horasTrabajadas;
	
	

	public EmpleadoContratista(String nombre, String id, double salario_base,int horasTrabajadas) {
		super(nombre, id, salario_base);
		this.horasTrabajadas=horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		double sueldoBase=this.getSalario_base();
		double sueldoDia=sueldoBase/30;
		double sueldoHoras=sueldoDia/8;
		double sueldoHorasTrabajadas=sueldoHoras*this.horasTrabajadas;
		return sueldoHorasTrabajadas;
	}
	
	public String mostrarInformacion() {
		String informacion="La informacion del empleado es. \n"
				+"Nombre\n"+this.getNombre()+"id\n"+this.getId()+"salario base\n"+this.getSalario_base();
		return informacion;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	

}
