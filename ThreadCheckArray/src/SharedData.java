import java.util.ArrayList;

/**
 * @author Lior Buzaglo
 * @version 1 Build November 2 , 2022
 *
 */
public class SharedData 
{
	private ArrayList <Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Constructor of SharedData class
	 * 
	 * 	@param array		 the array with all of the combination
	 * @param b 				the sum we are looking for
	 * 
	 * */
	
	
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}
	
	/**get the array that indicates where is the winning located
	 * 
	 * return winArray  the array with the information
	 *  */

	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	/**setting the array so we know were is the combination located at
	 * @param winArray 			when winning array after the checking
	 *  */

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/** return to the user the array with all of the numbers we received
	 * return array
	 *  */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	/** get the sum we searched in the array
	 * 
	 * return b
	 * */
	public int getB() 
	{
		return b;
	}
	/**get the flag that tells us if there is a combination that equals to b */
	public boolean getFlag() 
	{
		return flag;
	}
	/** set the flag 
	 * @param flag			let us know if there is a combination that is equal to b */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
