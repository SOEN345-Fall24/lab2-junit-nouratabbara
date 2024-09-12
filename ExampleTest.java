import static org.junit.jupiter.api.Assertions.*;


class ExampleTest {

    Example example;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        example = new Example(5, 3);
    }

    @org.junit.jupiter.api.Test
    void negativeY_functionA(){
        int result = example.Function_A(-2);
        assertEquals(-7, result);
    }

    @org.junit.jupiter.api.Test
    void positiveY_functionA(){
        int result = example.Function_A(10);
        assertEquals(15, result);
    }

    @org.junit.jupiter.api.Test
    void lessThanSix_FunctionB() {
        int result = example.Function_B(3);
        assertEquals(6, result);

    }

    @org.junit.jupiter.api.Test
    void greaterThanSix_FunctionB() {
        int result = example.Function_B(10);
        assertEquals(7, result);
    }
}
