package Q2;

import java.sql.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double expense) {
        this.serviceExpense = expense;
    }
    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double expense) {
        this.productExpense = expense;
    }

    public double getTotalExpense() {
        double serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());

        return serviceExpense - serviceDiscount + productExpense - productDiscount;
    }

    @Override
    public String toString() {
        return "Customer:" + customer.getName() + '\n' +
               "Date: " + date + '\n' +
               "Expense: " + getTotalExpense();
    }
}
