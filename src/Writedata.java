import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writedata {
	public static void main(String[] args) throws IOException {
		Employe e = new Employe();
		e.id = 007;
		e.name = "shailesh";
		e.profile = "SDET";
		e.salary = 700;
		e.phone = 1234567;
		FileOutputStream fos = new FileOutputStream("info.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		fos.close();
		System.out.println("App End");

	}

}
