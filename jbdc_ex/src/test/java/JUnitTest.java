import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
//    @DisplayName() -> 필수는 아니지만 테스트명을 구분지어줄 때 사용
    @DisplayName("1+2는 3이다")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;
//        assertEquals : 기대값과 예상값을 비교해서 테스트 성공 여부
        Assertions.assertEquals(a + b, sum);
    }
}
