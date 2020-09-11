package io.eventador.flink.templates;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.PrintingOutputFormat;

import java.util.Collections;
import java.util.List;


public class HelloWorld {

     public static void main(String[] args) throws Exception {
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        List<String> helloWorldCollection = Collections.nCopies(200, "hello world");
        env.fromCollection(helloWorldCollection).output(new PrintingOutputFormat<>());
        env.execute();
     }
}
