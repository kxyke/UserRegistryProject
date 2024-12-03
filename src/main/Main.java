import registry.UserRegistry;
import reports.*;

public class Main {
    public static void main(String[] args) {
        // Singleton Example
        UserRegistry registry = UserRegistry.getInstance();
        registry.registerUser("John Doe");

        // Decorator Example
        Report basicReport = new BasicReport();
        Report decoratedReport = new HeaderDecorator(new BorderDecorator(new ColorDecorator(basicReport)));

        System.out.println(decoratedReport.generate());
    }
}
