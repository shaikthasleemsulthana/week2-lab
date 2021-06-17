package week2;
import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double currentSalary;
double raise;
double newSalary;
String rating;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the current Salary:");
currentSalary=scan.nextDouble();
System.out.println("Enter the value of raise");
raise=scan.nextDouble();
System.out.print("Enter the performance rating\n(Excellent,Good,or poor)");
rating=scan.nextLine();
if (rating.equals("Excellence")) {
	 raise=(currentSalary/100)*6;
}
else if (rating.equals("Good")) {
	raise=(currentSalary/100)*4;
}
else {
	raise=0;
}
scan.close();
newSalary=currentSalary + raise;
System.out.println("increases rating is:"+rating);
NumberFormat money=NumberFormat.getCurrencyInstance();
System.out.println();
System.out.println("Current Salary:"+money.format(currentSalary));
System.out.println("Amount of your raise:"+money.format(raise));
System.out.println("Your new salary:"+money.format(newSalary));
System.out.println();
	}
}
