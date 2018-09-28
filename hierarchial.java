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
	return s;
	}
}
class ICICI extends bank
{
int getRateofInterest()
	{
	return i;
	}
}
class AXIS extends bank
{
int getRateofInterest()
	{
	return a;
	}
}
class test 
{
public static void manin(string[]args)
	{
	SBI s=new SBI();
	ICICI i=new ICICI();
	AXIS a=new AXIS();
	system.out.println("SBI RateofIntrest"+s.getRateofIntrest());
	system.out.println("ICICI RateofIntrest"+s.getRateofIntrest());
	system.out.println("AXIS RateofIntrest"+s.getRateofIntrest());
	}
}
