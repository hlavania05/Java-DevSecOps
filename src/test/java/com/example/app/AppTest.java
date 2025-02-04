package com.example.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetMessage() {
        String expected = "Hello from the Java CI/CD Pipeline!";
        assertEquals(expected, App.getMessage());
    }
}