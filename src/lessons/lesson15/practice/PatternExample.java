package lessons.lesson15.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String string = "While major game play components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";
        ArrayList<String> list = new ArrayList<>();
        list.add("alert");
        list.add("add");
        list.add("good");
        list.add("plan");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            elem = elem.toLowerCase();
            Pattern pattern = Pattern.compile(elem);
            Matcher matcher = pattern.matcher(string.toLowerCase());
            int counter = 0;
            while (matcher.find()) {
                counter++;
            }
            System.out.println(elem + " - " + counter);
        }
    }
}
