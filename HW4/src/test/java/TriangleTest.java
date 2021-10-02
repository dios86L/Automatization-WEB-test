
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class TriangleTest {

    @Test
    void positiveSquare () throws  Exception {
        double result = Triangle.triangleSquare(3,5,8);
        Assertions.assertEquals(0,result);
    }

    @Test
    void negativeSquare () throws  Exception {
        assertThatExceptionOfType(Exception.class).isThrownBy(()-> Triangle.triangleSquare(-2,3,4) );
    }
}
