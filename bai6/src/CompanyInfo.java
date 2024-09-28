class Company {
    private String name;
    private double revenue;
    private double expenses;
    public Company(String name, double revenue, double expenses) {
        this.name = name;
        this.revenue = revenue;
        this.expenses = expenses;
    }
    public double calculateProfit() {
        return revenue - expenses;
    }
    public void displayInfo() {
        System.out.println("Company Name: " + name);
        System.out.printf("Revenue: %.2f%n", revenue);
        System.out.printf("Expenses: %.2f%n", expenses);
        System.out.printf("Profit: %.2f%n", calculateProfit());
    }
    public String getName() {
        return name;
    }
    public double getRevenue() {
        return revenue;
    }
    public double getExpenses() {
        return expenses;
    }
}
public class CompanyInfo {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovators Ltd.", 1000000, 750000);
        company.displayInfo();
    }
}