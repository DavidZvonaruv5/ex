import java.util.ArrayList;
import java.util.Scanner;

/**This class prints out the array, the number were trying to get to it,
 * and under it the flags turned on(1) that implies its part of the combination
 * and also tells which thread got to the combination 
 * @author davidzvonaruv
 * @version 1.1*/
public class TestThreadCheckArray {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		try (Scanner input = new Scanner(System.in)) {
			Thread thread1, thread2;
			System.out.println("Enter array size");
			int num  = input.nextInt();
			ArrayList<Integer> array = new ArrayList<Integer>();
			System.out.println("Enter numbers for array");
			
			for (int index = 0; index < num; index++)
			{
				int element  = input.nextInt();
				array.add(element);

			}
		
			System.out.println("Enter number");
			num = input.nextInt();
			
			SharedData sd = new SharedData(array, num);
			
			thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
			thread2 = new Thread(new ThreadCheckArray(sd), "thread2");
			thread1.start();
			thread2.start();
			try 
			{
				thread1.join();
				thread2.join();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if (!sd.getFlag())
			{
				System.out.println("Sorry");
				return;
			}
			System.out.println("Solution for b : " + sd.getB() + ",n = " + sd.getArray().size());
			System.out.print("I:    ");
			for(int index = 0; index < sd.getArray().size() ; index++)
				System.out.print(index + "    ");
			
			System.out.println();
			System.out.print("A:    ");
			for (int index : sd.getArray())
			{
				System.out.print(index);
				int counter = 5;
				while (true)
				{
					index = index / 10;
					counter--;
					if (index == 0)
						break;
				}
				for (int i = 0; i < counter; i++)
					System.out.print(" ");
			}

			System.out.println();
			System.out.print("C:    ");
			for (boolean index : sd.getWinArray())
			{
				if (index)
					System.out.print("1    ");
				else
					System.out.print("0    ");	
			}
			long endTime   = System.nanoTime();
			long totalTime = endTime - startTime;
	        System.out.println("\nThe program took " + totalTime/1000000000+ " seconds to finish");

		}
	}

}
