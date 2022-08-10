package suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestString.class,
        TestString1.class
})

public class TestAll {
}
