package arrayList;
import java.util.*;

public class MultidimentinalArraList {

  public static void main(String args[]){
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    mainList.add(list1);

     ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(4);
    list2.add(5);
    list2.add(6);
    mainList.add(list2);

    System.out.println(mainList);

    for(int i = 0;i<mainList.size();i++){
        ArrayList<Integer> currList = mainList.get(i);

        for(int j = 0;j<currList.size();j++){
            System.out.print(currList.get(j));
        }
System.out.println();
    }
    System.out.println(mainList);

 



  }
    
}
