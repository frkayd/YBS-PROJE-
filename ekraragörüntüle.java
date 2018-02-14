package qwqwqwqwqwqwq;

import java.util.Scanner;

public class ekraragörüntüle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		Scanner giriş = new Scanner (System.in);
		
	    	
	    System.out.print("İSİM GİRİNİZ :");
	    String isim = giriş.next();
	    System.out.println("VİZE NOTUNUZU GİRİNİZ :");
	    byte vize = giriş.nextByte();
	    System.out.println("FİNAL NOTUNUZU GİRİNİZ : ") ;
	    byte f =giriş.nextByte();
	    float bn = (float) (vize*0.4+f*0.6);
	    System.out.println("ADINIZ : " +isim+
	    		"\nVize notunuz \t: "+vize+
	        "\nFinal notunuz \t : "+f+
	        "\nBaşarı notunuz \t : "+bn) ;
	    
	}

}

