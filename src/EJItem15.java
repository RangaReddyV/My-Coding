import java.util.Arrays;

public class EJItem15 {
    public static void main(String[] args) {
        int a1[] = TestArray.arr;
        for (int a : a1 ){
            TestArray.arr[0] = 12;
        }
        System.out.println(TestArray.arr[0]);
    }
}

class TestArray{
    public static  final int arr [] = {1,4,5,7,10};
     void test(){
         arr[1] = 12;
     }
}