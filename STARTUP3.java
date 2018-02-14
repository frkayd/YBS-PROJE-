package qwqwqwqwqwqwq;

import java.util.Scanner;

public class STARTUP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner giriş = new Scanner (System.in) ;
		
		int kk , uk , c , a ;
		
		System.out.println("Kısa kenarı giriniz :");
		
		kk=giriş.nextInt();
		
		System.out.println("uzun kenarı giriniz : ");
		
		uk = giriş.nextInt() ;
		
		c= 2*(kk+uk) ;
		
		System.out.println("çevre :"+c);
		
		
		a = (kk*uk) ;
		System.out.println("alan :"+a);
		
		
	}

}
