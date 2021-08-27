package SingletonDesignPatternBreak;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	
	private static Singleton obj;
	
	private Singleton() {
		
		if(obj != null) {
			throw new RuntimeException();
		}
		else {
			System.out.println("Instance created !!!!");
		}
	}
	
	public static Singleton getInstance() {
		if(obj == null) {
			synchronized(Singleton.class) {
			   if(obj == null) {
				   obj = new Singleton();
			   }
			}
		}
		
		return obj;
	}
	/*  the readResolve method allows a class to replace/resolve the object read from the stream 
	 * before it is returned to the caller. By implementing the readResolve method, 
	 * a class can directly control the types and instances of its own instances being deserialized.
	 * 
	 * */
	public Object readResolve() {
		return obj;
		
	}
	
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		throw new CloneNotSupportedException();
	}

}
