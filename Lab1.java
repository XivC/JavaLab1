import java.lang.Math;

public class Lab1 {

	public static boolean isInArray(int a, int[] m){ // функция проверяет наличие целого числа a в массиве m

		for (int i: m){

			if (a == i){
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]){

		int[] d = {18, 16, 14, 12, 10, 8, 6, 4, 2};
		float[] x = new float[20];
		float left_side = -2; //Левая граница случайного значания в массиве d
		float right_side = 4; //Правая граница случайного значания в массиве d
		float[][] b = new float[9][20];
		for (int i = 0; i < 20; i++){
			x[i] = (float)Math.random() * (right_side - left_side) + left_side;
			
		}

		for (int i = 0; i < 9; i++){
			for (int j = 0; j < 9; j++){

				if (d[i] == 10) b[i][j] = (float)Math.pow(Math.cos(Math.pow((3/4 - x[j])/(x[j]),x[j])), 1/3);
				else if (isInArray(d[i], new int[] {4, 6, 8, 14} )) b[i][j] = (float)(0.25D * (Math.exp(Math.sin(x[j])) + 1));
				else b[i][j] = (float)Math.pow(4 * Math.pow(Math.cos(x[j]/4 * Math.pow(Math.log(Math.abs(x[j])), Math.pow(2/x[j], x[j])/2) - 0.25D), Math.tan(Math.exp(x[j]))) ,3);
				System.out.printf("%.4f", b[i][j]);
				System.out.print(" ");
			}
			System.out.println("");

		}



	}
}