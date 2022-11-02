public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	/**constructor of SharedData
	 * gets an array and an integer
	 * */
	public SharedData(int[] array, int b) {
		this.array = array;
		this.b = b;
	}
	/**getter of a boolean array, will display the flags for the indexes of numbers
	 * that the sum of these numbers will be the result of b
	 * */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/**setter of winArray, the boolean array*/
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/**getter of the array we will input*/
	public int[] getArray() 
	{
		return array;
	}
	/**getter of the number we will search a combination of in the array*/
	public int getB() 
	{
		return b;
	}
	/**getter of a flag*/
	public boolean getFlag() 
	{
		return flag;
	}
	/**setter of the flag*/
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
