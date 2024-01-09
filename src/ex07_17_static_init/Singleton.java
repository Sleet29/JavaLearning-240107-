package ex07_17_static_init;
public class Singleton {
	
	// 필드 s는 외부에서 사용 못합니다.
	// 이 문장은 처음 Singleton 클래스가 JVM에 로딩될 때 한 번만 실행합니다.
    
	private static Singleton s =new Singleton();
	
	//private : 외부에서 생성자를 호출할 수 없도록 막습니다.
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("여기는 getInstance 입니다.");
		return s;
	}
	/*
	private static final Singleton instance = new Singleton();

    private Singleton() {
    }
	    
    public static Singleton getInstance() {
    	return instance;
    }

    
    public void singleton() {
    	System.out.println("Singleton");
    }
    
    public static void main(String args[]) {
    	
    }*/
}

