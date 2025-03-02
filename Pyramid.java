package number_patterns;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int space = 3;
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print(a++);
			}
			for(int j=2;j<=num;j++)
			{
				if(i<=2)
				{
					--a;
					System.out.print(--a);
				}
				else 
				{
					System.out.print(a);
				}
			}
			a++;
			space--;
			num++;
			System.out.println();
			a=1;
		}
	}
}
