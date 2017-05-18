import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		PrintWriter writer = new PrintWriter("output.txt");

		RomanCalculator calculator = new RomanCalculator();
		String line = "";
		while ((line = br.readLine()) != null) {
			String result = calculator.calculate(line);
			writer.println(result);
		}
		br.close();
		writer.close();
	}

}
