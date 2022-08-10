package suiteTest;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestString1 {
    @Test
    public void test1(){
        String s = "istanbul";
        Assertions.assertThat(s)
                .isEqualTo("istanbul")
                .startsWith("ist")
                .endsWith("bul")
                .contains("tan")
                .isNotEmpty();
    }
}
