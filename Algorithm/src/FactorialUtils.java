public class FactorialUtils {
	/**
	 * @author moonbyeonghak
	 * get factorial number with recursion*/
	public static void main(String[] args)
	{
		FactorialUtils factorialUtils = new FactorialUtils();
		int factorial2 = factorialUtils.factorial(2);
		int factorial3 = factorialUtils.factorial(3);
		System.out.println(factorial2);
		System.out.println(factorial3);
	}
	
	public int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}
}
