package rastgele;

public class frk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verileri yarat
		int n1, n2;
		//baþlýk at
		System.out.println("\t\tcarpýmtablosu");
		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6");
		for (n1 =1; n1<10; n1++) {
			System.out.print("----------");
		}
		System.out.println();
		//System.out.println("----------------------------------------------");
		//sonucu yaz
		for(n1 =1; n1<10; n1++) {
			for (n2 =1; n2<10; n2++) {
				System.out.print("\t" + n1*n2);
			}
			System.out.println();
		}
	}

}
