/**
 * ��ǰ ��� Ŭ����
 * @author �ֿ���
 *
 */
public class GoodsStock {
    //�ʵ�(�������)
	String goodsCode;
	//String �� New �� �����ص� ��~
	int stockNum;
    //������ 
	//(�⺻ ������ ����)
	//���1. Ŭ������� ������"�޼ҵ�"
	//���2. �޼ҵ� ��ȯ���� ����.
	//����1. ��ü �ʱ�ȭ = new(); ->��������� �� ����
	//public GoodsStock(){}
	public GoodsStock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
    //this.�� �������� �������, �ڿ����� ������
		this.stockNum = stockNum;
	}
	//��� �޼ҵ�
	/**
	 * ��� ���Ѵ� ��ɿ� �ش��ϴ� �޼ҵ�
	 * @param amount : �߰��ϱ� ���� ���
	 */
	void addStock(int amount){
		stockNum += amount;//stockNum = stockNum + amount;
	}
	/**
	 * ��� ���� ��ɿ� �ش��ϴ� �޼ҵ�
	 * @param amount : ���� ���� ���
	 * @return : ���� ���� ���
	 */
	int substractStock(int amount){
		if(stockNum < amount){
			return 0;
		}
		stockNum -=amount; //stockNum = stockNum - amount;
		return amount;
	}
}
