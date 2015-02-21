import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
	public static void main(String [] args){
		String string="";
        String inputFile ="resources/textFile.txt";

        System.out.println("reading process");
        
        //reading   
        try{
        	
        	//using FileInputStream, InputStream, InputStreamReader, BufferedReader
            InputStream ips=new FileInputStream(inputFile); 
            InputStreamReader ipsr=new InputStreamReader(ips);
            BufferedReader br=new BufferedReader(ipsr);
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                string+=line+"\n";
            }
            br.close(); 
        }       
        catch (Exception e){
            System.out.println(e.toString());
        }
        
        System.out.println("writing process");
        
        String outputFile = "outputFile.txt";
        
        System.out.println();
        
        System.out.println();
        
        //writing file
        try {
            FileWriter fw = new FileWriter (outputFile);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter fileOut = new PrintWriter (bw); 
                
            fileOut.println (string+"\n test of read and write !!"); 
            
            fileOut.close();
            System.out.println("the file " + outputFile + " is created!"); 
        }
        catch (Exception e){
            
        	System.out.println(e.toString());
        
        }       
	}
	
}
