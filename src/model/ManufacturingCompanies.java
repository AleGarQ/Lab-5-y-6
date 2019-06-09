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

public  class ManufacturingCompanies extends Companies{

	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------
	//relations
	private ArrayList<Product> products;
	//constructor
	public ManufacturingCompanies(String n, String ni, String a, String p, int q, double ac, String d, char t, String r, int nf){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		setProducts(new ArrayList<Product>());
	}
	public String addProduct(String namep,String c, double w, int i){
		String text = "";
		Product obj = new Product(namep,c,w,i);
		getProducts().add(obj);
		text = "successfully added";
		return text;
	}
	/**
	 * @return the products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
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
		for(int i = 0; i < products.size();i++){
			msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
			msg += products.get(i).toString();
			msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		}
		return msg;
	}
}