/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hapid.cots;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author denri
 */
public class CounterTest {
    @Test
    public void testClear() {
        Counter testCounter = new Counter();
        
        for(int i = 0; i < 10; i++) {
            testCounter.add();
        }
        
        testCounter.clear();
        
        assertEquals(0, testCounter.getValue());
    }

    @Test
    public void testAdd() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.add();
            assertEquals(i, testCounter.getValue());
        }
    }

    @Test
    public void testSubtract() {
        Counter testCounter = new Counter();
        
        for(int i = 1; i < 10; i++) {
            testCounter.subtract();
            assertEquals(-i, testCounter.getValue());
        }
    }
    
}
