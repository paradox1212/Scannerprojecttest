package input;
import java.util.Scanner;

public class input {
	  public static void main(String[] args) {
	  System.out.println("Enter a number ");
	  Scanner sc = new Scanner(System.in);
	  int input1 = sc.nextInt();
	  System.out.println("Enter another number");
	  int input2 = sc.nextInt();
	  //Multiplication
	  int input3 = input1*input2;
	  sc.close();
  
  System.out.print("The two numbers you entered when multiplied together gives you: " + input3);
  
  
  
}
}