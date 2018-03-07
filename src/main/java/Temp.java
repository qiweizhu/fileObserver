import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<String> arr=new ArrayList();
        String[] methodid="a,b".split(",");
        Collections.addAll(arr,methodid);
        System.out.println(arr);
    }
}
