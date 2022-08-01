import java.util.Scanner;
class ReverseNumber
{
	public static void main(String arg[])
	{
		int no,r,rem;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		no=s.nextInt();
		for(r=0;no!=0;)
		{
			rem=no%10;
			r=rem+r*10;
			no/=10;
		}
		System.out.println("Reverse Number is:\n"+r);
	}
}