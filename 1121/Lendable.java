/**
 * ���Ⱑ�� �������̽�
 * @author ��ȿ��
 *
 */
interface Lendable {
	/**
	 * �����Ѵ�.
	 * @param borrower : ������ �̸�
	 * @param date : ���� ��¥
	 */
     void checkOut(String borrower, String date); 
     /**
      * �ݳ��Ѵ�.
      */
     void checkIn(); 
}