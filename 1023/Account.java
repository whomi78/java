/**
 * ������� Ŭ����
 * @author ��ȿ�� 20131003
 *
 */

class Account {
	/**
	 * ���¹�ȣ
	 */
    String accountNo; 
    /**
     * ������ �̸�
     */
    String ownerName;    
    /**
     * �ܾ�
     */
    int balance;  
    
    /**
     * Account ������
     * @param accountNo : ���¹�ȣ
     * @param ownerName : ������ �̸�
     * @param balance   : �ܾ�
     */
    Account(String accountNo, String ownerName, int balance) {     // ������
        this.accountNo = accountNo; 
        this.ownerName = ownerName;  
        this.balance = balance;       
    }
    /**
     * �����Ѵ�.
     * @param amount : �Աݾ�
     */
    void  deposit(int amount)  {       
        this.balance += amount;
    }
    /**
     * ����Ѵ�.
     * @param amount : ��ݾ�
     * @return : ��ݾ�
     */
    int withdraw(int amount) {
        if (balance < amount)
            return 0;
        this.balance -= amount;
        return amount;
    }
}
