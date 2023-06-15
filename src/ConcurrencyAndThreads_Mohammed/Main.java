package ConcurrencyAndThreads_Mohammed;

import java.util.Random;

public class Main extends Thread {
	
	private static int[][] rand;
	private static int[] rowSum;
	private int iter;
	private static int index=0, max=0;
	
	public Main(int iter) {
		this.iter=iter;
	}
	
	public static void main(String args[]) {
		rand=new int[20][20];
		rowSum=new int[20];
		
		Random r=new Random();
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				rand[i][j]=r.nextInt(100)+1;				
			}
			
			Main t=new Main(i);
			t.start();
		}		
		System.out.println("Index = "+index);
	}
	
	public void run() {
		int sum=0;
		for(int i=0;i<20;i++) {
			sum+=rand[iter][i];
		}
		rowSum[iter]=sum;
		if(sum>max) {
			max=sum;
			index=iter;
		}
	}
}
