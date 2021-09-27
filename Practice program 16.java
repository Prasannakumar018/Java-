import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
// Sort list in reverse order in Java
class Main
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Rec","Rit","Rsb","Rsa");
        Collections.sort(list, Collections.reverseOrder());
 
        System.out.println(list);
    }
}
