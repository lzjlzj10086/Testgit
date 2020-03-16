import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    @Test
    public  void maptest(){
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry);
        }
        testDog();
    }

    /**
     *测试dog
     * liangzijie
     * 2020-3-4
     */
    public void testDog() {
        Dog dog = new Dog();
        dog.setId(1);
        dog.setAge(1);
        dog.setAge(12);
        dog.setName("kmkf");
        System.out.println(dog);
    }
}
