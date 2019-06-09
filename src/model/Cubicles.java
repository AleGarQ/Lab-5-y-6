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

public class Cubicles{
			
	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------
	private int extension;
	//constructor
	public Cubicles(int e){
		extension = e;
	}
	//relations
	private Employee employeeOnCubicle;
	//methods
	public int getExtension(){
		return extension;
	}
	public void setExtension(int newExtension){
		extension = newExtension;
	}
	public Employee getEmployee(){
		return employeeOnCubicle;
	}
	public boolean addEmployeeToCubicle(String n, String a, String e){
		boolean ward = false;
		if(employeeOnCubicle==null){
			employeeOnCubicle = new Employee (n,a,e);
			ward = true;
		}
		return ward;
	}
}