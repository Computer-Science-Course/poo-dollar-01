package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Main {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.print("What is the dollar price?");
		currencyConverter.setDollar_price(scanner.nextDouble());
		
		System.out.print("How many dollares are you gonna bought?");
		currencyConverter.setAmount2buy(scanner.nextDouble());
		
		System.out.printf("Amount to be pain in reais: R$%.2f.\n", currencyConverter.value2Pay());
		
		scanner.close();
	}
}
