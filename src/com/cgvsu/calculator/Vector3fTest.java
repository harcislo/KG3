//package com.cgvsu.calculator;
//import com.cgvsu.math.Vector3f;
//import com.cgvsu.model.Polygon;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class Vector3fTest {
//
//    @Test
//    void testSubtract() {
//        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
//        Vector3f vector2 = new Vector3f(4.0f, 5.0f, 6.0f);
//        Vector3f expected = new Vector3f(-3.0f, -3.0f, -3.0f);
//        assertEquals(expected, vector1.subtract(vector2));
//    }
//
//    @Test
//    void testCross() {
//        Vector3f vector1 = new Vector3f(1.0f, 2.0f, 3.0f);
//        Vector3f vector2 = new Vector3f(4.0f, 5.0f, 6.0f);
//        Vector3f expected = new Vector3f(-3.0f, 6.0f, -3.0f);
//        assertEquals(expected, vector1.cross(vector2));
//    }
//
//    @Test
//    void testNormalizeNonZeroVector() {
//        Vector3f vector = new Vector3f(3.0f, 4.0f, 0.0f);
//        Vector3f expected = new Vector3f(0.6f, 0.8f, 0.0f);
//        assertEquals(expected, vector.normalize());
//    }
//
//    @Test
//    void testNormalizeZeroVector() {
//        Vector3f vector = new Vector3f(0.0f, 0.0f, 0.0f);
//        assertThrows(IllegalArgumentException.class, () -> vector.normalize());
//    }
//
//    @Test
//    void testToString() {
//        Vector3f vector = new Vector3f(1.234567f, 8.901234f, 5.678901f);
//        assertEquals("(1,234567, 8,901234, 5,678901)", vector.toString());
//    }
//}