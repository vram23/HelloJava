import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Triggered job via Jenkins at " + new Date());
    }

}
