package clases;
public class EmpleadoMedioTiempo extends Empleado implements Beneficios {
	
	private int diasTrabajadas;

	public EmpleadoMedioTiempo(String nombre, String id, double salario_base,int diasTrabajadas) {
		super(nombre, id, salario_base);
		this.diasTrabajadas=diasTrabajadas;
	}
	@Override
	public double calcularSalario() {
		double sueldoBase=this.getSalario_base();
		double sueldoDia=sueldoBase/30;
		return sueldoDia*this.diasTrabajadas;
	}

	@Override
	public String obtenerBeneficios() {
		String mensaje="los beneficios del empleado "+this.getNombre()+" son \n";
		for(String s:this.getListaBeneficios()) {
			mensaje+=s+"\n";
		}
		return mensaje;
	}
		
		

	@Override
	public void agregarBeneficio(String beneficio) {
		this.getListaBeneficios().add(beneficio);
	}
	
	public String mostrarInformacion() {
		String informacion="La informacion del empleado es. \n"
				+"Nombre\n"+this.getNombre()+"id\n"+this.getId()+"salario base\n"+this.getSalario_base()+"beneficios"+this.getListaBeneficios();
		return informacion;
	}

	public int getDiasTrabajadas() {
		return diasTrabajadas;
	}

	public void setDiasTrabajadas(int diasTrabajadas) {
		this.diasTrabajadas = diasTrabajadas;
	}
	
	
	
	

}
