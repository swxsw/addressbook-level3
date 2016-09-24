package seedu.addressbook.storage;

import java.nio.file.Path;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public interface Storage {
    
    /** Default file path used if the user doesn't provide the file name. */
    public static final String DEFAULT_STORAGE_FILEPATH = "addressbook.txt";

    public String getPath();

    public void save(AddressBook addressBook) throws StorageOperationException;
    
    public AddressBook load() throws StorageOperationException;
}
