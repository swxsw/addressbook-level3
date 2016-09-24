package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * 
 * Dummy object for use in testing purposes.
 *
 */

public class StorageStub implements Storage {
    
    public StorageStub(String filePath){
        ;
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return null;
    }

}
