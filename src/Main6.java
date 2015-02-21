import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;

//read all the file in a file folder
public class Main6 {
	public static void main(String[] args) {
		
		URL resource = Main6.class.getClassLoader().getResource("./txtFolder");
		
		System.out.println("URL resource is:"+resource);
		
		if(null != resource) {
		
			
			File f = new File(resource.getFile());
			
			System.out.println("f's absolutePath is "+ f.getAbsolutePath());
			
			
			//get all the file list
			for(File ft : f.listFiles()) {
				System.out.println("getPath() is:" +ft.getPath());
				
				System.out.println("getAbsolutePath() is:"+ft.getAbsolutePath());
				
				BufferedReader br = null;
				
				int countFile = 1;
			
				try{
					System.out.println("this is the "+countFile+" file");
					
					FileInputStream fileInputStream = new FileInputStream(ft);
					
					InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
					
					br = new BufferedReader(inputStreamReader);
					
					String line = null;
					
					int countLine = 1;
					
					while((line = br.readLine()) != null){
						String [] splits = line.split(" ");
						
						System.out.print("the "+countLine+" line content is:");
						
						for(String str:splits){
							System.out.print(str+"#");
						}
						
						System.out.println();
						
						countLine++;
						
					}
					
					br.close();
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				countFile++;
				
			}
			
		}
	}
}
