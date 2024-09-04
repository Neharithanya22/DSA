package dsaclass;
import java.util.*;

public class reversedigit {




		public static void main(String[] args) {

			// TODO Auto-generated method stub

			int num ;

			

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the integer: ");

			num = scanner.nextInt();

			while(num!=0) {

			int digit = num%10;

			int reverse = 0;

			reverse = reverse * 10 + digit;

			num = num / 10;

			System.out.print(reverse);



		}

		}



	}


