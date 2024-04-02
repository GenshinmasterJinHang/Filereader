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
       String[] array;
       while ((imp=nh.readLine()) !=null) {
             System.out.println(imp);
             array = imp.split(partition);
             double a = Double.parseDouble(array[3]);
             sum+=a;
             nm.write(imp);
             nm.newLine();

        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");  
        String formattedValue = decimalFormat.format(sum);  
        System.out.print("Total price is : " +formattedValue);
        nm.write("Total price is : "
        +formattedValue);
        nh.close();
        nm.flush();
        nm.close();
    }
}
            
