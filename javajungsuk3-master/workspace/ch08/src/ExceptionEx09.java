//class ExceptionEx09 {
//	public static void main(String args[]) {
//		try {
//			divide(3,0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//		//	e.printStackTrace();
//		}
//		
//	}
//	private static void divide ( int i, int j) throws Exception {
//		try {
//			int result = i / j ;
//			System.out.println("result = " + result);
//		}
//		//	Exception e = new Exception("���Ƿ� �߻�������.");
//		//	throw e;	 // ���ܸ� �߻���Ŵ
//		//  throw new Exception("���Ƿ� �߻�������.");  
//
//		catch (Exception e)	{
//		//	System.out.println("���ܰ� �߻�.");
//
//		//	System.out.println("���� �޽��� : " + e.getMessage());
//		//    e.printStackTrace();
//			
//			// �޼ҵ� �����ڰ� ���� ���� ó������ �ʰ�
//			// �޼ҵ带 �̿��ϴ� ������ ����ó���� �ϰ� �ϰ� �ʹ�.
//			// RuntimeException ex = new RuntimeException("���Ƿ� �߻�������.");
//			// ��üũ�� �迭�� ������ RuntimeException�� ����ϸ�
//			// �̿��ϴ� �� �����ڰ� try ~ catch ���뿩�θ� ���������� �ʴ´�.
//			// �׷��� RuntimeException Ŭ������ �� �ڽ� Ŭ�������� ��üũ��迭��
//			// ���ܶ�� �θ���.
//			
//			
//			Exception ex = new RuntimeException("���Ƿ� �߻�������.");
//			// üũ�� �迭�� ������ Exception �� ����ϸ�
//			// �̿��ϴ� �� �����ڰ� try ~ catch�� �ݵ�� �����ؾ� �Ѵ�.
//			throw ex; // ���ܸ� �߻���Ŵ
//			
//			
//			
//		}
//		System.out.println("���α׷��� ���� ����Ǿ���.");
//
//	}
//}
//