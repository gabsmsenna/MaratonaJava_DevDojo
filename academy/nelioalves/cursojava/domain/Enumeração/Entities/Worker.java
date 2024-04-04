package academy.nelioalves.cursojava.domain.Enumeração.Entities;

import academy.nelioalves.cursojava.domain.Enumeração.Entitie.Enum.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<Hour_Contract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(Hour_Contract contract) {
        contracts.add(contract);
    }

    public void removeContract (Hour_Contract contract) {
        contracts.remove(contract);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Hour_Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Hour_Contract> contracts) {
        this.contracts = contracts;
    }
}
