import java.util.*;

public class restaurantForEachHashMap
{
		public static void main(String[] args)
		{
			HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

			restaurantMenu.put("Cheeseburger", 20);
			restaurantMenu.put("AppleSausce", 5);
			restaurantMenu.put("Zico Coco Water", 4);

			System.out.println(restaurantMenu.size());

			for (String item: restaurantMenu.keySet())
			{
				System.out.println("If you want " + item + ", then it only costs " + restaurantMenu.get(item) + " dollars.");
			}
		}
}
