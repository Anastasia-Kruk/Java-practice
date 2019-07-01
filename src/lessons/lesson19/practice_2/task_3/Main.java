package lessons.lesson19.practice_2.task_3;

public class Main {
    public static void main(String[] args) {
        BuildUser user = User::new;
        User one = user.build("Mary");

        System.out.println(one);
    }
}
