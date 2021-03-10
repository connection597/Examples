package Ex;

public class Ex1 {

	public static void main(String[] args) {
		int n1= 5, n2 =10, max, res;
		System.out.println("First num : " + n1);
		System.out.println("Sceond num : " + n2);
		
		max =(n1>n2)? n1 : n2;
		res = (n1>n2) ? (n1+n2) :(n1-n2);
		
		System.out.println("Maxinum is = " +max);
		System.out.println("Result is = " +res);
	}

}
