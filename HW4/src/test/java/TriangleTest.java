import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void testLength() {
    if (a<0 || b<0 || c<0){
        System.out.println("Сторона треугольника не может иметь отрицательную величину");
    } else {
        return;
    }
    }

    @Test
    void Summ(){
        if (a+b<=c || a+c<=b || c+b<=a){
            System.out.println("Сумма сторон треугольника не может быть меньше или равнв третьей стороне");
        }
    }
}
