import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.provider.ContactsContract;
import android.database.Cursor;

public class ContactsManager {
    private Context context;

    public ContactsManager(Context context) {
        this.context = context;
    }

    // Method to read contacts
    public void readContacts() {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        if (cursor != null && cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
                String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                System.out.println("ID: " + id + " Name: " + name);
            }
            cursor.close();
        }
    }

    // Method to add a new contact
    public void addContact(String displayName) {
        // Logic to add a new contact
        // Implementation details depend on Android permissions and API 14+
        // For example, you would use ContentValues and ContentResolver to insert a new contact.
    }

    // Method to delete a contact
    public void deleteContact(String contactId) {
        // Logic to delete a contact using contactId
        // You would use ContentResolver to delete a contact from the contacts provider.
    }
}