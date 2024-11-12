package boletinarrays2;

import java.util.Arrays;

public class E7 {
public static void main(String[] args) {
	int arr[] = new int[55];
	int inicio = 0;
	
	for (int i = 1; i <= 10; i++) {
		Arrays.fill(arr, inicio, inicio+i, i);
		inicio += i;
	}
	
	System.out.println(Arrays.toString(arr));
}
}
