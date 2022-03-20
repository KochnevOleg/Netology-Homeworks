package Unit1.JavaBasics.JavaCollections.Hash.HashSet;

public class Student {
    private String name;
    private String groupName;
    private String studentID;

    public Student(String name, String groupName, String studentID) {
        this.name = name;
        this.groupName = groupName;
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public int hashCode() {
        return studentID.hashCode();
    }

    public boolean equals(Object obj) {
        Student o = (Student) obj;
        return studentID.equals(o.studentID);
    }

    public String toString() {
        return name + " " + studentID + " " + groupName;
    }
}
