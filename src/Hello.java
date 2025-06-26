package example;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(name = "hello", 
            targetNamespace = "http://example.com/hello")
public class Hello {
    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}