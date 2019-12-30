import java.io.*;
import java.util.*;

class UserDisplay {

    String line = null;
    int c;
    public void  findIt(String code) {
        try{
            File f1 = new File("/Users/vishalgupta/Desktop/Info.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (line.contains(code)) {

                    Scanner input=new Scanner(line).useDelimiter("-|\n");
                    String username = input.next();
                    String company = input.next();
                    String regNo = input.next().substring(0);
                    String insurance = input.next();
                    String fines = input.nextLine().substring(1);

                    System.out.println("Owner name: "+username+"\nCompany model: "+company+"\nRegistration number: "+regNo+"\nInsurance status: "+insurance+"\nFine payment status: "+fines);


                    c++;
                }



            }
            if(c==0)
                System.out.println("Registration number not found!\nPlease contact Admin!");
            fr.close();
            br.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        UserDisplay ud = new UserDisplay();
        System.out.println("Enter registration number: ");
        String code=sc.nextLine();
        ud.findIt(code);
    }
}