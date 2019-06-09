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

public class Inquest{

	//------------------------------------------------------------------------------------------------

	// Constants

	//------------------------------------------------------------------------------------------------	

	//------------------------------------------------------------------------------------------------

	// Atributes

	//------------------------------------------------------------------------------------------------
	private int qualificationQuestion1;
	private int qualificationQuestion2;
	private int qualificationQuestion3;
	
	//contructor
	public Inquest(int q1, int q2, int q3){
		qualificationQuestion1 = q1;
		qualificationQuestion2 = q2;
		qualificationQuestion3 = q3;
	}
	//methods
	public int getQualificationQuestion1(){
		return qualificationQuestion1;
	}
	public void setQualificationquestion1(int newQualificationQuestion1){
		qualificationQuestion1 = newQualificationQuestion1;
	}	
	public int getQualificationQuestion2(){
		return qualificationQuestion2;
	}
	public void setQualificationquestion2(int newQualificationQuestion2){
		qualificationQuestion2 = newQualificationQuestion2;	
	}
	public int getQualificationQuestion3(){
		return qualificationQuestion3;
	}
	public void setQualificationquestion3(int newQualificationQuestion3){	
		qualificationQuestion3 = newQualificationQuestion3;
	}
	}