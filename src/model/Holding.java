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

import java.util.*;

public class Holding{

	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------

	//------------------------------------------------------------------------------------------------

	// Relations

	//------------------------------------------------------------------------------------------------
	private ArrayList<Companies> companiess;
	//constructor
	/**
	* Constructor Holding
	* Description: this method creates a holding
	* <b>pos</b>: a holding is created
	*/
	public Holding(){
		companiess = new ArrayList<Companies>();
		addCompany("Tecnoquimicas","210799987","Calle 52 Sur","6655876",56,12009090990.4,"21/08/1956",Companies.MANUFACTURING_INDUSTRY,"Diego Henao",5,"11082",MedicinesCompanies.VALID,"23/01/2034",MedicinesCompanies.IMPORT_AND_SELL);
		addProduct("Tecnoquimicas","Dolex","3985",23.4,23);
	}
	public String addCompany(String name, String nit, String address, String phone, int employeesAmount, double value, String date, char type, String representant,int numberOfFloors, String an, int ny, String rn, int stratum12, int totalStudents){
		String text = "";
		Companies obj = new EducationCompany(name, nit, address, phone, employeesAmount, value, date, type, representant, numberOfFloors, an, ny, rn, stratum12, totalStudents);
		companiess.add(obj);
		text = "it was added successfully";
		return text;
	}
	public String addCompany(String name, String nit, String address, String phone, int employeesAmount, double value, String date, char type, String representant,int numberOfFloors, String s, char st, String e, char m){
		String text = "";
		Companies obj = new MedicinesCompanies(name, nit, address, phone, employeesAmount, value, date, type, representant, numberOfFloors, s,st,e ,m) ;
		 companiess.add(obj);
		text = "it was added successfully";
		return text;
	}
	public String addCompany(String name, String nit, String address, String phone, int employeesAmount, double value, String date, char type, String representant, int numberOfFloors, String l, String qc){
		String text = "";
		Companies obj = new FoodCompany(name, nit, address, phone, employeesAmount, value, date, type, representant, numberOfFloors, l, qc); 
		 companiess.add(obj);
		text = "it was added successfully";
		return text;
	}
	public String addCompany(String name, String nit, String address, String phone, int employeesAmount, double value, String date, char type, String representant, int numberOfFloors, double akw){
		String text = "";
		Companies obj = new TechnologyCompany(name, nit, address, phone, employeesAmount, value, date, type, representant, numberOfFloors, akw );
 		companiess.add(obj);
		text = "it was added succesfuly";
		return text;
	}
	public String addCompany(String name, String nit, String address, String phone, int employeesAmount, double value, String date, char type, String representant, int numberOfFloors, char ts, int asct, int asct12){
		String text = "";
		Companies obj = new PublicServicesCompanies(name, nit, address, phone, employeesAmount, value, date, type, representant, numberOfFloors, ts, asct,asct12);
		companiess.add(obj);
		text = "it was added succesfuly";
		return text;
	}
	public Companies searchSubCompanies(String name){
		Companies subobj = null;
		boolean found = false;
		for(int i=0; i<companiess.size() && found == false ; i++){
			if(companiess.get(i) != null && name.equals(companiess.get(i).getName())){
				subobj = companiess.get(i);
				found = true;
			}
		}
		return subobj;
	}
	public String addEmployee(String namec, String name, String address, String e){
		String text = "the employee could not be added";
		Companies objsc = searchSubCompanies(namec);
		if(objsc != null && (addEmployeeOnCubicle(namec,name,address,e) == true)){
			text = objsc.addEmployee(name, address,e) ;
 		 }
 		if( objsc == null){
 			text = "The company to which you want to add an employee does not exist";
		}
		return text;
	}
	public boolean addEmployeeOnCubicle(String namec, String name, String address, String e){
		boolean text = false;
		Companies objsc = searchSubCompanies(namec);
		if(objsc != null){
			text = objsc.addEmployeeOnCubicle(name, address,e) ;
 		 }
 		if(objsc == null){
 			text = false;
		}
		return text;
	}
	public String addInquest(String namec, int q1, int q2, int q3){
		String text = "The survey could not be added";
		Companies objsc = searchSubCompanies(namec);
		if(objsc != null && ((objsc instanceof TechnologyCompany) || (objsc instanceof EducationCompany) || (objsc instanceof PublicServicesCompanies))){
			text = ((CompanyServices)objsc).addInquest(q1,q2,q3);
		}
		return text;
	}
	public String reportAverageQuestion(String namec){
		String text="the company does not exist or is not address service company";
		Companies objsc = searchSubCompanies(namec);
		if(objsc != null && ((objsc instanceof TechnologyCompany) || (objsc instanceof EducationCompany) || (objsc instanceof PublicServicesCompanies))){
			text = ((CompanyServices)objsc).reportAverageQuestion();
		}
		return text;
	}
	public String reportTreesPlanted(){
		String text="";
		int totaltrees = 0;
		for(int i = 0;i<companiess.size();i++){
			if((companiess.get(i) != null) && (companiess.get(i) instanceof TechnologyCompany)){
				text += "the company "+companiess.get(i).getName()+ " will have to plant this number of trees: "+((TechnologyCompany)companiess.get(i)).treesToSow()+"\name";
				totaltrees += ((TechnologyCompany)companiess.get(i)).treesToSow();
			}
			if((companiess.get(i) != null) && (companiess.get(i) instanceof MedicinesCompanies)){
				text += "the company "+companiess.get(i).getName()+ " will have to plant this number of trees: "+((MedicinesCompanies)companiess.get(i)).treesToSow()+"\name";
				totaltrees += ((MedicinesCompanies)companiess.get(i)).treesToSow();
			}
		}
		text += "The holding will have to plant in total: "+totaltrees+"\name";
		return text;
	}
	public String addProduct(String namec, String namep, String c, double w, int i){
		String text = "The product could not be added, verify that the company is manufacturing";
		Companies objsc = searchSubCompanies(namec);
		if(objsc != null && ((objsc instanceof FoodCompany)||(objsc instanceof MedicinesCompanies))){
			text = ((ManufacturingCompanies)objsc).addProduct(namep,c,w,i);
		}
		return text;
	}
	public String reportProcultureTax(){
		String text = "";
		for(int i=0;i<companiess.size();i++){
			if((companiess.get(i) != null) && (companiess.get(i) instanceof PublicServicesCompanies)){
				text += "the company "+companiess.get(i).getName()+" will have to pay this percentage for Proculture Tax"+((PublicServicesCompanies)companiess.get(i)).procultureTax()+ "% \name";
			}
			if((companiess.get(i) != null) && (companiess.get(i) instanceof EducationCompany)){
				text += "the company "+companiess.get(i).getName()+" will have to pay this percentage for Proculture Tax"+((EducationCompany)companiess.get(i)).procultureTax()+"% \name";
			}
		}
		return text;
	}

	public String inL(String name) {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
		 	msg += companiess.get(i).inL(name);
		} 
		return msg;
	}

	public String inZ(String name) {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
		 	msg += companiess.get(i).inZ(name);
		} 
		return msg;
	}

	public String inX(String name) {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
		 	msg += companiess.get(i).inX(name);
		}
		return msg;
	}

	public String inO(String name) {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
		 	msg += companiess.get(i).inO(name);
		}
		return msg;
	}

	public String inE(String name) {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
		 	msg += companiess.get(i).inE(name);
		}
		return msg;
	}

	public String esprial(String charge) {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
		 	msg += companiess.get(i).espiral(charge);
		}
		return msg;
	}

	public String toString() {
		String msg = "";
		for (int i = 0;i<companiess.size() ;i++ ) {
			msg += companiess.get(i).toString();
		}
		return msg;
	}
}