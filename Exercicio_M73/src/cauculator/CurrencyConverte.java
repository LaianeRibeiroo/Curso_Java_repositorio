package cauculator;

public class CurrencyConverte {
	
	public static double IOF = 0.06;
	
	public static double convert (double dollar, double vreais) {
		return dollar * vreais * (1.0+IOF);
	}
   
}
