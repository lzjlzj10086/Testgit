package day03;

/**
 *
 * 学生类
 * @liangzijie
 * @2020.3.4
 */

public class Student implements Comparable<Student>{
    //姓名
    private String studentName;
    //年龄
    private int studentAge;
    //成绩
    private int studentGrades;
    //班级
    private String studentClass;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(int studentGrades) {
        this.studentGrades = studentGrades;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return this.studentName+" "+this.studentGrades+" "+this.studentAge+" "+this.studentClass;
    }


    @Override
    public int compareTo(Student o) {
        if(this.studentGrades>=o.getStudentGrades()) {
            return 1;
        }
        return -1;
    }
}
