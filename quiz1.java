public class quiz1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Johny walker", 2022, 4);
        s1.display();
    }
}

class Student {
    private int sID;
    private String name;
    private int admissionYear;
    private int gpa;

    public Student(int sID, String name, int admissionYear, int gpa) {
        this.sID = sID;
        this.name = name;
        this.admissionYear = admissionYear;
        this.gpa = gpa;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Student ID: " + getsID());
        System.out.println("Name: " + getName());
        System.out.println("Admission Year: " + getAdmissionYear());
        System.out.println("GPA: " + getGpa());
    }
}
