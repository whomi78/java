
public class AccountMain {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
	 Account obj1 = new Account("000-001", "길효열", 100000);
	 
	 obj1.deposit(50000);
	 
	 StringBuffer str = new StringBuffer("계원대학교");
	 str.insert(2,"예술");
	 str.append(": 길효열");
	 str.delete(2,4);
	System.out.println(str);
	
	 

	}

}
