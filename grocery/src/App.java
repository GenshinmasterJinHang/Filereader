import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;

public class App {
    public static void main(String[] args) {
        File txt = new File("D:\\workspace\\Groceries.txt");
        FileReader nh = null;  
        BufferedReader bk = null; 
        double sum = 0;
        String line;  
        try {  
            nh = new FileReader(txt);  
            bk = new BufferedReader(nh);  
        while ((line = bk.readLine()) != null) {  
            System.out.println(line);
            String[] parts = line.trim().split(",");
            if (parts.length > 0) {  
                
                String lastPart = parts[parts.length - 1];  
                try {  
                    double value = Double.parseDouble(lastPart);  
                    sum += value;  
                } catch (NumberFormatException e) {  
                    System.err.println("Error");  
                }  
            }  
        }  
        System.out.printf("Total price is : " +"%.2f%n",sum);  
    } catch (IOException e) {  
        e.printStackTrace();  
    } finally {  
        try {  
            if (bk != null) {  
                bk.close();  
            }  
            if (nh != null) {  
                nh.close();  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
  }


