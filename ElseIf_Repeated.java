package Loop_and_Ifstatements;

public class ElseIf_Repeated {

	public static void main(String[] args) {

		int f = 20;
		int e = 10;
		int d = 30;
		int c = 40;
		int b = 50;
		int a = 60;

		if (a < b) {
			System.out.println("a is greater");
		} else if (b > a) {

			System.out.println("b is greater");
		} else if (c > d) {

			System.out.println("c is greater");
		}

		else if (d > e) {

			System.out.println("s is greater");
		} else if (e > f) {
			System.out.println("e is greater");
		} else {

			System.out.println("f is greater");
		}

	}

}
