package com.stackoverflow.repository;

import com.stackoverflow.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountsRepository extends JpaRepository<Account,Integer> {

    public Account findByName(String name);


}
