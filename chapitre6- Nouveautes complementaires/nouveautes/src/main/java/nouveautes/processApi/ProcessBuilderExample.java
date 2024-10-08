package nouveautes.processApi;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ProcessBuilderExample {
   public static void main(String[] args) throws IOException {
	   ProcessBuilder processBuilder = new ProcessBuilder("java", "--version");  
	   processBuilder.redirectOutput(Redirect.appendTo(new File("java-version.txt")));
	 //lance le process
	 Process p = processBuilder.start();
	 //L'arrête  p.destroy();

   }
}
