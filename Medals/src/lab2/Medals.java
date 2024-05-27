package lab2;
/*Assessment: Lab 2
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
 *@author Na Yang
 *@version 2.0
 *@see Medals
 *@since javac 21.0.1
 */

/*
 * 
 * SAMPLE OUTPUT (minus the starting *)
 * 
 * 
 *        Country    Gold  Silver  Bronze   Total
 *                   --------------------
 *         Canada       4       3       3      10
 *          Japan       1       0       0      11
 *         Russia       3       1       1      16
 *  United States       1       0       1      18
 *                   --------------------
 *   Total Medals       9       4       5 
 * 
 */

/**
 * This program prints a table of medal winner counts with row totals.
 */
public class Medals {
	/**
	 * This is the main method, and it used for initializing arrays for countries and counts the medal, 
	 * and prints out the medal counts for the country
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		final int MEDALS = 3;
		final int GOLD = 0;
		final int SILVER = 1;
		final int BRONZE = 2;
		/*
		 * Array of country names participating in the competition.
		 */
		String[] countries = { "Canada", "Italy", "Germany", "Japan", "Kazakhstan", "Russia", "South Korea",
				"United States" };
		/*
		 * Two-dimensional array representing the medal count for each country.
		 */
		int[][] medalCounts = { { 0, 3, 0 }, { 0, 0, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 1 }, { 3, 1, 1 }, { 0, 1, 0 },
				{ 1, 0, 1 } };


		/*Print the heading, use formatted print statements to align the medal count for selected countries.		*/
		System.out.println("        Country    Gold  Silver  Bronze   Total");
		System.out.println("                   --------------------");

		
		/*Print out the medals by country.  Include only those countries that have at least 1 gold medal
		 * Include in the display all medals for a country that has at least one gold medal.
		 */
		for (int i = 0; i < countries.length; i++) {
			int total = 0;			// total number of medals for the current country
			/*	Make sure this loop only prints the values for a country with "gold" medals.			*/
			if (medalCounts[i][0] > 0) {
			/*
			 *	TODO: Use printf() to print country name as a field of 15 bytes (as a String value)
			 */
              System.out.printf("%15s", countries[i]);//formats string for a minimum of 15 spaces
			}else {continue;}
			
			//System.out.printf("");

			/*	Print each row column value and accumulate the row total			*/
			for (int j = 0; j < MEDALS; j++) {
				System.out.printf("%8d", medalCounts[i][j]);//right justify for 8 digits

				/*	TODO:	calculate the total number of medals for each row										*/
				total = total + medalCounts[i][j];
			}
			

			/*
			 *		TODO:	use printf() to print total for each row as a field of size 8
			 *				and numeric data type. Include newline after printing each value
			 */
			System.out.printf("%8d%n",total);
		}

	
		/*
		 * define an array of size 3 to hold the total for each column.
		 * 						Modify the above code to keep total for each medal type, and then use
		 * 						a for loop to print total line below
		 */
		int[] columnTotals = new int[MEDALS]; // Calculate column totals
		for (int i = 0; i < MEDALS; i++) {
            int columnTotal = 0;
            for (int j = 0; j < countries.length; j++) {       
            	
            		if(medalCounts[j][0] > 0) {
            			columnTotal = columnTotal + medalCounts[j][i];
            		}
            		   	
            }
            columnTotals[i] = columnTotal;
            }
		//Print column totals
		System.out.println("                   --------------------");
        System.out.print("   Total Medals");
        for (int i = 0; i < MEDALS; i++) {
            System.out.printf("%8d", columnTotals[i]);
        }
	}

}
