import com.ztq.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml") ;
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String shijie = demoService.sayHello("shijie");
        System.out.println(shijie);
        System.in.read();
    }
}
