import java.util.HashMap;
import java.util.Map;

public class Ans9HasMap {
    public static void main(String[] args) {
        Map<String,Integer> people=new HashMap<>();
        people.put("mitesh",36);
        people.put("bhavesh",35);
        people.put("vimal",37);
        for (Integer num : people.values()){
            System.out.println(num);

        }
    }
}
