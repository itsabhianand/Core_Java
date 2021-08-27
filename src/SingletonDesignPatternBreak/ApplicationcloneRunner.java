package SingletonDesignPatternBreak;

public class ApplicationcloneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = null;
        
        System.out.println(obj1.hashCode());
        
        try {
			obj2 = (Singleton) obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("Clone not supportedexception caught !!!");
		}
        
        if(obj2 != null) {
        	System.out.println(obj2.hashCode());
        }
	}

}
