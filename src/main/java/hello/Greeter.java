package hello;

import org.joda.time.LocalTime;

public class Greeter {
    public String sayHello() {
        LocalTime currentTime = new LocalTime();
        return "Hello world! It is "+ currentTime;
    }
}
