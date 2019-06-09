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
public class FoodCompany extends ManufacturingCompanies{
	//atributes 
	private String license;
	private String qualityCertificationNumber;
	//constructor
	public FoodCompany(String n, String ni, String a, String p, int q, double ac, String d, char t, String r, int nf, String l, String qc){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		license = l;
		qualityCertificationNumber = qc;
	}
	//methods
	public String getLicense(){
		return license;
	}
	public void setLicense(String newLicense){
		license = newLicense;
	}
	public String getQualityCertificationNumber(){
		return qualityCertificationNumber;
	}
	public void setQualityCertificationNumber(String newQualityCertificationNumber){
		qualityCertificationNumber = newQualityCertificationNumber;
	}
	public String toString(){
		String msg = "";
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += super.toString();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The license is: " + license;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The quality certification number is:" + qualityCertificationNumber;
		return msg;
	}

}