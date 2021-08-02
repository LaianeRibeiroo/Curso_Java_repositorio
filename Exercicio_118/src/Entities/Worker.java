package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.enums.WorkerLevel;

public class Worker {
	private String Name;
	private WorkerLevel level; //level vai ser uma numeração da enumeração
	private Double basesalary;
	
	private Department department; //fazendo associação a entidade departament.java
	private List <HourContract> contracts = new ArrayList<>(); // criando lista poispode ter varios contratos. 
	

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.Name = name;
		this.level = level;
		this.basesalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return basesalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.basesalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) { // dentro do parenteses tem o que recebe... 
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract); // esta adicionando um contrato na lista conntrat passada como argumento
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = basesalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) { // para cada contrato c na lista contracts... faça
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
