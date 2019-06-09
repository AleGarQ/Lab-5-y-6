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
public class TechnologyCompany extends CompanyServices implements TreeByWaterOrEnergy{
	//atributes
	private String [] listServices = {"consulting training", "custom software development", "infrastructure as a service", "software as a service", "platform as a service"};
	private double amountKW;
	//constructor
	public TechnologyCompany(String n, String ni, String a, String p, int q, double ac, String d, char t, String r, int nf, double akw){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		amountKW = akw;
	}
	//methods
	public double getAmountKW(){
		return amountKW;
	}
	public void setAmountKW(double newAmountKW){
		amountKW = newAmountKW;
	}
	public int treesToSow(){
		int trees = 0;
		if(amountKW >= 1 && amountKW <= 1000){
			trees = 8;
		}
		if(amountKW > 1000 && amountKW <= 3000){
			trees = 35;
		}
		if(amountKW > 3000){
			trees = 500;
		}
		return trees;
	}
	/**
	 * @return the listServices
	 */
	public String [] getListServices() {
		return listServices;
	}
	/**
	 * @param listServices the listServices to set
	 */
	public void setListServices(String [] listServices) {
		this.listServices = listServices;
	}
	public String toString(){
		String msg = "";
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += super.toString();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The amount of kilo wats is: " + amountKW;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The amount of trees to sow are: " + treesToSow();
		return msg;
	}
}