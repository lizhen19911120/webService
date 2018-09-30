package example;

import com.HelloWorld;
import com.HelloWorldService;

/**
 * Created by lizhen on 2018/9/12.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      HelloWorld service = new HelloWorldService().getHelloWorldPort();
      //invoke business method
      String result = service.sayHelloWorldFrom("lizhen");
      System.out.println(result);
  }
}
