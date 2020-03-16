import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test03 {
    //第一题:数组排序，从小到大
    @Test
    public void test01(){
        int[] nums={1,23,6,74,8,19,104};
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    //去掉数组中的5，生成新的数组
    @Test
    public void newArry(){
        int []arr={1,2,3,4,5,5,5,5,6,7,8,9};
        List list=new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 5){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
    //将两个数组合并，并按照从小到大排序，生成新的数组
    @Test
    public void newArry01(){
        int []arr1={1,3,5,7,9};
        int []arr2={2,4,6,8,10};
        int []arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int temp=0;
        for(int i=arr1.length;i<arr3.length;i++){
            arr3[i]=arr2[temp];
            temp++;
        }
        for(int i=0;i<arr3.length-1;i++){
            for(int j=0;j<arr3.length-1-i;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp1=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp1;
                }
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    //第四题，在hello world！字符串面前加上自己的姓名
    @Test
    public void newString(){
        String myname="梁子杰 ";
        String name="Hello world!";
        String newname=myname+name;
        System.out.println(newname);
    }
    //将字符串1,2,3,4,5,，根据“，”分开，将其数字转化为数组，在控制台打印出来
    @Test
    public void newString01(){

        String s="1,2,3,4,5,6,7";
        String []s1=s.split(",");

        for(int i=0;i<s1.length;i++){

            System.out.print(s1[i]+" ");
        }

    }
    //计算hello world 中出现几次l
    @Test
    public void counting(){
        String string="hello world";
        char []newstring=new char[string.length()];
        newstring=string.toCharArray();
        int count=0;
        for(int i=0;i<newstring.length;i++){
            if(newstring[i] == 'l'){
                count++;
            }
        }
        System.out.println("出现："+count);
    }
}
