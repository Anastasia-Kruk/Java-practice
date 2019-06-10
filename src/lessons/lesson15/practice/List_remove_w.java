package lessons.lesson15.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class List_remove_w {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("world");
        list.add("tree");
        list.add(null);
        list.add("War");
        list.add("sea");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            if (elem == null) {
                iterator.remove();
            }else {
                elem = elem.toLowerCase();
                if (elem.startsWith("w")){
                    iterator.remove();
                }
            }
        }
        System.out.println(list);
    }
}
