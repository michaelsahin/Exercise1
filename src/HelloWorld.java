import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		System.out.println("Hello ASE2017 - How are you now? :)");
=======
		System.out.println("Hello ASE2017 - How are you? :)");
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String eingabe = scan.next();
		HelloUser Benutzer = new HelloUser(eingabe);
		Benutzer.greetUser();
>>>>>>> refs/heads/HelloUser
	}
	

}
