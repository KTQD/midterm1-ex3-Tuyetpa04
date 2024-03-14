import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            String inputFile = "input.txt";
            String outputFile = "output.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Thay thế từ "Nha Trang" bằng từ "Vũng Tàu"
            String replacedContent = content.toString().replaceAll("Nha Trang", "Vũng Tàu");

            // Ghi nội dung đã thay thế vào tệp output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(replacedContent);
            writer.close();

            System.out.println("Đã thay thế và ghi nội dung vào tệp output.txt thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
