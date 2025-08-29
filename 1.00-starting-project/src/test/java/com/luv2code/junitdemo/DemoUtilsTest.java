package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// @DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame() {

        String str = "hieu";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should be refer to same object");
        assertNotSame(str, demoUtils.getAcademyDuplicate(), "Objects should not be refer to same object");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse() {

        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should be return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");

    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull() {

//        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "JosephHieu";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }


//    @AfterEach
//    void tearDownAfterEach() {
//        System.out.println("Running @AfterEach");
//        System.out.println();
//    }
//
//    @BeforeAll
//    static void setupBeforeEachClass() {
//        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll() {
//        System.out.println("@AfterAll executes only once after all test methods execution in the class");
//    }
}
