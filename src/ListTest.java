import org.junit.Test;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public  void listTest01(){
        List<Dog> list = new ArrayList<Dog>();
        Dog dog = new Dog();
        dog.setId(1);
        dog.setAge(3);
        dog.setName("bob");
        list.add(dog);

        List<String> list2 = new ArrayList<String>();
        list2.add("qwe");
        list2.add("qwe1");
        list2.add("qwe2");
        List<String> list3=new ArrayList<String>();
        list3.add("2qwe");
        list3.add("2qwe1");
        list3.add("2qwe2");
        for (String str:list2){
            System.out.print(str+" ");
        }
        System.out.println("\n");
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i));
        }
        System.out.println("\n");
        list2.addAll(list3);
        System.out.println(list2.contains("qwe"));
        System.out.println(list.containsAll(list3));


    }
}
