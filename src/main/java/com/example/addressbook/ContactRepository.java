package com.example.addressbook;

import com.example.addressbook.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long>{
	public Contact findById(int id);
	public void deleteById(int id);
}