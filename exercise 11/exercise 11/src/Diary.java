import java.io.*;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {
        String diaryFile = "Diary.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile, true));
             Scanner scanner = new Scanner(System.in)) {
             
            System.out.println("开始写日记（输入 'END' 或 'end' 结束）：");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("END")) {
                    break;
                }
                writer.write(input);
                writer.newLine();
            }
            System.out.println("日记已保存！");
        } catch (IOException e) {
            System.out.println("写入日记失败：" + e.getMessage());
        }
    }
}
