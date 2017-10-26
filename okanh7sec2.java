package furkanayd;
import java.util.Scanner;
public class okanh7sec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verileri yarat
		int asýlsonuc;
		int kullanýcýsonuc;
		int count = 0 ;
		int dogrusayýsý = 0  ;
		int n1, n2 ;
		final int MAXSORUSAYISI = 5 ;
		Scanner input = new Scanner (System.in);
		while (count <= MAXSORUSAYISI) {
			n1 = (int) (Math.random()*101);
			n2 = (int) (Math.random()*101);
			if (n1>n2)
				asýlsonuc = n1-n2;
			else 
				asýlsonuc = n2-n1;
			
			System.out.println ("cýkarma iþleminin sonucunu girin " +n1 + " " + n2);
			kullanýcýsonuc = input.nextInt();
			if(kullanýcýsonuc == asýlsonuc); {
				dogrusayýsý ++ ;
			
			}
			count++;
		}
       System.out.println ("dogrusayýnýz " + dogrusayýsý );
	}
}