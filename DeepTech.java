class DeepTech
{
	public static void main(String arg[])
	{
		for(int i=1 ; i<=100 ; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print("\t" + "Deep_Tech" + "\t");
			}
			else if(i%5==0)
			{
				System.out.print("\t" + "Tech" + "\t");
			}
			else if(i%3==0)
			{
				System.out.print("\t" + "Deep" + "\t");
			}
			else
			{
				System.out.print(i + " ");
			}
		} 
	}
}