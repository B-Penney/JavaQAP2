package Problem3;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor with Person and Credit Limit
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = new Person(owner.getFirstName(), owner.getLastName(), owner.getAddress());
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(); // Initialize to $0.00
    }

    // Accessor for Balance
    public Money getBalance() {
        return new Money(this.balance);
    }

    // Accessor for Credit Limit
    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    // Accessor for Person's Information
    public String getPersonals() {
        return owner.toString();
    }

    // Charge Amount
    public void charge(Money amount) {
        Money newBalance = new Money(this.balance);
        newBalance.add(amount);
        if (newBalance.compareTo(this.creditLimit) <= 0) {
            this.balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Make a Payment
    public void payment(Money amount) {
        this.balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

