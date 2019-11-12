package librarymanagementsystem;


import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class library_runner implements CommandLineRunner {
	
	@Autowired
	library lib;
	@Autowired
	librarysubjects sub;

	public static void main(String[] args) {
		SpringApplication.run(library_runner.class, args);
			
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("enter 0 to start the system ");
		Scanner  in=new Scanner(System.in);
		int choice=in.nextInt();
		while(choice==0) {
	
	System.out.println("enter 1 for student details:\nenter 2 for subjects:\nenter 3 to exit ");

	int num=in.nextInt();
	if (num==1) {
		System.out.println("enter first name: ");
		
		String first=in.nextLine();
		String firstname=in.nextLine();
		lib.setFirstname(firstname);
		
		System.out.println("enter last name: ");
		String lastname=in.nextLine();
		lib.setLastname(lastname);
		
		System.out.println("enter sem name: ");
		int sem=in.nextInt();
		lib.setSem(sem);
		
		System.out.println("enter id: ");
		int id=in.nextInt();
		lib.setId(id);
		
		lib.get();
		
		
	}
	else if(num==2) {
		System.out.println("enter 1 for math subject:\nenter 2 for science subject ");
		int value=in.nextInt();
		if(value==1)
		{
		sub.math();
		}
		else if(value==2) {
		sub.science();
		}
		
	}
	
		}
		in.close();
	}
	
}
