package SerializationTest;
import java.io.*;

public class Person extends Insurance implements Serializable{
	private String personName;
    private Insurance Ins;

    Person(String name) {
        this.personName=name; 
       setinsurance("All State");
    }

    public String toString() {
        return personName + " " + getinsurance();
    }

     public static void main(String args[]) {
    	   	
    	Person person= new Person("Suchitra");
    	String filename = "PersonInsurance.txt";
    	 
        // Serialization
        try {
        	System.out.println("Object Before serialized");
         	System.out.println(person);
          // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
 
            // Method for serialization of object
            out.writeObject(person);
            out.close();
            file.close();
           System.out.println("Object has been serialized\n"
                              + "Data before Deserialization.");
            System.out.println(person);
         }
 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        person = null;
        // Deserialization
        
        try {
           // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
 
            // Method for deserialization of object
            person = (Person)in.readObject();
 
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization.");
            System.out.println(person);
              }
 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                                " is caught");
        }
        
     }
   
}
