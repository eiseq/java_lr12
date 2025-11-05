package kaplich.t319;

public class StateEmployee extends Employee {
    private double plusSalary;

    public StateEmployee(String name, String rank, double salary, double plusSalary)
            throws OkladException, PremiyaException {
        super(name, rank, salary);
        if (plusSalary < 0) {
            throw new PremiyaException("Премия не может быть отрицательной: " + plusSalary);
        }
        this.plusSalary = plusSalary;
    }

    public double getPlusSalary() {
        return plusSalary;
    }

    public void setPlusSalary(double plusSalary) {
        if (plusSalary < 0) {
            throw new IllegalArgumentException("Премия не может быть отрицательной: " + plusSalary);
        }
        this.plusSalary = plusSalary;
    }

    @Override
    public void calculateSalary() {
        try {
            if (plusSalary < 0) {
                throw new PremiyaException("Премия не может быть отрицательной: " + plusSalary);
            }
            double totalSalary = getSalary() + plusSalary;
            if (totalSalary <= 0) {
                throw new OkladException("Общая зарплата не может быть отрицательной или нулевой: " + totalSalary);
            }
            System.out.println("Зарплата штатного сотрудника " + getName() + ": " + totalSalary);
        } catch (PremiyaException | OkladException e) {
            System.err.println("Ошибка при расчете зарплаты: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Общая ошибка при расчете зарплаты: " + e.getMessage());
        }
    }
}
