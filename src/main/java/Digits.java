import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num) {
		if (num==0) digitList.add(0);
		while (num>0) {
			digitList.insert(0,num%10);
			num=num/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
