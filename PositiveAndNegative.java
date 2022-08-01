import java.util.Scanner;
class PositiveAndNegative
{
	public static void main(String arg[])
	{
		int no;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter any Number:");
		no=n.nextInt();
		if(no>0)
		{
			System.out.println("The "+no+" is Positive number.");
		}
		else if(no<0)
		{
			System.out.println("The "+no+" is Negative number.");
		}
		else
		{
			System.out.println("The "+no+" is Zero.");
		}
	}
}