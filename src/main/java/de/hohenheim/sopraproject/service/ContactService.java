package de.hohenheim.sopraproject.service;

import de.hohenheim.sopraproject.entity.Contact;
import de.hohenheim.sopraproject.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository kontaktRepository;

    public Contact saveContact(Contact contact) {
        return kontaktRepository.save(contact);
    }

    public List<Contact> findAllContacts(){
            return kontaktRepository.findAll();
    }
}
