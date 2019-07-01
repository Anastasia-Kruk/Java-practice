package lessons.lesson19.practice_2.task_4;

import lessons.lesson19.practice_2.task_3.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // имена переменных так себе
        Predicate<User> userPredicate = (user) -> user.getName().startsWith("A");
        Predicate<User> userPredicate1 = (user) -> user.getName().startsWith("P");
        Predicate<User> userPredicate2 = (user) -> user.getName().startsWith("E");

        List<User> users = new ArrayList<>();
        users.add(new User("Anna"));
        users.add(new User("Bob"));
        users.add(new User("Peter"));
        users.add(new User("Robin"));
        users.add(new User("Elena"));
        users.add(new User("Jon"));

        System.out.println(users + "\n");

        Predicate<User> namesPredicate = userPredicate.or(userPredicate1).or(userPredicate2);
        filter(users,namesPredicate);
        System.out.println(users);
    }

    private static List<User> filter (List<User>users, Predicate<User> predicate){
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if (predicate.test(user)){
                iterator.remove();
            }
        }
        return users;
    }
}
