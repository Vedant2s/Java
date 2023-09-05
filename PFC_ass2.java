import java.io.*;
import java.nio.file.*;
import java.util.*;

class Student {
    int rollno;
    String name;
    String address;
    double[] marks = new double[2];
    
    public Student(int rollno, String name, String address, double[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }
    
    public double calculatePercentageMTE() {
        
        return (marks[0]/30)*100;
    }
    public double calculatePercentageETE() {
        
        return (marks[1]/50)*100;
    }
    
    @Override
    public String toString() {
        String lop;
        if(calculatePercentageMTE()<40)
        lop="Fail";
        else
        lop="Pass";
        System.out.println("below student is "+lop+" in MTE");
        String lop2;
        if(calculatePercentageETE()<40)
        lop2="Fail";
        else
        lop2="Pass";
        System.out.println("below student is "+lop2+" in ETE");
        if(lop.equals(lop2))
        System.out.println("below student is PASS overall");
        else
        System.out.println("below student is FAIL overall");
        return "Roll No: " + rollno + "\nName: " + name + "\nAddress: " + address +
               "\nMarks: " + Arrays.toString(marks) + "\nPercentage: " + calculatePercentageMTE() + "% in MTE "+calculatePercentageETE()+"% in ETE";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        // Create some sample student records
        students.add(new Student(101, "John Doe", "123 Main St", new double[]{10,18}));
        students.add(new Student(102, "Jane Smith", "456 Elm St", new double[]{15,12}));
        students.add(new Student(103, "Alice Johnson", "789 Oak St", new double[]{12, 20}));
        
        // Write student records to a file
        try {
            Path filePath = Paths.get("student_records.txt");
            BufferedWriter writer = Files.newBufferedWriter(filePath);
            
            for (Student student : students) {
                writer.write(student.rollno + "," + student.name + "," + student.address + "," +
                             student.marks[0] + "," + student.marks[1] );
                writer.newLine();
            }
            
            writer.close();
            System.out.println("Student records saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Read student records from the file and calculate percentages
        try {
            List<String> lines = Files.readAllLines(Paths.get("student_records.txt"));
            
            for (String line : lines) {
                String[] parts = line.split(",");
                int rollno = Integer.parseInt(parts[0]);
                String name = parts[1];
                String address = parts[2];
                double[] marks = { Double.parseDouble(parts[3]), Double.parseDouble(parts[4])};
                Student student = new Student(rollno, name, address, marks);
                System.out.println(student);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
