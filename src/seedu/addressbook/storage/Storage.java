package seedu.addressbook.storage;


import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Specifies the methods required for an object to represent the file used to store address book data.
 */

public interface Storage {
    
    /** Default file path used if the user doesn't provide the file name. */
    public static final String DEFAULT_STORAGE_FILEPATH = "addressbook.txt";
    
    public String getPath();

    public void save(AddressBook addressBook) throws StorageOperationException;
    
    public AddressBook load() throws StorageOperationException;
}
