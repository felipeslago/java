package jsez19.JavaIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamClass {

	public static void main(String[] args) throws IOException {
		
		// Write in files is the same way of reading it
		// Use output instead input
		
		OutputStream os = new FileOutputStream("file.txt"); // This constructor can take another parameter indicating if the file will rewritten or kept
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			
			bw.write("Some text"); // The write method do not inserts line breakers but can be used the newLine method to do this
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bw.close(); // The file must be closed to avoid its content staying in buffer
			// The close method must be in a finally block, so if something went wrong, the file will be closed anyway
			// All opened streams and buffers must the closed, but if the last one is closed, the close method will cascade for the others objects
		}
	}
	
}
