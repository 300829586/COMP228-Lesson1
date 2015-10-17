import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = "";
		float myNum =0;
	      System.out.print("Hello");
	      System.out.println("Hello World!");
System.out.printf("%s%n%s%n", "welcome to", "java");

@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);
System.out.print("Please enter your name:");
myName = input.nextLine();
System.out.println("your name is " + myName);
//System.out.printf("your name is %s", myName);

System.out.print("Rate this program from 1 to 10:");
myNum = input.nextFloat();
System.out.printf("your rate is %.2f", myNum);

	

}}
