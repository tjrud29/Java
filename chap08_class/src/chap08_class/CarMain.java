package chap08_class;

public class CarMain {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		   Car myCar = new Car( "Toyota, Carmy", null);
		myCar.startEngine();
		myCar.acclerate(50);
	}

}
