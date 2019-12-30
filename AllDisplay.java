import java.io.*;
import java.util.*;

class AllDisplay {

    String line = null;
    
    public void  displayIt() {
        try{
            File f1 = new File("/Users/vishalgupta/Desktop/Info.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {

                    Scanner input=new Scanner(line).useDelimiter("-|\n");
                    String username = input.next();
                    String company = input.next();
                    String regNo = input.next().substring(0);
                    String insurance = input.next();
                    String fines = input.nextLine().substring(1);

                    System.out.println("Owner name: "+username+"\nCompany model: "+company+"\nRegistration number: "+regNo+"\nInsurance status: "+insurance+"\nFine payment status: "+fines+"\n\n");

                }

            fr.close();
            br.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
    public static void main(String args[]) {
        AllDisplay ad = new AllDisplay();
        ad.displayIt();
    }
}