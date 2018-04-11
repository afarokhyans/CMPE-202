
public class Main 
{
	public static void main(String[] args) 
	{
		GumballMachine gumballMachine = new GumballMachine(5, 25);

		System.out.println(gumballMachine);

		gumballMachine.ProcessPayment(25);
		gumballMachine.ProcessPayment(10);
		gumballMachine.turnCrank();

		gumballMachine.ProcessPayment(25);
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		gumballMachine.ProcessPayment(25);
		gumballMachine.ProcessPayment(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
