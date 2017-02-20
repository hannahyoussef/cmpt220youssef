public class Problem7_14 {
	
	public static void main(String[] args) {
	    System.out.print("Enter five integers: ");
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    
	    int[] numbers = new int[5];
	    
	    for(int i = 0; i < 5; i++) {
	    	
	    	// storing the value in array
	    	numbers[i] = input.nextInt();
	    }
	    gcd(numbers); // call the method
	}
	public static void gcd(int[] numbers) {
		int temp = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			
			if(temp > numbers[i]) {
				
				// finding the smallest element
				temp = numbers[i];
			}
		}
		int last = temp;
		for(int re = 0; re < last; re++) {
			boolean result = false;
			for(int j = 0; j < numbers.length; j++) {
				
				// checking the modules and set the flag
				if(numbers[j] % temp != 0) {
					result = false;
					break;
				} else {
					result = true;
				}
				
			}
			if(result) {
				// break the loop because the GCD was achieved
				break;
			} else {
				// decrementing teh value and iterating again
				temp--;
			}
		}
		System.out.println("The GCD is " + temp);
		}
	}