package Unit4Day15.Question1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Employee em = new Employee("326835", "Imran khan", new Address("Haryana", "Gurgaon", "271821"), "hrs@gmail.com");
        File f = new File("emp.txt");
        f.createNewFile();

        FileOutputStream fos = new FileOutputStream("emp.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(em);

        oos.close();
        System.out.println("Done....");

    }

}