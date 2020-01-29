
public class Pn {
	public  boolean Prime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%1==0)
			{
				c++;
			}
		}
		if(c==2)
			return true;
		else 
			return false;
		
		}
	}

