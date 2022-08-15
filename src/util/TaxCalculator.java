package util;

public class TaxCalculator {
	
	public static final double SALARY_TAX_1 = 0.1;
	public static final double SALARY_TAX_2 = 0.2;
	public static final double SERVICE_TAX = 0.15;
	public static final double CAPITAL_TAX = 0.2;
	public static final double DEDUCTIBLE_TAX = 0.3;	
	
	public static double salaryCalc(double salaryAnnual) {		
		if (salaryAnnual / 12.0 >= 5000.0) {
			return salaryAnnual * SALARY_TAX_2;		
		}
		else if (salaryAnnual / 12.0 >= 3000.0) {
			return salaryAnnual * SALARY_TAX_1;
		}	
		else {
			return  0.0;
		}		
	}
	
	public static double serviceCalc(double serviceAnnual) {
		return serviceAnnual * SERVICE_TAX;		
	}
	
	public static double capitalCalc(double capitalAnnual) {
		return capitalAnnual * CAPITAL_TAX;
	}
	
	public static double deductibleCalc(double medicalExpenses, double educationExpenses) {		
		return medicalExpenses + educationExpenses;
	}
	
}
