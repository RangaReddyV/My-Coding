import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class TryWithResources  implements  Cloneable{
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        BufferedReader br = null;
        TryWithResources x = new TryWithResources();
        System.out.println(x.clone()!=x);
        System.out.println(x.clone()+" "+x+" "+x.clone().getClass());
        System.out.println(x.clone().getClass() == x.getClass());
        try {
             br = new BufferedReader(new FileReader("/mypath/test"));
            br.readLine();
        }
        finally {
            System.out.println("before close "+br);
            br.close();

            System.out.println("after close");
        }
        LinkedList l = new LinkedList();
        l.indexOf("test");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
