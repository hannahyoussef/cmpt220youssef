import java.util.Scanner;

public class Problem5_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kilograms" + "\t" + "Pounds" 
				  + "\t" + "|" + "       Pounds" + "\t" + "  Kilograms");
		
		int limitkg = 198;
		int limitlb = 516;
		int kilo = 0, k = 1;
		int pound = 20, p = 5;
		
		while (kilo <= limitkg && pound <= limitlb) {
			kilo = kilo + k; pound = pound + p;
			double conversionkg = Math.round((kilo * 2.2) * 10) / 10.0;
			double conversionlb = Math.round((pound * .453) * 10) / 10.0;
			System.out.println(kilo + "\t        " + conversionkg + 
					"\t" + "|" + "\t" + pound + "\t       " + conversionlb);
			}
		}
	}