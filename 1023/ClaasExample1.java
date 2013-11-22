
public class ClaasExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoodsStock obj;
		GoodsStock obj1;
		//obj = new GoodsStock();
		//GoodsStock obj = new GoodsStock(); 위와 같음
		//GoodsStock obj1 = new GoodsStock();
		//obj.goodsCode = "52135";
		//obj.stockNum = 200;
		obj = new GoodsStock("52135", 200);
		obj1 = new GoodsStock("52136", 300);
		System.out.println("상품코드 :" + obj.goodsCode);
		System.out.println("재고수량 :" + obj.stockNum);
		
		obj.addStock(100);
		System.out.println("재고수량 :" + obj.stockNum);
	
		obj.substractStock(200);
		System.out.println("재고수량 :" + obj.stockNum);
	}

}
