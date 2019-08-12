package com.example.demo.repository;
import com.example.demo.model.Contact;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer>{

}