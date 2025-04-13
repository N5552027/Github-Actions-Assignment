// src/test/java/com/example/AppTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(20, app.multiply(4, 5));
    }

    @Test
    public void testMultiplyByZero() {
        App app = new App();
        assertEquals(0, app.multiply(4, 0));
    }
}
