package unity;
public class CodeChallenges 
{
	//Q4
	public int factorial(int n)
	{
		if (n==1)
		{
			return 1;
		}
	else{
		return n*factorial(n-1);}
	}
	public void s1(String s)
	{
		//System.out.println(s);
		for(int i = s.length()-1 ;i>=0;i--)
		{
			System.out.print(s.charAt(i));
			
		}
		
	}
}
