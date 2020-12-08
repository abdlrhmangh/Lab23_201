import java.io.File;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a directory:");
		Scanner input = new Scanner(System.in);
		String directory=input.nextLine();
		
		System.out.println(direct(new File(directory))+" Files");

		input.close();
	}
	
	public static long direct(File file) {
		long size=0;
		
		if(file.isDirectory()) {
			File[] files= file.listFiles();
			for(int i=0; files!=null&&i<files.length;i++) {
				
				size+=direct(files[i]);
				
			}
		}
		else {
			size++;
		}
		return size;
	}

}
