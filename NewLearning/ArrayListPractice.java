import java.util.ArrayList;

public class ArrayListPractice
{
		public static void main(String[] args)
		{
				ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();

				weeklyTemperatures.add(110);
				weeklyTemperatures.add(97);
				weeklyTemperatures.add(99);
				weeklyTemperatures.add(50);
				weeklyTemperatures.add(0,120);

				for(int i = 0; i < weeklyTemperatures.size(); i++)
				{
					System.out.println(" Element number " + i + " of the array is " + weeklyTemperatures.get(i));
				}
		}
}	
