package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(8);
        String []studentList = {
                "Riya","raj","Ashu","Aman","Sachin","Sunny",
                "Ankit","Adarsh","rohit","Archana","Shashank","Sagar","Anju","Saurabh"
        };

        for(String student:studentList)
        {
            CertificationSender task=new CertificationSender(student);
            service.submit(task);
        }

        service.shutdown();
    }
}
