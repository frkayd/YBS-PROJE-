package furkanayd;
import java.util.Scanner;
public class okanh7sec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verileri yarat
		int as�lsonuc;
		int kullan�c�sonuc;
		int count = 0 ;
		int dogrusay�s� = 0  ;
		int n1, n2 ;
		final int MAXSORUSAYISI = 5 ;
		Scanner input = new Scanner (System.in);
		while (count <= MAXSORUSAYISI) {
			n1 = (int) (Math.random()*101);
			n2 = (int) (Math.random()*101);
			if (n1>n2)
				as�lsonuc = n1-n2;
			else 
				as�lsonuc = n2-n1;
			
			System.out.println ("c�karma i�leminin sonucunu girin " +n1 + " " + n2);
			kullan�c�sonuc = input.nextInt();
			if(kullan�c�sonuc == as�lsonuc); {
				dogrusay�s� ++ ;
			
			}
			count++;
		}
       System.out.println ("dogrusay�n�z " + dogrusay�s� );
	}
}