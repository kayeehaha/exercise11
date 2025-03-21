import java.io.*;

public class ReadGroceries {
    public static void main(String[] args) {
        String path = "\"E:\\桌面\\exercise 11\\Groceries.txt\""; 
        
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("文件读取失败：" + e.getMessage());
        }
    }
}
