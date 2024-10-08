import beans.Parrot;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext
                (ProjectConfig.class);
        // Gets a reference of a bean of type
        // Parrot from the Spring context
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        // get the String Bean
        String message = context.getBean(String.class);
        System.out.println(message);

        // get the Integer Bean
        Integer number = context.getBean(Integer.class);
        System.out.println(number);

        // close the context
        context.close();
    }
}
