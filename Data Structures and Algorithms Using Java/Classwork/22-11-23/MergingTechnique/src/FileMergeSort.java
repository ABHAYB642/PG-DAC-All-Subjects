
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileMergeSort {

	public static void main(String[] args) {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedWriter br3 = null;
		try {
			br1 = new BufferedReader(new FileReader("file1.txt"));
			br2 = new BufferedReader(new FileReader("file2.txt"));
			br3 = new BufferedWriter(new FileWriter("file3.txt"));
			// List<Integer> arr3 = new ArrayList<>();

			mergeSortAscending(br1, br2, br3);
			br3.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void mergeSortAscending(BufferedReader br1, BufferedReader br2, BufferedWriter br3) {
		try {

			br1 = new BufferedReader(new FileReader("file1.txt"));
			br2 = new BufferedReader(new FileReader("file2.txt"));
			br3 = new BufferedWriter(new FileWriter("file3.txt"));
			String file1 = br1.readLine();
			String file2 = br2.readLine();
			while (file1 != null && file2 != null) {

				int f1 = Integer.parseInt(file1);
				int f2 = Integer.parseInt(file2);
				if (f1 < f2) {
					System.out.println("File write f1");
					System.out.println(f1);
					br3.write(Integer.toString(f1));
					br3.newLine();
					file1 = br1.readLine();
				} else {
					System.out.println("File write f2");
					System.out.println(f2);
					br3.write(Integer.toString(f2));
					br3.newLine();
					file2 = br2.readLine();
				}
			}
			while (file1 != null) {
				int f1 = Integer.parseInt(file1);
				System.out.println("File write f11");
				System.out.println(f1);
				br3.write(Integer.toString(f1));
				br3.newLine();
				file1 = br1.readLine();
			}
			while (file2 != null) {
				int f2 = Integer.parseInt(file2);
				System.out.println("File write f22");
				System.out.println(f2);
				br3.write(Integer.toString(f2));
				br3.newLine();
				file2 = br2.readLine();
			}
			br3.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
