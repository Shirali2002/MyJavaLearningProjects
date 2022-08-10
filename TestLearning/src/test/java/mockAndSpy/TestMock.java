package mockAndSpy;

import main.mock.DummyCustomerService;
import main.mock.DummyCustomerServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class TestMock {
    @Test
    public void testVerify(){
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Ankara");

        Mockito.verify(customerService).addCustomer("Istanbul");
        Mockito.verify(customerService, Mockito.never()).addCustomer("Izmir");
    }

    @Test
    public void testHowManyTimesCalled() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Ankara");

        Mockito.verify(customerService, Mockito.times(3)).addCustomer("Istanbul");
    }

    @Test
    public void testAtLeast() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Ankara");

        Mockito.verify(customerService, Mockito.atLeast(2)).addCustomer("Istanbul");
    }

    @Test
    public void testIsCalledCorrectOrder() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Izmir");
        customerService.addCustomer("Ankara");

        InOrder inOrder = Mockito.inOrder(customerService);
        inOrder.verify(customerService).addCustomer("Istanbul");
        inOrder.verify(customerService).addCustomer("Izmir");
        inOrder.verify(customerService).addCustomer("Ankara");
    }

    @Test
    public void testVerifyNoMoreInteractions() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("Istanbul");
        customerService.addCustomer("Izmir");
        customerService.addCustomer("Ankara");

        Mockito.verify(customerService).addCustomer("Istanbul");
        Mockito.verify(customerService).addCustomer("Izmir");
        Mockito.verify(customerService).addCustomer("Ankara");

        Mockito.verifyNoMoreInteractions(customerService);
    }

    @Test
    public void testVerifyNoInteractions() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        Mockito.verifyNoInteractions(customerService);
    }

    @Test
    public void testWhenThen1() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        Mockito.when(customerService.getCustomer(Mockito.eq("Istanbul"))).thenReturn("customer Istabul");

        String customer = customerService.getCustomer("Istanbul");
        Assertions.assertThat(customer).isEqualTo("customer Istabul");
    }

    @Test
    public void testWhenThen2() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        Mockito.when(customerService.getCustomer(Mockito.eq("Istanbul"))).thenThrow(new RuntimeException());
        String customer = customerService.getCustomer("Istanbul");
    }

    @Test
    public void testWhenThen3() {
        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        Mockito.doReturn("customerIstanbul").when(customerService.getCustomer("Istanbul"));
        String customer = customerService.getCustomer("Istanbul");
        Assertions.assertThat(customer).isEqualTo("customerIstanbul");
    }

    @Test
    public void testSpy() {
        DummyCustomerService customerService = Mockito.spy(new DummyCustomerServiceImpl());
        Mockito.doNothing().when(customerService).addCustomer(Mockito.eq("istanbul"));
//        Mockito.doThrow(new IllegalArgumentException()).when(customerService)
//                .removeCustomer(Mockito.eq("ankara"));

        Mockito.doNothing().when(customerService).removeCustomer(Mockito.eq("istanbul1"));
        Mockito.doNothing().when(customerService).removeCustomer(Mockito.eq("istanbul2"));
        Mockito.doCallRealMethod().when(customerService).removeCustomer(Mockito.eq("istanbul3"));

        customerService.removeCustomer("istanbul1");
        customerService.removeCustomer("istanbul2");
        customerService.removeCustomer("istanbul3");


    }
}
