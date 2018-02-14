package qwqwqwqwqwqwq;

import java.util.Scanner;

public class STARTUP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giriş = new Scanner (System.in) ;
		
		double cevre , alan , yarıcap ;
		double PI = 3.14 ;
		
		System.out.println("YARIÇAP GİRİNİZ : ");
		
		yarıcap = giriş.nextDouble() ;
		
		cevre = (2*PI*yarıcap) ;
		
		System.out.println("çevre :"+cevre);
		
		alan = (PI*yarıcap*yarıcap ) ;
		
		System.out.println("alan : " +alan);
		
	}

}
