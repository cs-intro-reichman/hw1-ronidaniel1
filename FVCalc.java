// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);



        double futureValue = currentValue* Math.pow(1+rate, (double)n );
        System.out.println("After "+ n + " years, $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue/100);


        /*
        java FVCalc 25000 6 25
        After 25 years, $25000 saved at 6.0% will yield $107296
         */

	}
}