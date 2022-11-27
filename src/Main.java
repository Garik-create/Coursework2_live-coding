import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"first", "first", "second", "third", "forth",
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

    }
}
