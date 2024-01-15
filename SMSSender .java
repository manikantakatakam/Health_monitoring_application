import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import HealthMonitor;
public class SMSSender {

    // Replace these values with your Twilio credentials
    private static final String ACCOUNT_SID = "AC1b00982a1e3fb9350dc50be2cc6d2678";
    private static final String AUTH_TOKEN = "e3699c6cbcd28a5a681d55b6e6974f04";
    private static final String TWILIO_PHONE_NUMBER = "+12513456952";

    public static void main(String[] args) {
        // Initialize Twilio
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        // Replace this with the destination phone number
        String toPhoneNumber = "+919985700340";

        // Replace this with your actual message
        String messageBody = "abnormal health";

        // Send the SMS
        Message message = Message.creator(
                new PhoneNumber(toPhoneNumber),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                messageBody)
            .create();

        // Print the SID (a unique identifier for the message) for confirmation
        System.out.println("Message SID: " + message.getSid());
    }
}
