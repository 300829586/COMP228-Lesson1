import java.util.Scanner;

public class Program {
	//modifier should be in front of String
	//name is an instance variable
    //private static String _name = "";
	
	public static Person person;//reference to the Person class
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String myName = input.nextLine();
		
		System.out.print("Please enter your gender: ");
		String myGender = input.nextLine();

		System.out.print("Please enter your age: ");
		int myAge = input.nextInt();
		
      System.out.println("Program Started...");
      //_name="Shutao";
      //System.out.println(_name);
      
      person = new Person(myAge);
      
      //person.gender = "Male";
      //person.name = "Tom";
      
      person.setName(myName);
      person.setGender(myGender);

      System.out.println(person.getName());
      
      person.runs();
      
      System.out.printf("%s, a %s, is %d years old.", person.getName(),person.getGender(),person.getAge());
      
	}


}
