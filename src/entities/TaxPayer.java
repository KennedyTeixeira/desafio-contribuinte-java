package entities;

import util.TaxCalculator;

public class TaxPayer {

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpendig;
	private Double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpendig,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpendig = healthSpendig;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpendig() {
		return healthSpendig;
	}

	public void setHealthSpendig(Double healthSpendig) {
		this.healthSpendig = healthSpendig;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		return TaxCalculator.salaryCalc(salaryIncome);		
	}
	
	public double serviceTax() {
		return TaxCalculator.serviceCalc(servicesIncome);
	}
	
	public double capitalTax() {
		return TaxCalculator.capitalCalc(capitalIncome);
	}
	
	public double grossTax() {
		return salaryTax() + serviceTax() + capitalTax();
	}
	
	public double taxRebate() {
		if(grossTax() * TaxCalculator.DEDUCTIBLE_TAX < TaxCalculator.deductibleCalc(healthSpendig, educationSpending)) {
			return grossTax() * TaxCalculator.DEDUCTIBLE_TAX;
		}
		else {
			return TaxCalculator.deductibleCalc(healthSpendig, educationSpending);
		}		
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	public String toString() {
		return "\nImposto bruto total: " + String.format("%.2f%n", grossTax()) +
			   "Abatimento: " + String.format("%.2f%n", taxRebate()) +
			   "Imposto devido: " + String.format("%.2f", netTax());			   
	}
	
}
