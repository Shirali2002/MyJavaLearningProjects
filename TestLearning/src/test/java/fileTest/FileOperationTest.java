package fileTest;

import org.junit.Test;
import org.assertj.core.api.Assertions;

import java.io.File;

import static org.assertj.core.api.AssertionsForClassTypes.contentOf;

public class FileOperationTest {

    @Test
    public void fileTest(){
        File file = new File("src/test/java/fileTest/test.txt");

        Assertions.assertThat(file)
                .exists()
                .canRead()
                .canWrite()
                .hasExtension("txt")
                .hasName("test.txt");

        Assertions.assertThat(contentOf(file))
                .startsWith("Baku");

    }
}
