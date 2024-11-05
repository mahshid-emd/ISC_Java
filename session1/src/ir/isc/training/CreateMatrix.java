package ir.isc.training;

public class CreateMatrix {
	public void printMatrix(int n) {

		double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.random();
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println(" ");
        }
	}
}
