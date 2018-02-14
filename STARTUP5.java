package qwqwqwqwqwqwq;

import java.util.Scanner;

public class STARTUP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner giriş = new Scanner (System.in) ;
		
		int A , B , C ,D ;
		double f,t,y;
		
		System.out.println(" A SAYISINI GİRİNİZ : ") ;
      	A = giriş . nextInt() ;
      			
      		 	System.out.println(" B SAYISINI GİRİNİZ : ") ;
      	B = giriş . nextInt() ;
     
      	System.out.println(" C SAYISINI GİRİNİZ : ") ;
      	C = giriş . nextInt() ;
      	
      	System.out.println(" D SAYISINI GİRİNİZ : ") ;
      	D = giriş . nextInt() ;
      	
      	
      	t=(A*A+A*B)*D;
      	y=(A+B*B*D)*C;
      	f=t/y;
      	System.out.print("SONUÇ :" +f);
		
		
		
		
	}

}
