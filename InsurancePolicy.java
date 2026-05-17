class InsurancePolicy {

    private String holderName;
    private double premiumAmount;
    private int policyYears;

    public void setHolderName(String name) {
        this.holderName = name;
    }

    public void setPremiumAmount(double amount) {
        if(amount > 0) {
            this.premiumAmount = amount;
        } else {
            System.out.println("Premium amount must be positive! ❌");
        }
    }

    public void setPolicyYears(int years) {
        if(years >= 1 && years <= 30) {
            this.policyYears = years;
        } else {
            System.out.println("Policy years must be between 1 and 30! ❌");
        }
    }

    public String getHolderName() { return holderName; }
    public double getPremiumAmount() { return premiumAmount; }
    public int getPolicyYears() { return policyYears; }
}

public class InsurancePolicy {
    public static void main(String[] args) {

        InsurancePolicy p = new InsurancePolicy();
        p.setHolderName("Rahul");
        p.setPremiumAmount(5000);
        p.setPolicyYears(10);
        p.setPremiumAmount(-100);  // invalid
        p.setPolicyYears(50);      // invalid

        System.out.println("Holder: " + p.getHolderName());
        System.out.println("Premium: ₹" + p.getPremiumAmount());
        System.out.println("Years: " + p.getPolicyYears());
    }
}
