
import java.util.Scanner;

public class HanoiArray {

	public static void main(String[] args) {

		System.out.println("Please enter how many disks in hanoi?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// System.out.println(hanoi(3));

		int[] p1 = new int[n];
		for (int i = 0; i < n; i++) {
			p1[i] = i;
			//System.out.println(array[i]);
		}
		int[] p2 = new int[n];
		int[] p3 = new int[n];
		
		hanoi(n, p1, p2, p3);
	}

	public static void hanoi(int n, int[] p1, int[] p2, int[] p3) {

		if(n==1) {move(n, p1, p3);}
		else {
			hanoi(n-1, p1, p2, p3);
			move(n, p2, p3);
			hanoi(n-1, p2, p3, p1);
		}

	}

	public static void move(int n, int[] from, int[] to) {
		System.out.println(" 把 "+ n +" 号圆盘从 " + from +" ->移到->  " + to);
		to = addInt(to,from[0]);
		from = delInt(from);
	}

	
	
	public static int[] addInt(int[] series, int newInt) {
		// create a new array with extra index
		int[] newSeries = new int[series.length + 1];

		// copy the integers from series to newSeries
		for (int i = 0; i < series.length; i++) {
			newSeries[i] = series[i];
		}
		// add the new integer to the last index
		newSeries[newSeries.length - 1] = newInt;

		return newSeries;
	}
	
	public static int[] delInt(int[] series) {
		// create a new array with extra index
		int[] newSeries = new int[series.length - 1];

		// copy the integers from series to newSeries
		for (int i = 0; i < series.length-1; i++) {
			newSeries[i] = series[i];
		}
		return newSeries;
	}
}


