/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
 void getTriangleTypeTest() {
    try {
        assertEquals("is triangle", App.getTriangleType(2, 3, 4));
        assertEquals("is equailateral triangle", App.getTriangleType(3, 3,3));
        assertEquals("is isosceles triangle", App.getTriangleType(2, 2, 1));
        assertEquals("is right angle triangle", App.getTriangleType(3, 4,5));
        assertEquals("is triangle", App.getTriangleType(3, 5, 6));
        assertThrows(Exception.class, ()->App.getTriangleType(1, 2, 3));
    } catch (Exception e) {
        e.printStackTrace();
 }
 // assertEquals(true,true);

 }
}
