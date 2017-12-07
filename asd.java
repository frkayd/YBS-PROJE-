package asd;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.println("Celsius icin deger girin: ");
		double Celsius = input.nextDouble();
		
		System.out.println("Fahrenheit degeri : " + fahrenheit (Celsius));
		System.out.println("Fahrenheit icin deger girin: ");
		double Fahrenheit = input.nextDouble();
		System.out.println("Celsius degeri: " + celsius (Fahrenheit));
		
		
	}
	
	public static double fahrenheit (double fahrenheit){
		double sonuc = (9.0 / 5)* fahrenheit + 32;
		return sonuc;
		
	}
	
	public static double celsius (double celsius){
		double sonuc1 = (5.0 / 9)* (celsius - 32);
		return sonuc1;
	}
	
	}
