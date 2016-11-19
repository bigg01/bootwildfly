package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        Map<String, String> env = System.getenv();
        if (env.containsKey("HOSTNAME")){
            String host = env.get("HOSTNAME");
            System.out.println(host);
        }
        String name = "oli";
        return ("Hello, SpringBoot on Wildfly" + name + ": " + host);
    }
}
