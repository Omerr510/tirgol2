import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array = new ArrayList<>(); 
	private boolean [] winArray;
	private boolean flag;
	private final int b; 
	//javadoc for all here
	
	/**
	 * @param array
	 * @param b
	 * This function is the constractor of the class
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return array of boolean is where the numbers adds up to b.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 * 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
