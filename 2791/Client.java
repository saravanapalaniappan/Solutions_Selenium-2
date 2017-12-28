package com.htc.coreJava4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Insurance ins1=new Insurance(123);
		
		Person p1=new Person("Balu",ins1);
		
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Serialize.txt"));
		obj.writeObject(p1);
		obj.close();
		
		ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("C:\\Serialize.txt"));
		Person p2=(Person) obj1.readObject();
		System.out.println(p2.getPersonName() + p2.getIssId());
		obj1.close();
	}
}
