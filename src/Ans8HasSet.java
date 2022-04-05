import java.util.HashSet;
import java.util.Set;

public class Ans8HasSet {
    public static void main(String[] args) {
        Set<Integer>num=new HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);
        for (int i=1; i<11; i++){
            if (num.contains(i)){
                System.out.println(i+ " Found in set");

            }else{
                System.out.println(i+ " Not found in set");
            }

        }
    }
}
