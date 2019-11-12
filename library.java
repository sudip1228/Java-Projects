package librarymanagementsystem;

import org.springframework.stereotype.Component;

@Component
public class library {
public String firstname;
public String lastname;
public int sem;
public int id;

public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

public void setSem(int sem) {
	this.sem = sem;
}

public void setId(int id) {
	this.id = id;
}

public  void  get()
{
	System.out.println("first name is "+firstname);
	System.out.println("last name is "+lastname);
	System.out.println("semester is  "+sem);
	System.out.println("id is "+id);
}

}
