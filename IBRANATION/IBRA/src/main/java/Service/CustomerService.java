package Service;

import Entity.CustomerEntity;
import Repository.CustomerRepository;
import org.aspectj.apache.bcel.Repository;

import javax.management.loading.PrivateClassLoader;
import java.security.PrivateKey;
import java.util.List;

public interface CustomerService {
   //Create
   CustomerEntity addCustomer(CustomerEntity CustomerEntity);
   //Get all customer
   List<CustomerEntity> getallcustomer();
   //get customer by id
   CustomerEntity getcustomerById(Long id);
   //Update
   CustomerEntity updateCustomer(Long id, CustomerEntity CustomerEntity);
   //Delete
   Void DeleteCustomer(Long id);


}
