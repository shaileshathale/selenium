
public class Tuelight implements Light {
	@Override
	public String giveLight() {
		return "Tubelight";
	}

	public static void main(String[] args) {
		Tuelight t1 = new Tuelight();
		System.out.println(t1.giveLight());
	}
}
