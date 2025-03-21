import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        String writtenFile = "WriteAFileExample.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writtenFile))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a test file.");
            System.out.println("写入成功！");
        } catch (IOException e) {
            System.out.println("写入文件失败：" + e.getMessage());
        }
    }
}
