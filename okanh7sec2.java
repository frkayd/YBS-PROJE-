package furkanayd;
import java.util.Scanner;
public class okanh7sec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verileri yarat
		int asılsonuc;
		int kullanıcısonuc;
		int count = 0 ;
		int dogrusayısı = 0  ;
		int n1, n2 ;
		final int MAXSORUSAYISI = 5 ;
		Scanner input = new Scanner (System.in);
		while (count <= MAXSORUSAYISI) {
			n1 = (int) (Math.random()*101);
			n2 = (int) (Math.random()*101);
			if (n1>n2)
				asılsonuc = n1-n2;
			else 
				asılsonuc = n2-n1;
			
			System.out.println ("cıkarma işleminin sonucunu girin " +n1 + " " + n2);
			kullanıcısonuc = input.nextInt();
			if(kullanıcısonuc == asılsonuc); {
				dogrusayısı ++ ;
			
			}
			count++;
		}
       System.out.println ("dogrusayınız " + dogrusayısı );
	}
}