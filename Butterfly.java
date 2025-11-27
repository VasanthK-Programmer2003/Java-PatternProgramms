class Butterfly
{
	public static void main(String[] args) {
		int n=5;
		for (int row=1;row<=n*2-1;row++ ) 
		{
			for (int col=1;col<=n*2-1;col++) 
			{
				if((row>=col||row+col>=n*2)&&(row<=col||row+col<=n*2))
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}

			System.out.println();
		}
	}
}