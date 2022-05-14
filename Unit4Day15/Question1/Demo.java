package Unit4Day15.Question1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo {


	public static void main(String[] args) throws Exception{

		FileInputStream fis=new FileInputStream("emp.txt");

		ObjectInputStream ois=new ObjectInputStream(fis);

		Object obj=ois.readObject();

		Employee em =(Employee)obj;

		System.out.println("Employee Id"+em.getEmId());
		System.out.println("Employee Name:"+em.getName());
		Address a = em.getAddress();
		System.out.println("State:"+a.getState());
		System.out.println("City:"+a.getName());
		System.out.println("Pincode:"+a.getPincode());
		System.out.println("Email:"+em.getEmail());

		ois.close();

		}
}