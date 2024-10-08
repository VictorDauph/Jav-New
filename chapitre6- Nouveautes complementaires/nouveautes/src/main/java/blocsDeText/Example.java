package blocsDeText;

public class Example {
	public static void main(String[] args) {
		String premierTextBlock = """
                Le Bret.
                Si tu laissais un peu ton âme mousquetaire
                La fortune et la gloire…  Cyrano.
                Et que faudrait-il faire ?
                (...)
                """;
		System.out.println(premierTextBlock);

				//remplace
				String string = "Le Bret.\n" +
				"Si tu laissais un peu ton âme mousquetaire\n" +  "La fortune et la gloire…\n" +
				"Cyrano.\n";
				
		System.out.println(string);

	}
}
