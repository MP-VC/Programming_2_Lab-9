package Q2;

public class DiscountRate {

    
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;

    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type) {
        switch (type.toUpperCase()) {

            case "PREMIUM":
                return serviceDiscountPremium;

            case "GOLD":
                return serviceDiscountGold;

            case "SILVER":
                return serviceDiscountSilver;
            
            default:
                return 0;
        }
    }

    public double getProductDiscountRate(String type) {
        switch (type.toUpperCase()) {

            case "PREMIUM":
                return productDiscountPremium;

            case "GOLD":
                return productDiscountGold;

            case "SILVER":
                return productDiscountSilver;
            
            default:
                return 0;
        }
    }
}
