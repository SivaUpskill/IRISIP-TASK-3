import java.util.Scanner;


class GlobalVaribles
{ 
  double balance=1000;
  long mobileNumber;
  int createPassword;
 
}
class ProjectATMByPsivaJ9
 {  
 public static void main(String[]args)
 { 
 

GlobalVaribles go=new GlobalVaribles();
Scanner input=new Scanner(System.in);
int i;
for(i=1;i<=100;i++)
{
System.out.println(" .................................... Welcome ................................ ");
System.out.println("            ..............>>>>>>>> Mana bank <<<<<<<<..................            ");
System.out.println(" Gudie lines :");
 System.out.println ( "   >>.First do  1. account creation then go to 2.pin generation ");
 System.out.println ("    >> if you have account in this bank then only go for banking  services otherwise i can't allowed it is asking password ");
                     
System.out.println("                               ...services.....                                 ");
System.out.println("     1. Account creation       " + "      2.Banking       " + "    3. Pin Generation   "  );
System.out.println("chooseService=");
int chooseService =input.nextInt();
switch(chooseService)
{  

case 1://Account creation

System.out.println("..>>>>>>>Account Creation Service<<<<<<<...");
System.out.println("Enter Account Holder Name=");
String name=input.next(); 
System.out.println("Enter Aadhar Number=");
long aadharNumber=input.nextLong(); 
System.out.println("Enter Mobile Number=");
 go.mobileNumber=input.nextLong();
System.out.println("..Your account is Succesfully created..");
System.out.println("your account number is - " + "Ac"+ aadharNumber +"12");
System.out.println("..Availble amount is  RS.0..");
break;

case 2://Banking

System.out.println("..>>>>>>>Banking Service<<<<<<<...");
System.out.println(".......login.......");
System.out.println("Enter password :");
int login=input.nextInt();
//check with created password 
if(login==go.createPassword)
{  System.out.println("...............Manabank................");  
  System.out.println("...................");
System.out.println("     1.Deposit    "+"  2.withdraw   "+"   3.ministatement   ");
 System.out.println("chooseService:");
int chooseServices=input.nextInt();
switch(chooseServices)
{
  case 1:
   System.out.println(" >>Deposit :");
   go.balance=0;
  System.out.println("Enter amount to deposit :");
  int despoit =input.nextInt();
  go.balance+=despoit;//despoit amount
  System.out.println("Avalible balance Rs:" + go.balance);
  break;
  case 2:
 System.out.println(" >>withdraw :");
 System.out.println("Enter amount to withdraw:");
 int withDraw=input.nextInt();
 go.balance-=withDraw;//withdraw
 System.out.println("Avalible balance :" + go.balance);
 break;
 case 3:
System.out.println("Avalible balance :" + go.balance);
break;
default:
System.out.println("...Invalid serivce..");
  break;
}
}
else
{
 System.out.println("...incorrect password....");
}

break;

case 3://Pin Generation

System.out.println("..>>>>>>>Pin Generation<<<<<<<...");
System.out.println("Entered your registed Mobile number=");
long registeredNumber=input.nextLong();
//check with registred mobile number 
if(registeredNumber==go.mobileNumber)
{     System.out.println("createPassword :");   
       go.createPassword= input.nextInt();
      System.out.println("ReEnterPassword :"); 
       int ReEnterpassword=input.nextInt();
       if(go.createPassword==ReEnterpassword)
        {
          System.out.println("...your password is succesfully created...");
          System.out.println(" your password :"+go.createPassword);
          System.out.println("...Don't share your password to other... ");
         }

      else
      {
         System.out.println("...Cancelled...");
      }
} 
else
{ 
  System.out.println("...Inncorrect Mobile number...");
}

break;
default:
System.out.println("...Invalid service....");
break;

  
}
}
}

}

