package addressBook.day1364.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import addressBook.day1364.model.Contact;
import static addressBook.day1364.repository.Queries.*;

@Repository
public class AddressBookRepo {

    @Autowired
    private JdbcTemplate template;

    public boolean saveNewDetails(Contact contact) {
        
        try {
            int added = template.update(
                SQL_INSERT_INFORMATION,
                contact.getEmail(), contact.getName(), contact.getPhone(), contact.getDate(),
                contact.getStatus(), contact.getPassPhrase());
            int add = template.update(
                SQL_SHA1, contact.getPassPhrase(), contact.getEmail());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
