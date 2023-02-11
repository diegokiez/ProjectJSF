/**
 * 
 */
package com.diegokiez.project.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.diegokiez.project.entity.Empleado;
import com.diegokiez.project.services.EmpleadoServices;

/**
 * @author diegokiez
 * Control de la pagina principal.xhtml
 *
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	private List<Empleado> empleados;
	private EmpleadoServices empleadoService = new EmpleadoServices();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
