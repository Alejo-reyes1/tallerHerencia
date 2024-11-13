package clases;
import java.util.ArrayList;

public class Laboratorio {
	private String nombre;
	private ArrayList<Empleado>listaEmpleados;
	
	public Laboratorio(String nombre) {
		super();
		this.nombre = nombre;
		this.listaEmpleados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public void agregarEmpleado(Empleado e) {
		this.listaEmpleados.add(e);
	}
	
	public String obtenerListaBeneficiarios() {
		String mensaje="";
		for(Empleado e:this.listaEmpleados) {
			mensaje=e.obtenerListaBeneficios();
		}
		return mensaje;
	}
	public String informacionEmpleados() {
		String mensaje="";
		for(Empleado e:this.listaEmpleados) {
			mensaje=e.mostrarInformacion();
		}
		return mensaje;
	}
	

}
