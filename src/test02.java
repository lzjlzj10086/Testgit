import org.junit.Test;

/**
 *
 * test类
 */
public class test02 {

    //第一题
    @Test
    public void testAdd(){
        int a=1;
        int sum=0;
        while(a<101){
            sum=sum+a;
            a++;
        }
        System.out.println(sum);
    }
    //第二题
    @Test
    public void multiplication(){
        for(int i=1;i<10;i++){
            for(int j=i;j<10;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    //第三题
    @Test
    public void singular(){
        System.out.println("100以内的单数：");
        for(int i=1;i<100;i++){
            if((i%2) == 1){
                System.out.print(i+" ");
            }
        }
    }
    //第四题
    @Test
    public void prime(){
        int sum=0;
        int j=0;
        for(int i=101;i<200;i++){
            for( j=2;j<= i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j == i){
                sum=sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n素数和："+sum);
    }
}
