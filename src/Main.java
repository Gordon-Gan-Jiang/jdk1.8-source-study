import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Map map=new HashMap();
        map.putIfAbsent("gordon","24");
        System.out.println(map.values());    }
}
