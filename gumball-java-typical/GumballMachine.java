
public class GumballMachine 
{
    private int num_gumballs;
    private int gumball_price;
    private int totalPaid;
    private int totalReturn;

    public GumballMachine( int size, int price )
    {
        // Initialize instance variables
        this.num_gumballs = size;
        this.gumball_price = price;
        ResetValues();
    }
    
    private void ResetValues()
    {
    	this.totalPaid = 0;
    	this.totalReturn = 0;
    }

    public void ProcessPayment(int amount)
    {
    	//Accepted coins
    	if(amount != 5 && amount != 10 && amount != 25)
    	{
    		ResetValues();
    		System.out.println("Invalid coin");
    	}
    	else
    	{
    		this.totalPaid += amount;
    	}
    }    
    
    public void turnCrank()
    {
    	if ( this.totalPaid >= this.gumball_price )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.totalReturn = this.totalPaid - this.gumball_price;
    			this.totalPaid = 0;
    			System.out.println( "Thanks for your payment.  Gumball Ejected!" ) ;
    			if(this.totalReturn > 0)
    			{
    				System.out.println("Please take your change of " + this.totalReturn);
    				this.totalReturn = 0;
    			}
    		}
    		else
    		{
    			System.out.println( "Sorry, No More Gumballs!  Please take your coins in amount of " + this.totalPaid) ;
    			ResetValues();
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert more coins" ) ;
    	}        
    }
}
