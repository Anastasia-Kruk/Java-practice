package lessons.lesson15.practice;

// Engineering_substring -> EngineeringSubstring и только так
public class Engineering_substring {
    public static void main(String[] args) {
        String str = "Engineering";
        String str2 = str.substring(0, 6);
        String str3 = str.substring(7, 10);
        System.out.println(str2 + " " + str3);
    }
}
