package interfaceexample;

public class BillMain {

	public static void main(String[] args) {
		 Ebill e=new Ebill(1234,67,8);
		 System.out.println(e);
		 e.display();
		 Wbill b=new Wbill(12345,67,9);
		 System.out.println(b);
		 b.display();

	}

}
