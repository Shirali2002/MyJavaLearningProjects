package main.mock;

public class DummyCustomerServiceImpl implements DummyCustomerService{
    @Override
    public void addCustomer(String customerName) {
        System.out.println("add " + customerName);
    }

    @Override
    public void removeCustomer(String customerName) {
        System.out.println("remove " + customerName);
    }

    @Override
    public void updateCustomer(String customerName) {
        System.out.println("update " + customerName);
    }

    @Override
    public String getCustomer(String customerName) {
        System.out.println("get " + customerName);
        return "get " + customerName;
    }
}
