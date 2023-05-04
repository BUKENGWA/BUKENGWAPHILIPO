package ServiceImpl;

import Repository.CustomerRepository;
import org.springframework.stereotype.Service;
@SuppressWarnings("ALL")
@Service
public class CustomerserviceImpl {
    private  CustomerRepository customerRepository;

    public CustomerserviceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
