import java.lang.Math;

public class Lab1 {

	public static boolean isInArray(int a, short[] m){ // функция проверяет наличие short-числа a в массиве m

		for (short i: m){

			if (a == i){
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]){


		short[] d = {4, 6, 8, 10, 12, 14, 16, 18, 20};
		double[] x = new double[20];
		double left_side = -2; //Левая граница случайного значания в массиве d
		double right_side = 9; //Правая граница случайного значания в массиве d
		double[][] b = new double[9][20];
		for (int i = 0; i < 20; i++){
			x[i] = Math.random() * (right_side - left_side) + left_side;
			
		}

		for (int i = 0; i < 9; i++){
			for (int j = 0; j < 20; j++){

				if (d[i] == 14) b[i][j] = (Math.asin(Math.PI/4 * Math.pow(Math.E, -Math.abs(x[j]))));
				else if (isInArray(d[i], new short[] {6, 8, 10, 18} )) b[i][j] = (Math.tan(Math.PI * Math.pow(1/3 + Math.pow(x[j], 1/3D),3)));
				else b[i][j] = (Math.cos(Math.pow(Math.pow(Math.cos(x[j]),1/3D), (Math.atan(Math.pow(Math.E, -Math.abs(x[j]))) - 1)/(Math.atan(Math.cos(x[j]))))));
				System.out.printf("%.5f", b[i][j]);
				System.out.print(" | ");
			}
			System.out.println("");

		}



	}
}