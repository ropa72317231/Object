
public class MethodExam {
	// �� ���� �Է¹޾Ƽ� ū ���� ��ȯ�ϴ� ����� �޼ҵ�
	int getMaxValue(int v1, int v2) {
		if(v1 > v2) {
			return v1;
		} else {
			return v2;
		}
		//return 0;
		
	}
	public static void main(String[] args) {
		Math.pow(2, 10);
		MethodExam e = new MethodExam();
		int max = e.getMaxValue(100, 101);
		System.out.println(max);
	}

}
