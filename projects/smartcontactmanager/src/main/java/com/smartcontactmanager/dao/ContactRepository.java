package com.smartcontactmanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.smartcontactmanager.entities.ContactInfo;

public interface ContactRepository extends JpaRepository<ContactInfo, Integer>{

    @Query ("from ContactInfo as c where c.user.id=:userId")
    public List<ContactInfo> findContactsByUser(@Param("userId") int userId);
}
