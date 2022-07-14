package com.springbank.config;

import com.springbank.model.Customer;
import com.springbank.model.SecurityCustomer;
import com.springbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDetails implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> target= customerRepository.findByEmail(username);
        if(target.size()==0){
            throw new UsernameNotFoundException("Cannot find user with name"+username);
        }
        return new SecurityCustomer(target.get(0));
    }
}
