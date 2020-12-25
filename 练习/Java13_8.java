import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Java13_8{
    public static String knights =
    "Then, when you have found the shrubbery, you must " +
    "cut down the mightiest tree in the forest... " +
    "with... a herring!";

    public static void main(String[] args){
        List<String> a = new ArrayList<String>();
        System.out.println(Arrays.toString(knights.split("the|you")));
        System.out.println(knights.replaceAll("[aeiouAEIOU]","_"));
    }
}