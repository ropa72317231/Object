import javax.swing.JFrame;

public class House {
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		
		User user = new User();
		user.age = 20;
		user.name = "ȫ�浿";
		
		Car car = new Car();
		car.tire = 4;
		car.engine = 3.0;
		car.brand = "����";
		cars[0] = car;
		//cars[0] = new Car(4, 3.0, "����");
		
		JFrame j = new JFrame("����~~~~");
		//j.setTitle("����~~~");
		j.setSize(400, 300);
		j.setVisible(true);
		
		user.car = car;
		System.out.println(user);
	}
}
