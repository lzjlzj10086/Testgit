package day03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class StudentList {
    @Test
    public  void testStudent(){
        //调用第一个学生集合方法
        List<Student> list1 = firstList();
        //调用第二学生集合方法
        List<Student> list2 = secondList();
        //调用整合两个list学生信息成一个新的list
        list1.addAll(list2);
        System.out.println(list1);
        //调用按照学生分数给出学生信息排名
        sortGrades(list1);

        //调用输出不及格学生信息
        flunkStudent(list1);

        //找出张三信息
        findStudent(list1);

        //剔除年龄大于18学生
        studentAgeBig18(list1);

    }
    //创建第一个学生类集合
    public  List<Student> firstList(){
        //创建第一个学生集合list
        List<Student> list1=new ArrayList<Student>();
        //创建学生对象
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        //封装学生数据
        student1.setStudentName("张三");
        student1.setStudentAge(18);
        student1.setStudentGrades(80);
        student1.setStudentClass("1班");
        student2.setStudentName("李四");
        student2.setStudentAge(19);
        student2.setStudentGrades(100);
        student2.setStudentClass("1班");
        student3.setStudentName("王五");
        student3.setStudentAge(17);
        student3.setStudentGrades(59);
        student3.setStudentClass("1班");
        //把学生数据添加到list1
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        return  list1;
    }
    public List<Student> secondList(){
        //创建第一个学生集合list
        List<Student> list2=new ArrayList<Student>();
        //创建学生对象
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        //封装学生数据
        student1.setStudentName("赵六");
        student1.setStudentAge(18);
        student1.setStudentGrades(85);
        student1.setStudentClass("2班");
        student2.setStudentName("刘七");
        student2.setStudentAge(19);
        student2.setStudentGrades(93);
        student2.setStudentClass("2班");
        student3.setStudentName("孙八");
        student3.setStudentAge(17);
        student3.setStudentGrades(55);
        student3.setStudentClass("2班");
        //把学生数据添加到list1
        list2.add(student1);
        list2.add(student2);
        list2.add(student3);
        return  list2;
    }
    //按照学生分数给出学生信息排名
    public void sortGrades(List<Student> list3){
       list3.sort(Comparator.naturalOrder());
       System.out.println("根据分数从小到大排序："+list3);
    }
    //输出不及格学生信息
    public void flunkStudent(List<Student> list3){
        System.out.println("输出不及格学生信息:");
        for(int i=0;i<list3.size();i++){
            if(list3.get(i).getStudentGrades()<60){
                System.out.println(list3.get(i));
            }
        }
    }
    //找出张三信息
    public void findStudent(List<Student> list3){
        System.out.println("张三信息为：");
        for (int i=0;i<list3.size();i++){
            if ("张三" == list3.get(i).getStudentName()){
                System.out.println(list3.get(i));
            }
        }
    }
    //剔除年龄大于18的学生
    public void studentAgeBig18(List<Student> list3){
        System.out.println("年龄大于18的学生:");
        for (int i=0;i<list3.size();i++){
            if (list3.get(i).getStudentAge()>18){
                list3.remove(i);
            }
        }
        System.out.println(list3);
    }
}
