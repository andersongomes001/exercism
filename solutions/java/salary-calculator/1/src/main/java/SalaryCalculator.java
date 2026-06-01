public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5)? ((double)(100 - 15) /100) : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20)? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * this.bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.0;
        double multiplier = this.salaryMultiplier(daysSkipped);
        double finalSalary = (baseSalary * multiplier) + this.bonusForProductsSold(productsSold);
        return Math.min(finalSalary, 2000.0);
    } 
}
