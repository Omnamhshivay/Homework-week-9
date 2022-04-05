import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("mitesh");
        name.add("bhavesh");
        name.add("vimal");
        name.add("pinakin");
        name.add("nidhi");
        Iterator itr = name.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
