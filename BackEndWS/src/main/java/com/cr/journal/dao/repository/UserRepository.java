package com.cr.journal.dao.repository;


import com.cr.journal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer >
{

}
