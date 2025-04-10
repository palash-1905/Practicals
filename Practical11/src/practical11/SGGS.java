/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical11;

/**
 *
 * @author kkawa
 */
// Base class representing SGGS college
public class SGGS {  
    static String collegeName = "Shri Guru Gobind Singhji Institute of Engineering & Technology";
    
    SGGS(int students, int teachers, int headOfDepartments, int nonTeachingStaff) {
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public static void main(String[] args) {
        SGGS college = new SGGS(7400, 100, 20, 40);

        Departments dept = new Departments("Information Technology", 300, 20);
        Subjects sub = new Subjects(dept, new String[]{"DS", "OOP", "DM", "CN", "COA", "JAVA", "PYTHON"});
        
        System.out.println("College Name: " + SGGS.getCollegeName());
        
        dept.displayDepartmentInfo();
        
        sub.displaySubjects();
    }
}

class Departments {
    private String departmentName;
    private int totalStudents;
    private int totalTeachers;

    Departments(String departmentName, int totalStudents, int totalTeachers) {
        this.departmentName = departmentName;
        this.totalStudents = totalStudents;
        this.totalTeachers = totalTeachers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    void displayDepartmentInfo() {
        System.out.println("\n--- Department Details ---");
        System.out.println("Department Name: " + departmentName);
        System.out.println("Total Students in Department: " + totalStudents);
        System.out.println("Total Teachers in Department: " + totalTeachers);
    }
}

class Subjects {
    private String[] subjectList;
    private Departments department;

    Subjects(Departments department, String[] subjectList) {
        this.department = department;
        this.subjectList = subjectList;
    }

    void displaySubjects() {
        System.out.println("- Subjects Offered in " + department.getDepartmentName() + " -");
        System.out.println(String.join(" ", subjectList));
    }
}
