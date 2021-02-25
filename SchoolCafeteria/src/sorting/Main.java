package sorting;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
		
	private static Double [] array;
	private  static int setAmount;
	private static BufferedReader br;
	//private static BufferedWriter bw;


	
	public static void bubbleSort() {
		boolean changed = true;
		for(int i=1; i<array.length && changed;i++) {
			changed=false;
			for(int k=1;k<array.length;k++) {
				if(array[k-1]>array[k]) {
					Double temp=array[k-1];
					array[k-1]=array[k];
					array[k]=temp;
					changed= true;
				}
			}
		}
	}
		
	public static void start() throws NumberFormatException, IOException {	
		setAmount=Integer.parseInt(br.readLine());
		
		fullSets();
	} 
	
	public static void fullSets() throws NumberFormatException, IOException {
		int i=0;
		while (i<setAmount) {
			String ages=br.readLine();
			String[] arrayAges=ages.split(" ");
			array=new Double[arrayAges.length];
			for(int j=0; j<arrayAges.length; j++) {
			array[j]=Double.parseDouble(arrayAges[j]);
				
			}
			i++;
			bubbleSort();
			System.out.println(Arrays.toString(array));
			//bw.write(Arrays.toString(array));
			
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {		
		br= new BufferedReader(new InputStreamReader(System.in));
		//bw= new BufferedWriter(new OutputStreamWriter(System.out));
		start();
		br.close();	

	}

}