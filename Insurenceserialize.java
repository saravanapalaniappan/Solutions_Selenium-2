package com.htc.Qsn3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Insurenceserialize {

	public static void main(String[] args) {
		Person object = new Person();
		Insurance Obj= new Insurance("Rahman",3318,60000);
		
		object.setInsurence(Obj);
		
        String filename = "C:\\Users\\UNLL\\Desktop\\Rahman.txt";
 
        // Serialization
        try {
 
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                                           (filename);
            ObjectOutputStream out = new ObjectOutputStream
                                           (file);
 
            // Method for serialization of object
            out.writeObject(object);
 
            out.close();
            file.close();
 
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization.");
           /* printdata(object);
 
            // value of static variable changed
            object.b = 2000;*/
        }
 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        object = null;


	}

}
