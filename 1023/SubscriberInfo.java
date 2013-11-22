/**
 * 주소록 정보 20130923
 * @author 최웅권
 *
 */
class SubscriberInfo {
	
	/**
	 * 멤버변수 이름, 아이디, 비밀번호, 전화번호, 주소
	 */
    String name, id, password; 
    String phoneNo, address;
    /**
     * 생성자 : 객체를 생성할 경우 이름, 아이디, 비밀번호 입력
     * @param name : 이름
     * @param id : 아이디
     * @param password : 비밀번호
     */
    SubscriberInfo(String name, String id, String password) {
    	this.name = name;              
        this.id = id;              
        this.password = password;              
    }
    /**
     * 생성자 : 객체를 생성할 경우 이름, 아이디, 비밀번호, 전화번호, 주소 입력
     * @param name : 이름
     * @param id : 아이디
     * @param password : 비밀번호
     * @param phoneNo : 전화번호
     * @param address : 주소
     */
    SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
        this.name = name;              
        this.id = id;              
        this.password = password;              
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    /**
     * 비밀번호 변경
     * @param password : 변경하기 위한 비밀번호
     */
    void changePassword(String password) {
        this.password = password;              
    }
    /**
     * 전화번호 입력
     * @param phoneNo : 전화번호
     */
    void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    /**
     * 주소 입력
     * @param address : 주소
     */
    void setAddress(String address) {
        this.address = address;
    }
}
