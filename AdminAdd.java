import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

class AdminAdd {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Owner name, company model, registration number, Insurance status ,Fine payment status : ");
        String username = input.nextLine();
        String company = input.nextLine();
        String regNo = input.nextLine();
        String insurance = input.nextLine();
        String fines = input.nextLine();

        Files.write(Paths.get("/Users/vishalgupta/Desktop/Info.txt"), (username+"-"+company+"-"+regNo+"-"+insurance+"-"+fines+"\n").getBytes(), StandardOpenOption.APPEND);
    }
}