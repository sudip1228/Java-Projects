package email;

import java.util.Scanner;

public class emailrunner {

	public static void main(String[] args) {
		
Scanner in= new Scanner(System.in);
System.out.println("enter first name of a person");
String firstname=in.nextLine();

System.out.println("enter second name of a person");
String secondname=in.nextLine();

System.out.println("enter desired emailmail capacity");
int capacity=in.nextInt();

email name=new email(firstname,secondname);
name.setMailboxcapacity(capacity);
System.out.println("email capacity of "+name.getFirstname()+name.getLastname()+" is "+name.getMailboxcapacity()+"mb");



}
}