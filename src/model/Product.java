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

public class Product{

	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------
	private String name;
	private String code;
	private double waterAmount;
	private int inventoryUnitNumber;
	//constructor
	public Product(String n, String c, double w, int i){
		name = n;
		code = c;
		waterAmount = w;
		inventoryUnitNumber = i;
	}
	//methods
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getCode(){
		return code;
	}
		public void setCode(String newCode){
		code = newCode;
	}
	public double getWaterAmount(){
		return waterAmount;
	}
	public void set(double newWaterAmount){
		waterAmount = newWaterAmount;
	}
	public int getInventoryUnitNumber(){
		return inventoryUnitNumber;
	}
	public void setInventoryUnitNumber(int newInventoryUnitNumber){
		inventoryUnitNumber = newInventoryUnitNumber;
	}
	public int TreeByProduct(){
		int tree = 0;
		if(waterAmount >= 1 && waterAmount <= 140){
			tree = 6;
		}
		if(waterAmount >= 141 && waterAmount <= 800){
			tree = 25;
		}
		if(waterAmount > 800){
			tree = 200;
		}
		return tree;
	}
	public String toString(){
		String msg = "";
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The product name is: "+ name;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The identify is: "+ code;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The amount of units is: "+ inventoryUnitNumber;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		return msg;
	}
}