
/**
 * ���� ������ ���ϴ� Ŭ���� 20130923
 * @author �ֿ���
 *
 */
class Circle {
	/**
	 * ������
	 */
	private double  radius ;    
	/**
	 * ������ : ��ü�� ������ ��� �������� �Է�
	 * @param radius : ������
	 */
	Circle(double  radius ) {     
		this.radius = radius;
	}
	/**
	 * ���� ������ ���ϴ� �޼���
	 * @return : ���� ����
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

