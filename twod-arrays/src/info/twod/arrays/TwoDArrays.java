package info.twod.arrays;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		
		/*
		 * int[][] array = { {1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0},
		 * {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0} };
		 */
		
		int[][] array = {
				{-1, -1, 0, -9, -2, -2},
				{-2, -1, -6, -8, -2, -5},
				{-1, -1, -1, -2, -3, -4},
				{-1, -9, -2, -4, -4, -5},
				{-7, -3, -3, -2, -9, -9},
				{-1, -3, -1, -2, -4, -5}
			};
		
		System.out.println(largestHourglassSum(array));

	}
	
	public static int largestHourglassSum(int[][] array){

        int sumCount = 0;
        int[] sum = new int[16];

        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                sum[sumCount] = array[i][j] + array[i][j + 1] + array[i][j + 2]
                    + array[i + 1][j + 1]
                    + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
               
                sumCount++;
            }
        }
        
        Arrays.sort(sum);
        
        return sum[15];

    }

}