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
public class PublicServicesCompanies extends CompanyServices implements Proculture{
	//constants
	public final static char SEWERAGE = 'S';
	public final static char ENERGY = 'E';
	public final static char AQUEDUCT = 'A';
	//atributes
	private char typeService;
	private int amountSuscriptors;
	private int amountSuscriptors1And2;
	//constructor
	public PublicServicesCompanies(String n, String ni, String a, String p, int q, double ac, String d, char t, String r, int nf, char ts, int as, int as12){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		typeService = ts;
		amountSuscriptors = as;
		amountSuscriptors1And2 = as12;
	}
	//methods
	public char getTypeService(){
		return typeService;
	}
	public void setTypeService(char newTypeService){
		typeService = newTypeService;
	}
	public int getAmountSuscriptors(){
		return amountSuscriptors;
	}
	public void setAmountSuscriptors(int newAmountSuscriptors){
		amountSuscriptors = newAmountSuscriptors;
	}
	public int getAmountSuscriptors1And2(){
		return amountSuscriptors1And2;
	}
	public void setAmountSuscriptors1And2(int newAmountSuscriptors1And2){
		amountSuscriptors1And2 = newAmountSuscriptors1And2;
	}
	public double procultureTax(){
		double tax = 0;
		tax = 40%-(amountSuscriptors-amountSuscriptors1And2)/amountSuscriptors;
		if(tax < 0){
			tax = 0;
		}
		return tax;
	}

	public String toString(){
		String msg = "";
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += super.toString();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "Public service is: " + typeService;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The amount od suscriptors are:" + amountSuscriptors;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The amount od suscriptors of stratum 1 and 2 are:" +amountSuscriptors1And2;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The proculture tax is:" + procultureTax();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		return msg;
	}
}