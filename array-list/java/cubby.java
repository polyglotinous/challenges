import java.util.Iterator;
import java.util.ArrayList;
public class cubby{
    public static void main(String[] args){
        ArrayList groceryList = new ArrayList();
        
        groceryList.add("Orange juice");
        groceryList.add("Eggs");
        groceryList.add("Oatmeal");
        groceryList.add(7);
        
        System.out.print("After using .get(2): "); System.out.println(groceryList.get(2));
        System.out.println("Whole list: " + groceryList);
        
        groceryList.remove(1);
        System.out.println("What's left after .remove(1): ");
        Iterator it = groceryList.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
