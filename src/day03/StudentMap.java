package day03;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    @Test
    public  void testStudent(){
        //调用第一个学生集合方法
        Map<Integer,Student> Map1=Map1();
        //调用第一个学生集合方法
        Map<Integer,Student> Map2=Map2();
        //调用整合两个map学生信息成一个新的map
        Map1.putAll(Map2);
        System.out.println(Map1);
        //调用按照学生分数给出学生信息排名
        sortGrades(Map1);
        //调用输出不及格学生信息
        flunkStudent(Map1);
        //找出张三信息
        findStudent(Map1);
        //剔除年龄大于18学生
        studentAgeBig18(Map1);
    }
    public Map<Integer,Student> Map1(){
        //创建第一个学生集合list
        Map<Integer,Student> Map1=new HashMap<Integer, Student>();
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
        Map1.put(1,student1);
        Map1.put(2,student2);
        Map1.put(3,student3);
        return  Map1;
    }
    public Map<Integer,Student> Map2(){
        //创建第一个学生集合list
        Map<Integer,Student> Map2=new HashMap<Integer, Student>();
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
        Map2.put(4,student1);
        Map2.put(5,student2);
        Map2.put(6,student3);
        return  Map2;
    }
    //输出不及格学生信息方法
    public void flunkStudent(Map<Integer,Student> Map3){
        System.out.println("不及格学生信息：");
        for (Map.Entry<Integer,Student> entry:Map3.entrySet()){
            if(entry.getValue().getStudentGrades()<60){
                System.out.println(entry);
            }
        }
    }
    //找出张三信息
    public void findStudent(Map<Integer,Student> Map3){
        System.out.println("张三学生信息：");
        for (Map.Entry<Integer,Student> entry:Map3.entrySet()){
            if("张三" == entry.getValue().getStudentName()){
                System.out.println(entry);
            }
        }
    }
    //剔除年龄大于18学生
    public void studentAgeBig18(Map<Integer,Student> Map3){
        System.out.println("//剔除年龄大于18学生后：");
        for (Map.Entry<Integer,Student> entry:Map3.entrySet()){
            if(entry.getValue().getStudentAge()>18){
                System.out.println(entry);
            }
        }
    }
//学生分数给出学生信息排名
    public void sortGrades(Map<Integer,Student> Map3){
        System.out.println("学生分数给出学生信息排名："+"这个不会，网上上不懂");

    }
}
