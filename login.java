package loginorsignin;
import java.util.Scanner;
public class login
{
	public int id;
	public int pswd;
    char i;
	Scanner s2=new Scanner(System.in);
	public void login()
	{
		System.out.print("user id :");
        id=s2.nextInt();
		System.out.print("password :");
		pswd=s2.nextInt();
	    if(id==1234 && pswd==567)
		{
			
		}
		else
		{
			System.out.println("user id or password doesn't match\n sign up??");
			System.out.println("enter y for yes and n for no");
			i=s2.nextChar();
			if(i=='y')
			{
			  signup s1=new signup();
			  s1.signup1();
				
		    }
		
	}
		
}
}
class signup extends login
{
	public String name;
	public int pno;
	public int psd;
	public int rpsd;
	public String usid;
	Scanner s =new Scanner(System.in);
	public void signup1()
	{
		
	System.out.print("name : ");
	name=s.nextString();
	System.out.print("phone number : ");
	pno=s.nextInt();
	System.out.print("enter your user id : ");
	usid=s.nextString();
	System.out.print("new password : ");
	psd=s.nextInt();
	System.out.print("re-enter your password  : ");
	rpsd=s.nextInt();
	if(psd!=rpsd)
	{
		System.out.println("password doesn't match\nenter your details again");
		signup1();
	}
	}
	
}

