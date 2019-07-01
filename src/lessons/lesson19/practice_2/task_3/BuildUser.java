package lessons.lesson19.practice_2.task_3;

// BuildUser - это действие, по сути глагол, а имя класса должно быть существительным, т.е UserBuilder
public interface BuildUser {
    User build(String name);
}
