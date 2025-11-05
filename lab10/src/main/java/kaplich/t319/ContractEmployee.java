package kaplich.t319;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name, String rank, double salary) throws OkladException {
        super(name, rank, salary);
    }

    @Override
    public void calculateSalary() {
        try {
            if (getSalary() <= 0) {
                throw new OkladException("Зарплата не может быть отрицательной или нулевой: " + getSalary());
            }
            System.out.println("Зарплата сотрудника по контракту " + getName() + ": " + getSalary());
        } catch (OkladException e) {
            System.err.println("Ошибка при расчете зарплаты: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Общая ошибка при расчете зарплаты: " + e.getMessage());
        }
    }
}
