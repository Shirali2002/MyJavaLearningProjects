package mockAndSpy;

import main.mock.DummyCustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestMockWithAnnotation {
    @Mock
    private DummyCustomerService service;

    @Test
    public void test(){
        service.removeCustomer("istanbul");
    }
}
