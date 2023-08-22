import java.util.*;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentInfo = new HashMap<>();
        HashMap<Integer, Double> studentMarks = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            studentInfo.put(id, name);
            studentMarks.put(id, marks);
        }

        double highestScore = Double.MIN_VALUE;
        double lowestScore = Double.MAX_VALUE;
        int highestId = 0;
        int lowestId = 0;

        for (Map.Entry<Integer, Double> entry : studentMarks.entrySet()) {
            int id = entry.getKey();
            double marks = entry.getValue();

            if (marks > highestScore) {
                highestScore = marks;
                highestId = id;
            }

            if (marks < lowestScore) {
                lowestScore = marks;
                lowestId = id;
            }
        }

        System.out.println("Highest Score:");
        System.out.println("Name: " + studentInfo.get(highestId));
        System.out.println("ID: " + highestId);
        System.out.println("Score: " + highestScore);

        System.out.println("Lowest Score:");
        System.out.println("Name: " + studentInfo.get(lowestId));
        System.out.println("ID: " + lowestId);
        System.out.println("Score: " + lowestScore);
    }
}
