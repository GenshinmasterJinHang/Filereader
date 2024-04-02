import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class App {
    public static void main(String[] args) throws Exception{
       String txt="D:\\workspace\\Groceries.txt";
       String txt1="D:\\workspace\\1.txt";
        FileReader sc = new FileReader(txt);
        FileWriter wr = new FileWriter(txt1);
        BufferedReader nh = new BufferedReader(sc);
        BufferedWriter nm = new BufferedWriter(wr);
        double sum = 0;
        String imp;  
        String partition = ",";
       String[] parts;
       nm.write("****************************************************"+"\n");
       nm.write("ID#\t\tItem\t\tQuantity\t\tPrice (€).\n");
       while ((imp=nh.readLine()) !=null) {
           
             System.out.println(imp);
             parts = imp.split(partition);
             double a = Double.parseDouble(parts[3]);
             sum+=a;
             String formattedId = parts[0].trim();  
                String formattedItem = parts[1].trim();  
                String formattedQuantity = parts[2].trim();  
                String formattedPrice = parts[3].trim();   
  
                
                String formattedLine = formattedId + "\t\t" + formattedItem + "\t\t" + formattedQuantity + "\t\t" + formattedPrice;
             nm.write(formattedLine);
             nm.newLine();

        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");  
        String formattedValue = decimalFormat.format(sum);  
        System.out.print("Total price is : " +formattedValue);
        nm.write("****************************************************"+"\n");
        nm.write("Total price is : "
        +formattedValue+"\n");
        nm.write("****************************************************");
        nh.close();
        nm.flush();
        nm.close();
    }
}
            
