
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubscriberInfo obj1;
		obj1 = new SubscriberInfo("�ֿ���", "Eddie", "1234");
		obj1.setPhoneNo("010-4106-5245");
		obj1.setAddress("����� ���ı� ���2��");
		
		SubscriberInfo obj2;
		obj2 = new SubscriberInfo("��ȿ��", "whomi78", "1234", "010-4873-4363", "��⵵ �����ν�");
		
		//System.out.println(obj1.name + obj1.id + obj1.password + obj1.phoneNo + obj1.address);
		System.out.println("�̸� : " + obj1.name);
		System.out.println("���̵� : " + obj1.id);
		System.out.println("��й�ȣ : " + obj1.password);
		System.out.println("��ȭ��ȣ : " + obj1.phoneNo);
		System.out.println("�ּ� : " + obj1.address);
	
	}

}
