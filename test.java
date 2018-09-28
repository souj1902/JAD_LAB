class bank
{
int getRateofInterest()
	{
	return 0;
	}
}
class SBI extends bank
{
int getRateofInterest()
	{
	return 8;
	}
}
class test 
{
public static void main(String[] args)
	{
	SBI s=new SBI();
	ICICI i=new ICICI();
	AXIS a=new AXIS();
	System.out.println("SBI RateofInterest" + s.getRateofInterest());
	}
}
