package clases;
import java.util.ArrayList;

public abstract class Empleado {
	private String nombre;
	private String id;
	private double salario_base;
	private ArrayList<String>listaBeneficios;
	
	public Empleado(String nombre, String id2, double salario_base) {
		this.nombre = nombre;
		this.id = id2;
		this.salario_base = salario_base;
		this.listaBeneficios=new ArrayList<>();
	}
	

	public ArrayList<String> getListaBeneficios() {
		return listaBeneficios;
	}


	public void setListaBeneficios(ArrayList<String> listaBeneficios) {
		this.listaBeneficios = listaBeneficios;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	public String obtenerListaBeneficios() {
		String mensaje="";
		for(String s:this.listaBeneficios) {
			mensaje+=s;
		}
		return mensaje;
	}
	
	public  abstract double calcularSalario();

	public abstract String mostrarInformacion();
}
