package SingletonDesignPatternBreak;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ApplicationDeserializationRunner {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = null;
        
        System.out.println(obj1.hashCode());
        
        try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(obj1);
			out.close();
            
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
			obj2 = (Singleton) in.readObject();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(obj2 != null) {
        	System.out.println(obj2.hashCode());
        }
        
	}

}
