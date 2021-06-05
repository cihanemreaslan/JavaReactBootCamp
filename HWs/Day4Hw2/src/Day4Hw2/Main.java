package Day4Hw2;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer emre = new Customer(1, "cihan emre", "aslan", LocalDate.of(1881, 01, 01), "12312312312");
		customerManager.Save(emre);

	}
}
