package by.stormnet_hw.hw_12.task_1;

import java.io.*;
import java.util.Arrays;

public class FormattingText {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("C:\\Users\\Anast\\IdeaProjects\\Java-practice\\src\\by\\stormnet_hw\\hw_12\\task_1\\Animals");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Anast\\IdeaProjects\\Java-practice\\src\\by\\stormnet_hw\\hw_12\\task_1\\AnimalsFormatting")) {
            BufferedReader buffer = new BufferedReader(fileReader);
            PrintStream printStream = new PrintStream(fileOutputStream);

            String string;
            int counter = 0;
            int num = 0;
            while ((string = buffer.readLine()) != null) {
                String[] str = string.split(" ");
                for (String s : str) {
                    num++;
                    if (counter == 5) {
                        printStream.print(s + "\n");
                        counter = 0;
                    } else if (num == str.length) {
                        printStream.print(s);
                    } else {
                        printStream.print(s + ", ");
                        counter++;
                    }
                }
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
