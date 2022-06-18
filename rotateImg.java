public class rotateImg {
    // just think logically, how you can rotate an image in your phone?
    // just by rotating the phone 90*? yeas exactly that's what we are doing, 
    // rotating every pixel 90* from the axis.
        public void rotate(int[][] matrix) {
            
			// number of pixels in the image
			int n = matrix.length;
			//looping through the top half
            for (int i = 0; i < (n + 1) / 2; i ++) {
				//looping through the bottom half
                for (int j = 0; j < n / 2; j++) {
					//A very simple swap
                    int temp = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                    matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                    matrix[j][n - 1 - i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
}
