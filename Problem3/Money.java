package Problem3;

public class Money implements Comparable<Money> {
    private double amount;

    // Default Constructor
    public Money() {
        this.amount = 0.0;
    }

    // Parameterized Constructor
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy Constructor
    public Money(Money other) {
        this.amount = other.amount;
    }

    // Add method
    public void add(Money other) {
        this.amount += other.amount;
    }

    // Subtract method
    public void subtract(Money other) {
        this.amount -= other.amount;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    // CompareTo method
    @Override
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    // toString method
    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }
}

