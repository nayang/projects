package lab2;

public class Medals01 {
	/* 
	 * Country    Gold  Silver  Bronze   Total
                   --------------------
          Japan       1       0       0       1
         Russia       3       1       1       5
  United States       1       0       1       2
                   --------------------
   Total Medals       5       1       2
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
			
			for(int i = 0;i<countries.length;i++) {
				int total = 0;
				if(medalCounts[i][0]>0) {
					System.out.printf("%15s", countries[i]);
				}else {continue;}
				for(int j=0;j<MEDALS; j++) {
					System.out.printf("%8s", medalCounts[i][j]);
					total = total + medalCounts[i][j];
					
				}
				System.out.printf("%8d%n", total);
			}
			
			int[] columnTotals = new int[MEDALS];
			
			for(int i =0;i<MEDALS;i++) {
				int columnTotal =0;
				for(int j = 0;j<countries.length;j++) {
					if(medalCounts[j][0]>0) {
						columnTotal =columnTotal+medalCounts[j][i];
					}
				}
				columnTotals[i] = columnTotal;
			}
			System.out.println("                   --------------------");
			System.out.print("   Total Medals");
			for (int i = 0; i < MEDALS; i++) {
	            System.out.printf("%8d", columnTotals[i]);
	        }
		}
}
