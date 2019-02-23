import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

        private StringUtils classUnderTest;

        @Before                                // wykonanie przed kazdym testem
        public void setUp() {
            System.out.println("Metoda zostanie wykonana przed kazdym testem");
            classUnderTest = new StringUtils();                                        // za kazdym razem przywraca nowy kalkulator
        }

        @After                                    // wykonane po kazdym tescie
        public void tearDown() {
            System.out.println("Metoda zostanie wykonana po kazdym tescie");
        }

        @Test                                                        //metoda testowa
        public void zipCodeTest() throws Exception {
            System.out.println("Metoda testowa");


            String a = "12345";

            String b = "12-345";

            String c = "123";

            String zip1 = "12345";

            boolean expected1 = false;

            boolean expected2 = true;

            boolean expected3 = false;

            boolean actual1 = classUnderTest.isValidZipCode(a);

            boolean actual2 = classUnderTest.isValidZipCode(b);

            boolean actual3 = classUnderTest.isValidZipCode(c);

            boolean actual4 = classUnderTest.isValidZipCode(zip1);

            Assert.assertFalse(actual1);

            Assert.assertTrue(actual2);

            Assert.assertFalse(actual3);
            Assert.assertFalse(actual4);


            System.out.println();

}
}
