package Myjava;

public class TheDotProduct2D {
	public static void main(String[] args) {


		int[][] my2D_wide= {{21,32,23,34},{13,14,15,16}};
		System.out.println("Original Matrix: ");
		PrintVect2D(my2D_wide);
		int rows=0;
		int cols=0;

		rows= my2D_wide.length;
		cols= my2D_wide[0].length;
		int[][] my2D_tall = new int[cols][rows];
		my2D_tall=Transpose2D(my2D_wide);
		
		System.out.println("\nTransposed Matrix: ");
		PrintVect2D(my2D_tall);
		
}
public static int[][] Transpose2D(int[][] vect) {
	
	int cols=vect[0].length;
	int rows=vect.length;
	int trans[][] = new int[cols][rows];
	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			trans[j][i]=vect[i][j];
		}
	}
	return trans;
}
public static void PrintVect2D(int[][] vect) {
	System.out.print("{ ");
	for(int i=0; i<vect.length; i++) {
		if(i>0)
			System.out.print("  ");
		for(int j=0; j<vect[0].length; j++) {
			if(j<vect[0].length-1)
				System.out.print(vect[i][j]+", ");
			else
				System.out.print(vect[i][j]);
		}
		if(i<vect.length-1)
			System.out.println("");
		else
			System.out.println(" }");
	}
}

double[][] firstMatrix = {
		  new double[]{21d, 13d},
		  new double[]{32d, 14d},
		  new double[]{23d, 15d},
		  new double[]{34d, 16d}
		};

		double[][] secondMatrix = {
		  new double[]{21d,32d,23d,34d},
		  new double[]{13d,14d,15d,16d}
		};
	double[][] expected = {
			  new double[]{3150d,1610d},
			  new double[]{1610d,846d},
	};};

private double[][] secondMatrix;	double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
	    double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

	    for (int row = 0; row < result.length; row++) {
	        for (int col = 0; col < result[row].length; col++) {
	            result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
	        }
	    }

	    return result;
	}
	double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
	    double cell = 0;
	    for (int i = 0; i < secondMatrix.length; i++) {
	        cell += firstMatrix[row][i] * secondMatrix[i][col];
	    }
	    return cell;
	}
	double[][] actual = multiplyMatrices(firstMatrix, secondMatrix);
	assertThat(actual).isEqualTo(expected);
}
System.out.println("DotProd2D"); 
}


