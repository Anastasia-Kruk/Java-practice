package tests.test_24_05.task_3;

public class TypeInfo<AA> {
    AA name;

    public TypeInfo(AA name) {
        this.name = name;
    }

    public void getTypeInfo() {
        System.out.println(name + " - " + name.getClass().getName());
    }
}
