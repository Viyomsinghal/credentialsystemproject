package itsupport;

import java.util.Random;

public class CreateCredentials {

	

	public void showCredentials(String mail,String pass,String fnm)
	{
		System.out.println("Dear "+ fnm +" your generated credentials are as follows ");
		System.out.println("Email ---> "+mail);
		System.out.println("Password ---> "+pass);
		
		
	}
	
	public String generateEmailAddress(String fnm,String lnm,String company,String dept)
	{
		
		String mailid=fnm+lnm+"@"+dept+"."+company+".com";
		return mailid;
		
	}

	public String retDepartment(int ch)
	{
		if(ch==1)
		{
			return "Technical";
		}
		else if(ch==2) {
			return "Admin";
		}
		else if(ch==3)
		{
			return "Human Resource";
		}
		else if(ch==4)
		{
			return "Legal";
		}
		else
		{
			return "";
		}
		
	}

	public String generatePassword()
	{
		Random r=new Random();
		
		String stcap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String stsm="abcdefghijklmnopqrtuvwxyz";
		String stnum="0123456789";
		
		String stsp="!@#$%^&*()_-=?;:{}";
		String allchar=stcap+stsm+stnum+stsp;
		
		String pass="";
		int rndDigits=r.nextInt(8, 17);//generate random value in range 8 to 16
		pass=pass+stcap.charAt(r.nextInt(0,stcap.length()));
		pass=pass+stsm.charAt(r.nextInt(0,stsm.length()));
		pass=pass+stnum.charAt(r.nextInt(0,stnum.length()));
		pass=pass+stsp.charAt(r.nextInt(0,stsp.length()));

		for(int i=0;i<rndDigits;i++)
		{
			
			pass=pass+allchar.charAt(r.nextInt(0,allchar.length()));
			
		}
		
		return pass;
	}

}
