import java.io.*;

public class FormatGroceries {
    public static void main(String[] args) {
        String inputFile = "\"E:\\桌面\\exercise 11\\Groceries.txt\""; 
        String outputFile = "FormattedGroceries.txt";
        double totalPrice = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {


            writer.write("***********************************************************");
            writer.newLine();
            writer.write("ID   Item       Quantity(KG)  Price(€)");
            writer.newLine();
            writer.write("***********************************************************");
            writer.newLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String item = parts[1];
                    double quantity = Double.parseDouble(parts[2]);
                    double price = Double.parseDouble(parts[3]);
                    totalPrice += price;


                    writer.write(String.format("%-4d %-10s %-12.2f %.2f", id, item, quantity, price));
                    writer.newLine();
                }
            }


            writer.write("***********************************************************");
            writer.newLine();
            writer.write(String.format("The grocery shopping total is: €%.2f", totalPrice));
            writer.newLine();
            writer.write("***********************************************************");
            System.out.println("格式化文件已写入：" + outputFile);

        } catch (IOException e) {
            System.out.println("处理文件时发生错误：" + e.getMessage());
        }
    }
}
