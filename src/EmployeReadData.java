import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class EmployeReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("info.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		if (o instanceof Employe) {
			Employe e = (Employe) o;
			System.out.println(e.name + "" + e.id + "" + e.Dept + "" + e.profile + "" + e.phone + "");

		}
		fis.close();
		ois.close();

	}

}
