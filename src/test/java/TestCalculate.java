import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCalculate {

    @BeforeClass
    public static void beforeClass1() {
        System.out.println("beforeClass 1");
    }

    @BeforeClass
    public static void beforeClass2() {
        System.out.println("beforeClass 2");
    }

    @Before
    public void before1() {
        System.out.println("before 1");
    }

    @Before
    public void before2() {
        System.out.println("before 2");
    }

    @After
    public void after1() {
        System.out.println("after 1");
    }

    @After
    public void after2() {
        System.out.println("after 2");
    }

    @AfterClass
    public static void afterClass1() {
        System.out.println("afterClass 1");
    }

    @AfterClass
    public static void afterClass2() {
        System.out.println("afterClass 2");
    }

    int firstParam;
    int secondParam;
    int expected;

    public TestCalculate(int firstParam, int secondParam, int expected) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> setParams() {
        return Arrays.asList(new Integer[][]{{1, 2, 3},
//                {5, 2, 7},
//                {7, 3, 10},
//                {4, 0, 4},
        });
    }

    @Test
    public void testAdd() throws Exception {
        System.out.println("TEST");
        Calculate calculate = new Calculate();
        int add = calculate.add(firstParam, secondParam);
        Assert.assertEquals(expected, add);
    }
}
