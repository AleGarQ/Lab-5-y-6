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
public class MedicinesCompanies extends ManufacturingCompanies implements TreeByWaterOrEnergy{
	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	
	public final static char VALID = 'V';
	public final static char NO_VALID = 'N';
	public final static char MANUFACTURE_AND_EXPORT = 'E';
	public final static char MANUFACTURE_AND_SELL = 'S';
	public final static char IMPORT_AND_SELL = 'I';
	//atributtes
	private String sanitaryRegistration;
	private char state;
	private String expiration;
	private char modality;
	//constructor
	public MedicinesCompanies(String n, String ni, String a, String p, int q, double ac, String d, char t, String r,int nf, String s, char st, String e, char m){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		sanitaryRegistration = s;
		state = st;
		expiration = e;
		modality = m;
	}
	//methods
	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}
	public void setSanitaryRegistration(String newSanitaryRegistration){
		sanitaryRegistration = newSanitaryRegistration;
	}
	public char getState(){
		return state;
	}
	public void setState(char newState){
		state = newState;
	}
	public String getExpiration(){
		return expiration;
	}
	public void setExpiration(String newExpiration){
		expiration = newExpiration;
	}
	public char getModality(){
		return modality;
	}
	public void setModality(char newModality){
		modality = newModality;
	}
	public int treesToSow(){
		int sow = 0;
		for(int i = 0;i<getProducts().size();i++){
			if(getProducts().get(i) != null){
				sow += getProducts().get(i).TreeByProduct();
			}
		}
		return sow;
	}
	public String toString(){
		String msj = "";
		msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msj += super.toString();
		msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msj += "The sanitary registration is: " + sanitaryRegistration;
		msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msj += "The state is: " + state;
		msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msj += "The expiration is: " + expiration;
		msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msj += "The modality is: " + modality;
		msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msj += "The amount of trees to sow is: " + treesToSow();
		return msj;
	}

}