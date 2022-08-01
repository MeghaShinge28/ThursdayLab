import java.util.Scanner;
class AddDigits
{
	public static void main(String arg[])
	{
		int no,rem,tot;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		no=s.nextInt();
		for(tot=0;no!=0;no/=10)
		{
			rem=no%10;
			tot+=rem;
		}
		System.out.println("Total addition of Digits:\n"+tot);
	}
}