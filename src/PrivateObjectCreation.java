import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateObjectCreation {
    public static void main(String[] args) {


    Constructor<PrivateObject> obj;

    {
        try {
            obj = PrivateObject.class.getDeclaredConstructor();
            obj.setAccessible(true);
            PrivateObject privateObject = obj.newInstance();

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    }
}

class PrivateObject{

    private PrivateObject(){
        System.out.println("hello");
    }

}
