import java.util.ArrayList;

public class GroceryList {
    ArrayList<String> groceriesList = new ArrayList<>();
    public void AddGroceryList (String item)
    {
        groceriesList.add(item);
    }
    public void printList ()
    {
        for (int i = 0; i < groceriesList.size(); i++) {
            System.out.println("At position" + (i + 1) + "there is :"+groceriesList.get(i));
        }
    }
    public void modifyGroceriesList(int position ,String NewItem)
    {
        groceriesList.set(position,NewItem);

        System.out.println("An additional item was added at"+(position+1));

    }
    public void removeItemOnTheList(int position)
    {
       String Theitem =groceriesList.get(position) ;
       groceriesList.remove(Theitem);
    }
    public String searchItem(String target)
    {
        int position=groceriesList.indexOf(target);
        if(position>=0)
        {
            return groceriesList.get(position);
        }
        return null;
    }

}
