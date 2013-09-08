public class HailstoneProblem {
	public static void main(String[] args) {
		System.out.println(12);
		hailstone (12);
	}

	public static int hailstone(int number) {
		while (number>0 && number!=1) {
 			while (number % 2 == 0 && number != 1) {
        		number = number / 2;
         		System.out.println(number);
 	   		 }

  			while (number % 2 != 0 && number !=1) {
         		number = ((number * 3) + 1);
         		System.out.println(number);
 	    	}
    	}

		if (number == 1) {
  			System.out.println("Stop calculation");
		}
		return number;
	}

}