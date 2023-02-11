/**
 * 
 */
package com.diegokiez.project.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author diegokiez
 * Clase para controlar el funcionamiento de la pantalla login.xhtml
 */
@ManagedBean
public class LoginController {
	/**
	 * Usuario que ingresa en el login
	 */
	private String usuario;
	/**
	 * Contraseña que ingresa en el login
	 */
	private String contraseña;
	/**
	 * Accion del boton del login
	 */
	public void ingresar() {
		if (usuario.equals("depredador") && contraseña.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin: us", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
			/*FacesContext.getCurrentInstance().addMessage("formLogin: us", 
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));*/
		}else {
			/*FacesContext.getCurrentInstance().addMessage("formLogin: us", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y contraseña no coinciden", ""));*/
		}
	}
	
	private void redireccionar(String pagina) throws IOException{
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
