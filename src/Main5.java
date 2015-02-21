import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


//The way to read all file in a file folder
public class Main5 {
	public static void main(String[] args) {
		
		System.out.println("reading process starts");
		
		String inputFilePath = "readText1.txt";
		
		File inputFile = new File(Main5.class.getClassLoader().getResource(inputFilePath).getFile());
		
//		inputFile = new File(Test2ForReadFile.class.getClassLoader().getResource("textFile.txt").getFile());

		
		System.out.println("getPath is:"+inputFile.getPath());
		
		System.out.println("getAbsolutePath is:"+inputFile.getAbsolutePath());
		
		BufferedReader br = null;
		
		List<String> result = new ArrayList<String>();
		
		try{
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			
			br = new BufferedReader(inputStreamReader);
			
			String line = null;
			
			int count = 1;
			
			
			
			while ((line = br.readLine()) != null){
				String [] splits = line.split(" ");
				
					System.out.println("the "+count+" line is: ");
				
					for(String str:splits){
						System.out.print(str+" ");
						
						result.add(str);
					}
					
					count++;
				
			}
			
			br.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("reading process ends");
		
		System.out.println();
		
		System.out.println(result);
		
		for(String str: result){
			System.out.print(str);
		}
		
		
		
		
	}
}
