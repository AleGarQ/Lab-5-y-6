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

public class CompanyServices extends Companies{

	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------

	//------------------------------------------------------------------------------------------------

	// Relations

	//------------------------------------------------------------------------------------------------
	ArrayList<Inquest>listI;
	//constructor
	public CompanyServices(String n, String ni, String a, String p, int q, double ac, String d, char t, String r, int nf){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		listI = new ArrayList<Inquest>();
	}
	//methods
	public String addInquest(int q1, int q2, int q3){
		String msg = "has exceeded the number of surveys";
		Inquest obji = new Inquest(q1,q2,q3);
		if(counterInquest()<=50){
			listI.add(obji);
			msg = "successfully added";
		}
		return msg;
	}
	public int counterInquest(){
		int counter = 0;
		for(int i = 0;i<listI.size();i++){
			if(listI.get(i) != null){
				counter ++;
			}
		}
		return counter;
	}
	public double averageQ1(){
		double avera = 0;
		int total = 0;
		int counter = 0;
		for(int i = 0;i<listI.size();i++){
			if(listI.get(i) != null){
				total += listI.get(i).getQualificationQuestion1();
			}
		}
		avera = total/counterInquest();
		return avera;
	}
	public double averageQ2(){
		double avera = 0;
		int total = 0;
		int counter = 0;
		for(int i = 0;i<listI.size();i++){
			if(listI.get(i) != null){
				total += listI.get(i).getQualificationQuestion2();
			}
		}
		avera = total/counterInquest();
		return avera;
	}
	public double averageQ3(){
		double avera = 0;
		int total = 0;
		int counter = 0;
		for(int i = 0;i<listI.size();i++){
			if(listI.get(i) != null){
				total += listI.get(i).getQualificationQuestion3();
			}
		}
		avera = total/counterInquest();
		return avera;
	}
	public String reportAverageQuestion(){
		String msg = "";
		if(counterInquest()<10 || listI.isEmpty() == true){
			msg =  "there are not enough surveys to perform the calculation";
		}
		if(counterInquest()>10){
		msg += "The average of Question 1: "+averageQ1()+"\n";
		msg += "The average of Question 2: "+averageQ2()+"\n";
		msg += "The average of Question 3: "+averageQ3()+"\n";
		msg += "The level of satisfaction is: "+(averageQ1()+averageQ2()+averageQ3())/3+"\n";
		}
		return msg;
	}

	public String toString(){
		String msg = "";
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The name is: " + getName();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The nit is: " + getNit();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The address is: " + getAddress();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The phone is: " + getPhone();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The employee amount is: " + getQuantityOfEmployees();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The value is:  " + getActiveValue();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The born date is " + getDateConstitution();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The organization type is: " + getTypeOfOrganization();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The representant name is: " + getRepresentantName();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "  " + reportAverageQuestion();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		return msg;
	}
}