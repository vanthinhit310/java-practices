
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Thinh";
		String lastName = "Le";
		
		System.out.println("Value before swap: Firstname is: " + firstName + "----------------" + " Lastname is: " + lastName);
		
		String temp;
		temp = firstName;
		firstName = lastName;
		lastName = temp;
		
		System.out.println("Value after swap: Firstname is: " + firstName + "----------------" + " Lastname is: " + lastName);

	}

}
