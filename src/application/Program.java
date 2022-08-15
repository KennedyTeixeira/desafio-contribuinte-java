package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listTaxPayer = new ArrayList<>();		
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nDigite os dados do %do contribuinte:%n", i+1);
			
			System.out.print("Renda anual com salário: ");
			double salaryAnnual = sc.nextDouble();
			
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesAnnual = sc.nextDouble();
			
			System.out.print("Renda anual com ganho de capital: ");
			double capitalAnnual = sc.nextDouble();
			
			System.out.print("Gastos médicos: ");
			double medicalExpenses = sc.nextDouble();
			
			System.out.print("Gastos educacionais: ");
			double educationExpenses = sc.nextDouble();
			
			TaxPayer taxPayer = new TaxPayer(salaryAnnual, servicesAnnual, capitalAnnual, medicalExpenses, educationExpenses);
			
			listTaxPayer.add(taxPayer);			
		}		
			
		for(TaxPayer obj : listTaxPayer) {
			System.out.printf("\nResumo do %do contribuinte:", listTaxPayer.indexOf(obj)+1);
			System.out.println(obj);
			
		}		
			
		sc.close();

	}

}
