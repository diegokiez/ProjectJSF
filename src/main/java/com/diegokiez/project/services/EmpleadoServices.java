/**
 * 
 */
package com.diegokiez.project.services;

import java.util.ArrayList;
import java.util.List;

import com.diegokiez.project.entity.Empleado;

/**
 * @author diegokiez
 *	Clase que permite la logica de negocio para empleados
 */
public class EmpleadoServices {
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Juanito");
		empleadoIBM.setPrimerApellido("Perez");
		empleadoIBM.setSegundoApellido("Gomez");
		empleadoIBM.setPuesto("Cerillito");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Menganito");
		empleadoMicrosoft.setPrimerApellido("Perez");
		empleadoMicrosoft.setSegundoApellido("Gomez");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Sutanito");
		empleadoApple.setPrimerApellido("Perez");
		empleadoApple.setSegundoApellido("Gomez");
		empleadoApple.setPuesto("Cocinero");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
	
}
