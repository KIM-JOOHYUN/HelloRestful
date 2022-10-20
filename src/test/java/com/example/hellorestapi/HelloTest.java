package com.example.hellorestapi;
import com.example.hellorestapi.Service.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    private Hello hello = new Hello();

    @Test
    public void testHello(){
        assertEquals("Hello, test1!! This is Test RESTFUL API:)", hello.hello("test1"));
    }
}
