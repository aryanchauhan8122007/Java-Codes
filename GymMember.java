class GymMember {

    private String memberName;
    private double weight;
    private int membershipMonths;

    public void setMemberName(String name) {
        this.memberName = name;
    }

    public void setWeight(double weight) {
        if(weight > 0 && weight < 300) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight! ❌");
        }
    }

    public void setMembershipMonths(int months) {
        if(months > 0 && months <= 12) {
            this.membershipMonths = months;
        } else {
            System.out.println("Membership must be between 1 and 12 months! ❌");
        }
    }

    public String getMemberName() { return memberName; }
    public double getWeight() { return weight; }
    public int getMembershipMonths() { return membershipMonths; }
}

public class GymMember {
    public static void main(String[] args) {

        GymMember g = new GymMember();
        g.setMemberName("Rahul");
        g.setWeight(75.5);
        g.setMembershipMonths(6);
        g.setWeight(-10);         // invalid
        g.setMembershipMonths(15); // invalid

        System.out.println("Member: " + g.getMemberName());
        System.out.println("Weight: " + g.getWeight() + " kg");
        System.out.println("Membership: " + g.getMembershipMonths() + " months");
    }
}
