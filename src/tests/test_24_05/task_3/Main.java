package tests.test_24_05.task_3;

public class Main {
    public static void main(String[] args) {
        TypeInfo<String> stringTypeInfo = new TypeInfo<>("Hello!");
        TypeInfo<Integer> integerTypeInfo = new TypeInfo<>(12345);
        TypeInfo<Double> doubleTypeInfo = new TypeInfo<>(26.05);
        TypeInfo<Float> floatTypeInfo = new TypeInfo<>((float) 1.5);
        TypeInfo<Long> longTypeInfo = new TypeInfo<>((long) 1234567891);

        stringTypeInfo.getTypeInfo();
        integerTypeInfo.getTypeInfo();
        doubleTypeInfo.getTypeInfo();
        floatTypeInfo.getTypeInfo();
        longTypeInfo.getTypeInfo();
    }
}
