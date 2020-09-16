package w9;

/*
 * ������ Wrapper Ŭ������ Ȱ���ϴ� ���̴�. ���� ���α׷��� ����� �����ΰ�?
 * 'A'--> 'a'
 */

public class WrapperEx {

	public static void main(String[] args) {

				String aa = "ABC", bb="acscsdas";
				System.out.println(aa.toLowerCase()); // abc
				System.out.println(bb.toUpperCase()); // ACSCSDAS
				
				System.out.println();
				// Character ���
				System.out.println(Character.toLowerCase('A')); // 'A'�� �ҹ��ڷ� ��ȯ
				char c1='4', c2='F';
				if(Character.isDigit(c1)) // ���� c1�� �����̸� true
					System.out.println(c1 + "�� ����");
				if(Character.isAlphabetic(c2)) // ���� c2�� �������̸� true
					System.out.println(c2 + "�� ������");
				
				System.out.println();
				// Integer ���
				System.out.println(Integer.parseInt("28")); // ���ڿ� "28"�� 10������ ��ȯ
				System.out.println(Integer.toBinaryString(28)); // ���� 28�� 2���� ���ڿ��� ��ȯ
				System.out.println(Integer.toHexString(28)); // 28�� 16���� ���ڿ��� ��ȯ
				System.out.println(Integer.bitCount(28)); // 28�� ���� 2������ 1�� ����
				Integer i = new Integer(28);
				System.out.println(i.doubleValue()); // ������ double ������ ��ȯ. 28.0

				System.out.println();
				// Double ���
				Double d = new Double(3.14);
				System.out.println(d.toString()); // Double�� ���ڿ� "3.14"�� ��ȯ
				System.out.println(Double.parseDouble("3.14")); // ���ڿ��� �Ǽ� 3.14�� ��ȯ

				System.out.println();
				// Boolean ���
				boolean b = 4>3; // b�� true
				System.out.println(Boolean.toString(b)); // true�� ���ڿ� "true"�� ��ȯ
				System.out.println(Boolean.parseBoolean("false")); // ���ڿ��� false�� ��ȯ

				// �ڽ̰� ��ڽ� : JDK 1.5���� �ڽ̰� ��ڽ��� �ڵ����� �̷�������� �����ϵ�
				Integer ten = 10; 	// �ڵ� �ڽ�. Integer ten = new Integer(10);�� ����
				int n = ten; 	// �ڵ� ��ڽ�. int n = ten.intValue();�� ����

	}

}