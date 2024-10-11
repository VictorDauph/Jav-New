package blocsDeText;

import java.text.NumberFormat;

public class Exercice {
	public static void main(String[] args) {
        String htmlContent = """
        		
    		<!DOCTYPE html>
        	<html>
        		<body>
        
        			<h1>My First Heading</h1>
        			<p>My first paragraph.</p>
        
        		</body>
        	</html>
        		""";

        // Affichage du contenu HTML
        System.out.println(htmlContent);
        
    	NumberFormat fmt = NumberFormat.getCompactNumberInstance();  
    	String result = fmt.format(250_350);  
    	System.out.println(result);
    }
	



}
