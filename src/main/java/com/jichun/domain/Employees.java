package com.jichun.domain;

public class Employees {
	private int EMPLOYEE_ID;
	private String FIRST_NAME;//
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private String HIRE_DATE;
	private String JOB_ID;
	private double SALARY;
	private double COMMISSION_Pct;
	private int MANAGER_ID;
	private int DEPARTMENT_ID;

	public Employees() {
	}

	public Employees(int eMPLOYEE_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, String pHONE_NUMBER,
			String hIRE_DATE, String jOB_ID, double sALARY, double cOMMISSION_Pct, int mANAGER_ID, int dEPARTMENT_ID) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
		HIRE_DATE = hIRE_DATE;
		JOB_ID = jOB_ID;
		SALARY = sALARY;
		COMMISSION_Pct = cOMMISSION_Pct;
		MANAGER_ID = mANAGER_ID;
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}

	public String getHIRE_DATE() {
		return HIRE_DATE;
	}

	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}

	public String getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public double getSALARY() {
		return SALARY;
	}

	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}

	public double getCOMMISSION_Pct() {
		return COMMISSION_Pct;
	}

	public void setCOMMISSION_Pct(double cOMMISSION_Pct) {
		COMMISSION_Pct = cOMMISSION_Pct;
	}

	public int getMANAGER_ID() {
		return MANAGER_ID;
	}

	public void setMANAGER_ID(int mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}

	public int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

}
