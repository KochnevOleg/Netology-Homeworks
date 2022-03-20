package Unit1.JavaBasics.JavaCollections.Hash.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> setOfStudents = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студенте: 'ФИО, номер группы, номер студенческого билета'");
            String userInput = scan.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            String[] splitted = userInput.split(", ");

            Student newStudent = new Student(splitted[0], splitted[1], splitted[2]);

            if (setOfStudents.contains(newStudent)) {
                System.out.println("Студент с таким номером студенческого билета уже существует.");
                continue;
            }

            setOfStudents.add(newStudent);
        }

        System.out.println(setOfStudents);
    }
}
