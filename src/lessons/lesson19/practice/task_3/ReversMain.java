package lessons.lesson19.practice.task_3;

public class ReversMain {
    static String srt = "one two three four five";

    public static void main(String[] args) {
        StringRevers stringRevers = (String words) -> {
            StringBuffer stringBuffer = new StringBuffer(words);
            StringBuffer string = stringBuffer.reverse();
            String wordsReverce = string.toString();
            return wordsReverce;
        };
        System.out.println(stringRevers.revers(srt));
    }
}
