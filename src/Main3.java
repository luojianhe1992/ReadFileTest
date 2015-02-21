import java.io.File;
import java.io.FileInputStream;

//test about the relative path and absolute path
public class Main3 {
	public static void main(String[] args) {
		String inputFilePath = "resources/textFile.txt";
		
		File inputFile = new File(inputFilePath);
		
		System.out.println("the relative path is:"+inputFilePath);
		
		System.out.println("the absolute path is:"+inputFile.getAbsolutePath());
	
	}
}
