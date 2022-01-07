package com.home.serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog dog = new Dog();

		 FileOutputStream fileOutputStream = new FileOutputStream("D://abc.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(dog);
		System.out.println(dog.i + " " + dog.j);
		
		FileInputStream fileInputStream = new FileInputStream("D://abc.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Dog dog1 = (Dog) objectInputStream.readObject();
		System.out.println(dog1.i + " " + dog1.j + " " + dog1.k +" " +dog1.l);
	}

}
