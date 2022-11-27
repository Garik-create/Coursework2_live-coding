import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
  /*      String[] strings = {"first", "first", "second", "third", "forth",
                "fifth", "second", "third", "forth", "fifth"};
        System.out.println(Arrays.toString(strings));
        String[] newStrings = {};
        List<String> newList = new ArrayList<>();
        for (String s : strings) {
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }
        System.out.println(Arrays.toString(newList.toArray()));
*/

//        task 2
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Peter");
        names.add("Vasily");
        names.add("Dmitry");
        names.add("Semen");
        System.out.println(names);
        List<String> newNames = new ArrayList<>();

        for (String name : names) {
            String substring = name.substring(1);
            newNames.add(substring);
        }

        System.out.println(newNames);
    }
}
