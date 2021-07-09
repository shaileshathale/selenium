
public class Led {
	public static void main(String[] args) {
		Light l = new Light() {

			@Override
			public String giveLight() {
				return "LED";
			}
		};
		String res = l.giveLight();
		System.out.println(res);
	}

}
