import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//conclude the standard way to read file
public class Main4 {
	public static void main(String[] args) {
		
		System.out.println("reading process starts");
		
		File inputFile = null;
		
		inputFile = new File(Main4.class.getClassLoader().getResource("textFile.txt").getFile());
		
		System.out.println("AbsolutePath is:" + inputFile.getAbsolutePath());
		
		BufferedReader br = null;
		
		try{
			
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf8");
			
			br = new BufferedReader(inputStreamReader);
			
			String line = null;
			
			int count = 1;
			
			while((line = br.readLine())!=null){
				
				String[] splits = line.split(" ");
				
				System.out.print("the "+count+" line is:");
				
				for(String str:splits){
					System.out.print(str);
				}
				
				System.out.println();
				
			}
			
			br.close();
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("reading process ends");
		
		
		
		
	}
}
