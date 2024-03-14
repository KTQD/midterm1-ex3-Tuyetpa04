import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            br.close();
            String replacedContent = content.toString().replaceAll("Nha Trang", "Vũng ");
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(replacedContent);
            bw.close();

            System.out.println("Đã thay thế và ghi nội dung vào tệp output.txt thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
