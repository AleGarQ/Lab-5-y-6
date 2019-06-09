/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Laboratio #5 & 6
 * Autor: Alejandro Garcia Quiñonez <alejo.gar.122@gmail.com>
 * Periodo: 2019-1
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ui;

import java.util.*;
import model.*;

public class Main{

		//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------
	private Scanner scanStr;
	private Scanner scanInt;
	private Scanner scanDou;

	//------------------------------------------------------------------------------------------------

	// Relations

	//------------------------------------------------------------------------------------------------
	private Holding controler; 

	//------------------------------------------------------------------------------------------------

	// Methods

	//------------------------------------------------------------------------------------------------
	// Constructor
	public Main(){
		controler = new Holding();
		scanStr = new Scanner(System.in);
		scanInt = new Scanner(System.in);
		scanDou = new Scanner(System.in);
	}

	public static void main(String[] args){
		Main main = new Main();
		main.showHeader();
		main.showMenu();
	}

	public void showHeader() {

	}

	public void showMenu() {
		boolean back = false;
		System.out.println("");
		System.out.println("");
		showOptions();                                                  
		while (!back) {
			int option = scanInt.nextInt();
			scanInt.nextLine();
			try {
				switch (option) {
					case 0: 
						getOut();
						back = false;
					break;
					case 1: 
						addNewCompany();
					break;
					case 2:
						addNewEmployee();
					break;
					case 3:
						addAInquest();
					break;
					case 4:
						addAProduct();
					break;
					case 5:
						levelOfSatisfaction();
					break;
					case 6:
						treeToPlant();
					break;
					case 7:
						procultureTaxes();
					break;
					case 8:
						showAllinformation();
					break;
					case 9:
						findExtension();
					break;
					case 10:
						espiral();
					break;
					case 11:

					break;
					default:
						System.out.println("Only numbers between 1 and 11");
					break;
				}
			} catch (InputMismatchException e) {
          	 	System.out.println("You have to write a number");
           		scanInt.nextLine();
			}
		}	
	}

	public void showOptions() {
		System.out.println("0.  Get out");
		System.out.println("1.  Add a new Company");
		System.out.println("2.  Add Employee");
		System.out.println("3.  Add Inquest");
		System.out.println("4.  Add Product");
		System.out.println("5.  Find out the level of satisfaction of a service company");
		System.out.println("6.  Find out the amount of trees to plant");
		System.out.println("7.  See The Proculture taxes that each company has to pay");
		System.out.println("8.  Show all the information of the holding");
		System.out.println("9.  Find a Extension ginving the name");
		System.out.println("10. Find emails giving a charge");
		System.out.println("11. ");
	}
	
	public void addNewCompany() {
		System.out.println("What kind of company do you want to add?");
		int op = scanInt.nextInt();
		System.out.println("1. Add a Food Company");
		System.out.println("2. Add a Education Company");
		System.out.println("3. Add a Public Services Company");
		System.out.println("4. Add a Technology Company");
		System.out.println("5. Add a Medicine Company");
		try {
			switch(op) {
				case 1:
					addFoodCompany();
				break;
				case 2:
					addEducationCompany();
				break;
				case 3:
					addPublicServicesCompany();
				break;
				case 4:
					addTechnologyCompany();
				break;
				case 5:
					addMedicineCompany();
				break;
				default:
					System.out.println("Only numbers between 1 and 5");
				break;
			}
		} catch (InputMismatchException e) {
          	System.out.println("You have to write a number");
           	scanInt.nextLine();
		}
	}

	public void addFoodCompany() {
		System.out.println("Enter the name of the company");
		String name = scanStr.nextLine();
		System.out.println("Enter the NIT of the company");
		String nit = scanStr.nextLine();
		System.out.println("Enter the addres of the company");
		String address = scanStr.nextLine();
		System.out.println("Enter the phone of the company");
		String phone = scanStr.nextLine();
		System.out.println("Enter the quantity of Employees");
		int quantityE = scanInt.nextInt();
		System.out.println("Enter the active value of the company");
		double active = scanDou.nextDouble();
		System.out.println("Enter the date of constitution of the company. \n A for agriculture \n E for exploitation of mines \n M for manufacturing industrie \n G for electricity, gas and steam \n C for construction \n W for wholesale \n T for transportation \n F for financial \n S for social communals");
		String dateOfC = scanStr.nextLine();
		System.out.println("Enter the type of organization");
		char to = scanStr.nextLine().charAt(0);
		System.out.println("Enter the representant name of the company ");
		String rn = scanStr.nextLine();
		System.out.println("Enter the number of floors by the building of the company, it must be between 3 and 7");
		int nf = scanInt.nextInt();
		System.out.println("Enter the license of the company");
		String l = scanStr.nextLine();
		System.out.println("Enter the quality certification number");
		String qcn = scanStr.nextLine();
		System.out.println(controler.addCompany(name,nit,address,phone,quantityE,active,dateOfC,to,rn,nf,l,qcn));
	}

	public void addEducationCompany() {
		System.out.println("Enter the name of the company");
		String name;
		name = scanStr.nextLine();
		System.out.println("Enter the NIT of the company");
		String nit;
		nit = scanStr.nextLine();
		System.out.println("Enter the addres of the company");
		String address;
		address = scanStr.nextLine();
		System.out.println("Enter the phone of the company");
		String phone;
		phone = scanStr.nextLine();
		System.out.println("Enter the quantity of Employees");
		int quantityE;
		quantityE = scanInt.nextInt();
		System.out.println("Enter the active value of the company");
		double active;
		active = scanDou.nextDouble();
		System.out.println("Enter the date of constitution of the company. \n A for agriculture \n E for exploitation of mines \n M for manufacturing industrie \n G for electricity, gas and steam \n C for construction \n W for wholesale \n T for transportation \n F for financial \n S for social communals");
		String dateOfC;
		dateOfC = scanStr.nextLine();
		System.out.println("Enter the type of organization");
		char to;
		to = scanStr.nextLine().charAt(0);
		System.out.println("Enter the representant name of the company ");
		String rn;
		rn = scanStr.nextLine();
		System.out.println("Enter the number of floors by the building of the company, it must be between 3 and 7");
		int nf;
		nf = scanInt.nextInt();
		System.out.println("Enter the approval number of the education comapany");
		String an;
		an = scanStr.nextLine();
		System.out.println("Enter the number of years of approval of the education company");
		int ny;
		ny = scanInt.nextInt();
		System.out.println("Enter the rector name");
		String rec;
		rec = scanStr.nextLine();
		System.out.println("Enter the number of students");
		int ns;
		ns = scanInt.nextInt();
		System.out.println("Enter the number of students stratum 1 and 2");
		int ns12;
		ns12 = scanInt.nextInt();
		System.out.println(controler.addCompany(name,nit,address,phone,quantityE,active,dateOfC,to,rn,nf,an,ny,rec,ns12,ns));
	}

	public void addPublicServicesCompany() {
		System.out.println("Enter the name of the company");
		String name;
		name = scanStr.nextLine();
		System.out.println("Enter the NIT of the company");
		String nit;
		nit = scanStr.nextLine();
		System.out.println("Enter the addres of the company");
		String address;
		address = scanStr.nextLine();
		System.out.println("Enter the phone of the company");
		String phone;
		phone = scanStr.nextLine();
		System.out.println("Enter the quantity of Employees");
		int quantityE;
		quantityE = scanInt.nextInt();
		System.out.println("Enter the active value of the company");
		double active;
		active = scanDou.nextDouble();
		System.out.println("Enter the date of constitution of the company. \n A for agriculture \n E for exploitation of mines \n M for manufacturing industrie \n G for electricity, gas and steam \n C for construction \n W for wholesale \n T for transportation \n F for financial \n S for social communals");
		String dateOfC;
		dateOfC = scanStr.nextLine();
		System.out.println("Enter the type of organization");
		char to;
		to = scanStr.nextLine().charAt(0);
		System.out.println("Enter the representant name of the company ");
		String rn;
		rn = scanStr.nextLine();
		System.out.println("Enter the number of floors by the building of the company, it must be between 3 and 7");
		int nf;
		nf = scanInt.nextInt();
		System.out.println("Enter the type of service");
		char tsp;
		tsp = scanStr.nextLine().charAt(0);
		System.out.println("Enter the aumont suscriptors");
		int asp;
		asp = scanInt.nextInt();
		System.out.println("Enter the amount suscriptors stratum 1 and 2");
		int asp12;
		asp12 = scanInt.nextInt();
		System.out.println(controler.addCompany(name,nit,address,phone,quantityE,active,dateOfC,to,rn,nf,tsp,asp,asp12));
	}

	public void addTechnologyCompany() {
		System.out.println("Enter the name of the company");
		String name;
		name = scanStr.nextLine();
		System.out.println("Enter the NIT of the company");
		String nit;
		nit = scanStr.nextLine();
		System.out.println("Enter the addres of the company");
		String address;
		address = scanStr.nextLine();
		System.out.println("Enter the phone of the company");
		String phone;
		phone = scanStr.nextLine();
		System.out.println("Enter the quantity of Employees");
		int quantityE;
		quantityE = scanInt.nextInt();
		System.out.println("Enter the active value of the company");
		double active;
		active = scanDou.nextDouble();
		System.out.println("Enter the date of constitution of the company. \n A for agriculture \n E for exploitation of mines \n M for manufacturing industrie \n G for electricity, gas and steam \n C for construction \n W for wholesale \n T for transportation \n F for financial \n S for social communals");
		String dateOfC;
		dateOfC = scanStr.nextLine();
		System.out.println("Enter the type of organization");
		char to;
		to = scanStr.nextLine().charAt(0);
		System.out.println("Enter the representant name of the company ");
		String rn;
		rn = scanStr.nextLine();
		System.out.println("Enter the number of floors by the building of the company, it must be between 3 and 7");
		int nf;
		nf = scanInt.nextInt();
		System.out.println("Enter the consume of KW of the company");
		double ckw;
		ckw = scanDou.nextDouble();
		System.out.println(controler.addCompany(name,nit,address,phone,quantityE,active,dateOfC,to,rn,nf,ckw));
	}

	public void addMedicineCompany() {
		System.out.println("Enter the name of the company");
		String name;
		name = scanStr.nextLine();
		System.out.println("Enter the NIT of the company");
		String nit;
		nit = scanStr.nextLine();
		System.out.println("Enter the addres of the company");
		String address;
		address = scanStr.nextLine();
		System.out.println("Enter the phone of the company");
		String phone;
		phone = scanStr.nextLine();
		System.out.println("Enter the quantity of Employees");
		int quantityE;
		quantityE = scanInt.nextInt();
		System.out.println("Enter the active value of the company");
		double active;
		active = scanDou.nextDouble();
		System.out.println("Enter the date of constitution of the company. \n A for agriculture \n E for exploitation of mines \n M for manufacturing industrie \n G for electricity, gas and steam \n C for construction \n W for wholesale \n T for transportation \n F for financial \n S for social communals");
		String dateOfC;
		dateOfC = scanStr.nextLine();
		System.out.println("Enter the type of organization");
		char to;
		to = scanStr.nextLine().charAt(0);
		System.out.println("Enter the representant name of the company ");
		String rn;
		rn = scanStr.nextLine();
		System.out.println("Enter the number of floors by the building of the company, it must be between 3 and 7");
		int nf;
		nf = scanInt.nextInt();
		System.out.println("Enter the sanitary registration");
		String sr;
		sr = scanStr.nextLine();
		System.out.println("Enter the state of sanitary registration");
		char ssr;
		ssr = scanStr.nextLine().charAt(0);
		System.out.println("Enter the expiration of the sanitary registration");
		String esr;
		esr = scanStr.nextLine();
		System.out.println("Enter the modality of the company");
		char mod;
		mod = scanStr.nextLine().charAt(0);
		System.out.println(controler.addCompany(name,nit,address,phone,quantityE,active,dateOfC,to,rn,nf,sr,ssr,esr,mod));
	}
	//
	public void addNewEmployee() {
		System.out.println("Enter the name of the company you want to register a new employee");
		String namec;
		namec = scanStr.nextLine();
		System.out.println("Enter the name of the new employee");
		String name;
		name = scanStr.nextLine();
		System.out.println("Enter the appointment of the new employee");
		String appo;
		appo = scanStr.nextLine();
		System.out.println("Enter the email of the new employee");
		String email;
		email = scanStr.nextLine();
		System.out.println(controler.addEmployee(namec,name,appo,email));
	}

	public void addAInquest() {
		System.out.println("Enter the name of the company to which you want to add a survey");
		String namec;
		namec = scanStr.nextLine();
		System.out.println("From 1 to 5, how was the service provided?");
		int q1;
		q1 = scanInt.nextInt();
		System.out.println("From 1 to 5, how was the response time?");
		int q2;
		q2 = scanInt.nextInt();
		System.out.println("From 1 to 5, from 1 to 5, how was the cost-benefit ratio of the service?");
		int q3;
		q3 = scanInt.nextInt();
		System.out.println(controler.addInquest(namec,q1,q2,q3));
	}
	
	public void addAProduct() {
		System.out.println("Enter the name of the company to which you want to add a survey");
		String namec;
		namec = scanStr.nextLine();
		System.out.println("Enter the name of the porduct");
		String namep;
		namep = scanStr.nextLine();
		System.out.println("Enter the code of the product");
		String c;
		c = scanStr.nextLine();
		System.out.println("Enter the amount of water the product needs to be produced");
		double w;
		w = scanDou.nextDouble();
		System.out.println("Enter the amount of product you have in inventary");
		int i;
		i = scanInt.nextInt();
		System.out.println(controler.addProduct(namec,namep,c,w,i));
	}
	
	public void levelOfSatisfaction() {
		System.out.println("Enter the name of the company you want to know the level of satisfaction");
		String namec;
		namec = scanStr.nextLine();
		System.out.println(controler.reportAverageQuestion(namec));
	}

	public void treeToPlant() {
		System.out.println(controler.reportTreesPlanted());
	}

	public void procultureTaxes() {
		System.out.println(controler.reportProcultureTax());
	}

	public void showAllinformation() {
		System.out.println(controler.toString());
	}

	public void findExtension() {
		System.out.println("What kind of search do you want");
		System.out.println("1. in L");
		System.out.println("2. in Z");
		System.out.println("3. in X");
		System.out.println("4. in O");
		System.out.println("5. in E");
		System.out.println("in case of repeat names in the holding, we will show all the extensions");
		int opt = scanInt.nextInt();
		scanInt.nextLine();
		try {
			switch(opt) {
				case 1:
					inL();
				break;
				case 2:
					inZ();
				break;
				case 3:
					inX();
				break;
				case 4:
					inO();
				break;
				case 5:
					inE();
				break;
				default:
					System.out.println("Only numbers between 1 and 5");
				break;
			}
		} catch (InputMismatchException e) {
          	System.out.println("You have to write a number");
           	scanInt.nextLine();
		}
	}

	public void inL() {
		System.out.println("Enter the name of the employee");
		String name = scanStr.nextLine();
		System.out.println(controler.inL(name));
	}

	public void inZ() {
		System.out.println("Enter the name of the employee");
		String name = scanStr.nextLine();
		System.out.println(controler.inZ(name));
	}

	public void inX() {
		System.out.println("Enter the name of the employee");
		String name = scanStr.nextLine();
		System.out.println(controler.inX(name));
	}

	public void inO() {
		System.out.println("Enter the name of the employee");
		String name = scanStr.nextLine();
		System.out.println(controler.inO(name));
	}

	public void inE() {
		System.out.println("Enter the name of the employee");
		String name = scanStr.nextLine();
		System.out.println(controler.inE(name));
	}

	public void espiral() {
		System.out.println("Enter the appointment");
		String charge = scanStr.nextLine();
		System.out.println(controler.esprial(charge));
	}

	public void getOut() {
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("");
		System.out.println("THANK YOU FOR USING MY HOLDING SOFTWARE");
		System.out.println("");
	}
}