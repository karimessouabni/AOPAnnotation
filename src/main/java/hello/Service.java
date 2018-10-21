package hello;

import myAnnotation.ExecutionTime;

@org.springframework.stereotype.Service
public class Service {

    @ExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);

    }
}