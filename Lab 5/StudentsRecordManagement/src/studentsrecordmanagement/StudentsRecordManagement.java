
package studentsrecordmanagement;
import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    public Student(String name,int rollNumber) {
        this.name=name;
        this.rollNumber=rollNumber;
    }
}
class University {
    Student[] students;
    int size;

    public University(int capacity) {
        students=new Student[capacity];
        size=0;
    }
    public void addStudent(String name,int rollNumber) {
        if (size<students.length) {
            students[size++]=new Student(name,rollNumber);
        } else {
            System.out.println("University is full. Cannot add more students.");
        }
    }
    public void sortByName() {
        for (int i=0; i<size-1; i++) {
            for (int j =0; j<size-i-1; j++) {
                if (compareNames(students[j].name,students[j+1].name)>0) {
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }
    }
    public int searchByName(String name) {
        for (int i=0; i<size; i++) {
            if (compareNames(students[i].name,name)==0) {
                return i; 
            }
        }
        return -1; 
    }
    private int compareNames(String name1,String name2) {
        return name1.compareTo(name2);
    }
    public void displayStudents() {
        for (int i=0; i<size; i++) {
            System.out.println("Name: "+students[i].name+", Roll Number: "+students[i].rollNumber);
        }
    }
}
public class StudentsRecordManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of students in the university:");
        int numStudents=scanner.nextInt();
        University university=new University(numStudents);

        System.out.println("Enter the details of the students:");
        for (int i=0; i<numStudents; i++) {
            scanner.nextLine(); 
            System.out.print("Enter name for Student "+(i+1)+": ");
            String name = scanner.nextLine();
            System.out.print("Enter Roll Number for Student "+(i + 1)+": ");
            int rollNumber=scanner.nextInt();

            university.addStudent(name,rollNumber);
        }
        System.out.println("\nStudents (Unsorted):");
        university.displayStudents();

        university.sortByName();

        System.out.println("\nStudents (Sorted by Name):");
        university.displayStudents();

        System.out.print("\nEnter the name to search: ");
        scanner.nextLine(); 
        String searchName=scanner.nextLine();
        int index=university.searchByName(searchName);

        if (index != -1) {
            System.out.println("\nStudent found at index "+index+": "+searchName);
        } else {
            System.out.println("\nStudent not found: "+searchName);
        }
        scanner.close();
    }
}
