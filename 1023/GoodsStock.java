/**
 * 상품 재고 클래스
 * @author 최웅권
 *
 */
public class GoodsStock {
    //필드(멤버변수)
	String goodsCode;
	//String 은 New 를 사용안해도 됨~
	int stockNum;
    //생성자 
	//(기본 생성자 생략)
	//모습1. 클래스명과 동일한"메소드"
	//모습2. 메소드 반환값이 없다.
	//역할1. 객체 초기화 = new(); ->멤버변수에 값 대입
	//public GoodsStock(){}
	public GoodsStock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
    //this.가 붇은것은 멤버변수, 뒤에것은 생성자
		this.stockNum = stockNum;
	}
	//멤버 메소드
	/**
	 * 재고를 더한다 기능에 해당하는 메소드
	 * @param amount : 추가하기 위한 재고량
	 */
	void addStock(int amount){
		stockNum += amount;//stockNum = stockNum + amount;
	}
	/**
	 * 재고를 뺀다 기능에 해당하는 메소드
	 * @param amount : 빼기 위한 재고량
	 * @return : 빼기 위한 재고량
	 */
	int substractStock(int amount){
		if(stockNum < amount){
			return 0;
		}
		stockNum -=amount; //stockNum = stockNum - amount;
		return amount;
	}
}
