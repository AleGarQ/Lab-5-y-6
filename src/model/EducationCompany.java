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

public class EducationCompany extends CompanyServices implements Proculture{
			
	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	
	public final static String HIGHSCHOOL = "High School";
	public final static String UNIVERSITY = "University";

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------
	private String approvalNumber;
	private int numberOfYearsOfApproval;
	private String rectorName;
	private int students1And2;
	private int activeStudents;
	//constructor
	public EducationCompany(String n, String ni, String a, String p, int q, double ac, String d, char t, String r, int nf, String an, int ny, String rn, int s12, int as){
		super(n,ni,a,p,q,ac,d,t,r,nf);
		approvalNumber = an;
		numberOfYearsOfApproval = ny;
		rectorName = rn;
		students1And2 = s12;
		activeStudents = as;
	}
	//methods
	public String getApprovalNumber(){
		return approvalNumber;
	}
	public void setApprovalNumber(String newApprovalNumber){
		approvalNumber = newApprovalNumber;
	}
	public int getNumberOfYearsOfApproval(){
		return numberOfYearsOfApproval;
	}
	public void setNumberOfYearsApproval(int newNumberOfYearsApproval){
		numberOfYearsOfApproval = newNumberOfYearsApproval;
	}
	public String getRectorName(){
		return rectorName;
	}
	public void setRectorName(String newRectorName){
		rectorName = newRectorName;
	}
	public int getStudents1And2(){
		return students1And2;
	}
	public void setStudents1And2(int newStudents1And2){
		students1And2 = newStudents1And2;
	}
	public int getActiveStudents(){
		return activeStudents;
	}
	public void set(int newActiveStudents){
		activeStudents = newActiveStudents;
	}
	public double procultureTax(){
		double tax = 0;
		tax = 20% - (students1And2/activeStudents);
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
		msg += "The approval number is: " + approvalNumber;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The number of years of arpproval is: " + numberOfYearsOfApproval;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The rector name is: " +rectorName;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The number of students of stratum 1 and 2 is: " + students1And2;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The total number of active students is:" +activeStudents;
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		msg += "The proculture tax is: " + procultureTax();
		msg += "---------------------------------------------------------------------------------------------------------------------------- \n";
		return msg;
		}
}