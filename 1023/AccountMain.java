
public class AccountMain {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
	 Account obj1 = new Account("000-001", "��ȿ��", 100000);
	 
	 obj1.deposit(50000);
	 
	 StringBuffer str = new StringBuffer("������б�");
	 str.insert(2,"����");
	 str.append(": ��ȿ��");
	 str.delete(2,4);
	System.out.println(str);
	
	 

	}

}
