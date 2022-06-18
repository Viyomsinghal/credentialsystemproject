package itsupport;
import java.util.Random;
import java.util.Scanner;
//import java.util.random.*;
public class CredentialSystem {

	
	public static void main(String[] args) {
		
		Employee viyom=new Employee("Viyom","Singhal");
		viyom.setComp("Great Learning");
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		ch=sc.nextInt();
		CreateCredentials cc=new CreateCredentials();
		String dept=cc.retDepartment(ch);
		String mail=cc.generateEmailAddress(viyom.getFnm(), viyom.getLnm(), viyom.getComp(), dept);
		String passw=cc.generatePassword();
		cc.showCredentials(mail, passw, viyom.getFnm());
	}
}
