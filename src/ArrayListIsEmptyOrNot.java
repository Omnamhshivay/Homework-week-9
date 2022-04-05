import java.util.ArrayList;

public class ArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String>underground=new ArrayList<>();
        underground.add("bakerloo");
        underground.add("jubliee");
        underground.add("central");
        System.out.println(underground.isEmpty());
        if (!underground.isEmpty()){
            System.out.println("array list is not empty");
        }
    }
}
