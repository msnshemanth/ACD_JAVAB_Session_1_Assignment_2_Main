public class PrimeNumber {
	public static void main(String[] args) 
	{
		int p=0;
		System.out.println("prime no are :");
		for (int i = 2; i <=100; i++)
		{
			for (int j = 2; j <=100; j++)
			{
				if ((i % j) == 0)
				{
					if(i != j)
						break;
					else
					{
						p=i;
						System.out.println(p);
					}
				}
			}
		}
	}
}