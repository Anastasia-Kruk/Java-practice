package by.stormnet.hw_4.task_4;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArray {
    public static void main(String[] args) {

        String[] original = { "Каждый","охотник","желает","знать","где","сидит","фазан"};
        List<String> list = Arrays.asList(original);
        Collections.reverse(list);
        list.toArray(original);

        System.out.println(Arrays.toString(original));
    }
}
