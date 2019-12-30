import java.io.*;
import java.util.*;

class AdminDelete {
    List<String> lines = new ArrayList<String>();
    String line = null;
    String reqdLine=null;
    int c=0;

    public void  deleteIt(String code) {
        try {
            File f1 = new File("/Users/vishalgupta/Desktop/Info.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                reqdLine=line;
                if (line.contains(code)){
                    System.out.println("Details "+line +" deleted");
                    line="";
                    c++;


            }
            if(line!=""){
            lines.add(line+"\n");}


            }

            if(c==0)
                System.out.println("Registration number not found!");

            fr.close();
            br.close();

            FileWriter fw = new FileWriter(f1);
            BufferedWriter out = new BufferedWriter(fw);
            for(String s : lines)
                out.write(s);
            out.flush();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        AdminDelete ad = new AdminDelete();
        System.out.println("Enter registration number: ");
        String code=sc.nextLine();
        ad.deleteIt(code);
    }
}