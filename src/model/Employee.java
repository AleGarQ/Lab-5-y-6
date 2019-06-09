/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Laboratio #5 & 6
 * Autor: Alejandro Garcia Quiñonez <alejo.gar.122@gmail.com>
 * Periodo: 2019-1
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package model;
public class Employee{
	//atributes
	private String name;
	private String appointment;
	private String email;
	//constructor
	public Employee(String name, String appontment, String email){
		this.name = name;
		this.appointment = appontment;
		this.email = email;
	}
	//methods
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getAppointment(){
		return appointment;
	}
	public void setAppointment(String newAppointment){
		appointment = newAppointment;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String newEmail){
		email = newEmail;
	}
}