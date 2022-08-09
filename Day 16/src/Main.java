import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		FileInputStream fis = null;
		fis = new FileInputStream("D:/myfile.txt");
		int k;
		while(( k = fis.read() ) != -1)
		{
		System.out.print((char)k);
		}
		fis.close();

	}

}
// output
// Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
// Unhandled exception type FileNotFoundException
// Unhandled exception type IOException
// Unhandled exception type IOException