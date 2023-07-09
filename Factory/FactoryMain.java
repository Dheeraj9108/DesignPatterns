import com.phone.OSFactory;
import com.phone.os;

public class FactoryMain {
    public static void main(String[] args) {
        //os obj = new Android(); //but here we are exposing which os we are using and if we want to change we have to recompile
        OSFactory osf = new OSFactory();
        os obj = osf.getInstance("Open");
        obj.spec();
        //incase in future if we have an extra class it will change the osfactory class but not the client application (class i,e. this class) 
    }
}