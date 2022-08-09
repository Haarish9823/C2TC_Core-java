
public class Myclass {

	public static void main(String[] args) {
		Myclass ob = new Myclass();
		try
		{
		ob.meth1();
		}
		catch(ArithmeticException e)
		{
		System.out.println("ArithmaticException thrown by meth1() method is caught in main()method");
		}
		}
		public void meth1()
		{
		try
		{
		System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
		System.out.println("We have an Exception - "+nullExp);
		}
		System.out.println("Outside try-catch block");
	}
}
// output
// ArithmaticException thrown by meth1() method is caught in main()method
