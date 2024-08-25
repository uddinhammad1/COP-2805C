
// Import the File class
import java.io.File;
import java.io.PrintWriter;

// Import the IOException class to handle errors
import java.io.IOException;

//Import this class for handling errors
import java.io.FileNotFoundException;

//Import the Scanner class to read content from text files
import java.util.Scanner;

//Import the FileWriter class
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class filing {

	public static void createfile() {
		try {
			File Obj = new File("data.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: " + Obj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

	public static List<Double> ReadFile(String file) {

		List<Double> n = new ArrayList<>();

		try {

			File Obj = new File("data.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				// String data = Reader.nextLine();
				// System.out.println(data);

				n.add(Double.parseDouble(Reader.next()));
			}
			Reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();

		}
		return n;

	}

	public static void WriteFile(List<Double> data, String file) {
		// try to read file to write to
		try {
			FileWriter Writer = new FileWriter(new File(file));
			// PrintWriter writer = new PrintWriter(new File(file));
			// loop through each data and write to file
			for (Double d : data) {
				System.out.println(d);
				Writer.write(String.valueOf(d) + "\n");
			}
			// flush contents of stream
			Writer.flush();
			// close the stream
			Writer.close();
			System.out.println("Successfully written");
		} catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		List<Double> numbers;
		// read into list
		numbers = ReadFile("data.txt");
		// sort list
		Collections.sort(numbers);
		// write to another file
		WriteFile(numbers, "data-sorted.txt");
		System.out.println("Successfully sorted");
	}
}
