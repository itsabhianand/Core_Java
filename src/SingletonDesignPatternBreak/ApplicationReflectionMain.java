package SingletonDesignPatternBreak;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApplicationReflectionMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = null;
        
        System.out.println(obj1.hashCode());
        
        // Creating Obj using Refection API
          try {
			Constructor<Singleton> constr = Singleton.class.getDeclaredConstructor();
			constr.setAccessible(true);
			obj2 = constr.newInstance();
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          catch(Exception ex) {
        	  System.out.println("Reflection Exception caught");
          }
          
          if(obj2 != null)
          System.out.println(obj2.hashCode());
          
          
	}

}
