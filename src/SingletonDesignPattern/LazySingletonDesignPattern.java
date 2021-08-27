package SingletonDesignPattern;

public class LazySingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj1 = ABC.getInstance();
        ABC obj2 = ABC.getInstance();
        
        if(obj1.equals(obj2)) {
       	 System.out.println(true);
        }
        else {
       	 System.out.println(false);
        }
	}
   
	 static class ABC {
		private static ABC obj;
		
		private ABC() {
			System.out.println("Instance created");
		}
		
		public static ABC getInstance() {
			if(obj == null) {
			 obj = new ABC();
		}
			
		return obj;
	 }
	}

}
