import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.telephony.PhoneNumberUtils;

public class PhoneManager {
    private Context context;

    public PhoneManager(Context context) {
        this.context = context;
    }

    // Method to initiate a phone call
    public void makeCall(String phoneNumber) {
        if (PhoneNumberUtils.isGlobalPhoneNumber(phoneNumber)) {
            // Code to initiate call (requires permissions)
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + phoneNumber));
            context.startActivity(callIntent);
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }

    // Method to send an SMS
    public void sendSms(String phoneNumber, String message) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNumber, null, message, null, null);
    }
}
