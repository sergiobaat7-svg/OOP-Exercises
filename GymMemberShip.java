class GymMembership {
    private String memberName;
    private String membershipType;
    private int duration;
    private double baseFee;

    public GymMembership(String memberName, String membershipType, int duration, double baseFee) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
        this.baseFee = baseFee;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }

    public double calculateMembershipFee() {
        return baseFee * duration;
    }

    public boolean checkForSpecialOffer() {
        return duration >= 12;
    }

    public void displayMembershipDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Base Fee per Month: ₱" + baseFee);
        System.out.println("Total Fee: ₱" + calculateMembershipFee());
        System.out.println("Eligible for Special Offer: " + (checkForSpecialOffer() ? "Yes" : "No"));
    }
}

class PremiumMembership extends GymMembership {
    private boolean personalTrainer;
    private boolean spaAccess;

    public PremiumMembership(String memberName, int duration, double baseFee, boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration, baseFee);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    public boolean hasPersonalTrainer() {
        return personalTrainer;
    }

    public void setPersonalTrainer(boolean personalTrainer) {
        this.personalTrainer = personalTrainer;
    }

    public boolean hasSpaAccess() {
        return spaAccess;
    }

    public void setSpaAccess(boolean spaAccess) {
        this.spaAccess = spaAccess;
    }

    @Override
    public double calculateMembershipFee() {
        double total = super.calculateMembershipFee();
        if (personalTrainer) total += 1000 * getDuration();
        if (spaAccess) total += 500 * getDuration();
        return total;
    }

    @Override
    public void displayMembershipDetails() {
        super.displayMembershipDetails();
        System.out.println("Personal Trainer Included: " + (personalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access Included: " + (spaAccess ? "Yes" : "No"));
        System.out.println("Total Premium Fee: ₱" + calculateMembershipFee());
    }
}
