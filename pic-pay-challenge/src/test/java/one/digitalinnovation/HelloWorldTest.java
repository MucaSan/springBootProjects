package one.digitalinnovation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @BeforeAll
    static void testSomethingHere(){
        System.out.println("Log before all tests!");
    }

    @Test
    void verifyIfMessageReturnsTrue(){
        HelloWorld message = new HelloWorld("Hello World");
        Assertions.assertTrue(message.verifyMessage());
    }
    @Test
    void verifyIfMessageReturnsFalse(){
        HelloWorld message = new HelloWorld("Not Hello World");
        Assertions.assertFalse(message.verifyMessage());
    }
    @AfterAll All
    static void testAfterAll(){
        System.out.println("Logs after all tests");
    }
}
