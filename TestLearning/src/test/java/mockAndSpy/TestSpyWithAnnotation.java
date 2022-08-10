package mockAndSpy;

import main.mock.DummyCustomerService;
import main.mock.DummyCustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestSpyWithAnnotation {
    @Mock
    private DummyCustomerServiceImpl serviceImpl;

    @Test
    public void test(){
        serviceImpl.addCustomer("istanbul");
    }
}
