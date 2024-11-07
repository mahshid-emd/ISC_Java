package session1;

public class CreateMatrix {
	public void printMatrix(int n) {

		float[][] matrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (float) Math.random();
                System.out.printf("%.2f ",matrix[i][j]);
            }
            System.out.println(" ");
        }
	}
}

