package src;


public class MethodExample {
	public static void main(String [] args)
	{
		int x = 4, y = 7, largest;
		largest = max(x,y);
		System.out.print(largest);
	}
	public static int max(int num1, int num2)
	{
		int result;
		if (num1 > num2)
	 		 result = num1;
		else
			 result = num2;
		return result;
	}

}
