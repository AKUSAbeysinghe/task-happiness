package com.amigoscode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
@Repository
public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {


}
