
/**
 * 원의 면적을 구하는 클래스 20130923
 * @author 최웅권
 *
 */
class Circle {
	/**
	 * 반지름
	 */
	private double  radius ;    
	/**
	 * 생성자 : 객체를 생성할 경우 반지름을 입력
	 * @param radius : 반지름
	 */
	Circle(double  radius ) {     
		this.radius = radius;
	}
	/**
	 * 원의 면적을 구하는 메서드
	 * @return : 원의 면적
	 */
	double getArea() {    
		double  area ;
		area = radius * radius * 3.14;
		return area;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}

