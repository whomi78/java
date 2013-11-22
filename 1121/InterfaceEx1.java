
public class InterfaceEx1 {
	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume(
				"863?777개", "개미","베르베르");
		AppCDinfo obj2 = new AppCDinfo(
				"2007-7001","Redhat Fedora");
		obj1.checkOut("길효열","2013-11-21");
		obj2.checkOut("길효열","2013-11-21");
		
		obj1.checkIn();
		obj2.checkIn();


	}

}
