
public class Program {
	//modifier should be in front of String
	//name is an instance variable
    //private static String _name = "";
	
	public static Person person;//reference to the Person class
	public static void main(String[] args) {

      System.out.println("Program Started...");
      //_name="Shutao";
      //System.out.println(_name);
      
      person = new Person(47);

      
      //person.gender = "Male";
      //person.name = "Tom";
      
      person.setName("Shutao");
      person.setGender("Male");

      System.out.println(person.getName());
      
      person.runs();
      
      System.out.printf("%s, a %s, is %d years old.", person.getName(),person.getGender(),person.getAge());
      
	}

}
