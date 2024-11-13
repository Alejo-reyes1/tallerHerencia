package Main;

import javax.swing.JOptionPane;

import clases.EmpleadoContratista;
import clases.EmpleadoMedioTiempo;
import clases.EmpleadoTiempoCompleto;
import clases.Laboratorio;

public class Main {
	
	public static Laboratorio l=new Laboratorio("l");

	public static void main(String[] args) {
		int tipoEmpleado;
		do {
			tipoEmpleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de empleado que desea agregar al laboratorio\n 1.agregar empleado\n 2.Empleado medio tiempo\n 3.Empleado contratista\n 4. obtener lista de beneficiarios\n 5.mostrar informacion."));
			opcionEmpleado(tipoEmpleado);
		}while(tipoEmpleado<4);
	}
	
	

	private static void opcionEmpleado(int tipoEmpleado) {
		switch(tipoEmpleado) {
		case 1: 
			agregarEmpleadoTiempoCompelto();
			break;
		case 2:
			agregarEmpleadoMedioTiempo();
			break;
		case 3:
			agregarEmpleadoContratista();
			break;
		case 4:
			listaBeneficioarios();
			break;
		case 5:
			mostrarInformacionEmpleados();
			break;
		}
	}

	private static void mostrarInformacionEmpleados() {
		String listaInformacionEmpleados=l.informacionEmpleados();
		JOptionPane.showMessageDialog(null, listaInformacionEmpleados);
	}
	private static void listaBeneficioarios() {
		String listaBeneficioarios=l.obtenerListaBeneficiarios();
		JOptionPane.showMessageDialog(null, listaBeneficioarios);
	}
	private static void agregarEmpleadoContratista() {
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		String id=JOptionPane.showInputDialog("Ingrese el id del empleado");
		double salarioBase=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
		int horasTrabajados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el empleado"));
		EmpleadoContratista e=new EmpleadoContratista(nombre, id, salarioBase, horasTrabajados);
		l.agregarEmpleado(e);
	}

	private static void agregarEmpleadoMedioTiempo() {
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		String id=JOptionPane.showInputDialog("Ingrese el id del empleado");
		double salarioBase=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
		int diasTrabajados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias trabajos por el empleado"));
		EmpleadoMedioTiempo e=new EmpleadoMedioTiempo(nombre,id,salarioBase,diasTrabajados);
		l.agregarEmpleado(e);
	}

	private static void agregarEmpleadoTiempoCompelto() {
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		String id=JOptionPane.showInputDialog("Ingrese el id del empleado");
		double salarioBase=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
		EmpleadoTiempoCompleto e=new EmpleadoTiempoCompleto(nombre,id,salarioBase);
		l.agregarEmpleado(e);
	}

}
