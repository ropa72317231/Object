public class Exam06_1_2_Main {
	// shift + alt + R
	public static void main(String[] args) {
		Exam06Book book1 = new Exam06Book();
		book1.publisher = "â��";
		book1.author = "Ȳ����";
		book1.title = "ö���� ���";
		
		Exam06Book book2 = new Exam06Book();
		book2.publisher = "������å";
		book2.author = "�ʹ� ����Ű";
		book2.title = "�����ٺ�";
		
		Exam06Book book3 = new Exam06Book();
		book3.publisher = "�Ѻ�����";
		book3.author = "���ѳ�";
		book3.title = "��¦ �ɸ���";
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
	}
}