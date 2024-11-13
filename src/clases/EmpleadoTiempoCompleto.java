package clases;
public class EmpleadoTiempoCompleto extends Empleado implements Beneficios {
	

	public EmpleadoTiempoCompleto(String nombre, String id, double salario_base) {
		super(nombre, id, salario_base);
		
	}
	
	@Override
	public double calcularSalario() {
		return this.getSalario_base();
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
	

}
