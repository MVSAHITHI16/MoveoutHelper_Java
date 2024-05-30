package StudentSale.email;

/**
 *
 * @author harshila
 */
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import java.util.Properties;
import java.util.Random;

public class EmailUtil {

    public static String sendMail(String recepientMail, String recepientName, String verificationCode) throws Exception {
        System.out.println("Preparing to send an email");

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "sahithi199816@gmail.com";
        String password = "nhmupspzucxhgalw";

        Session session = Session.getInstance(properties, new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        Message message = prepareMessage(session, myAccountEmail, recepientMail, recepientName, verificationCode);
   System.out.println("sahithi fasak "+message);
        Transport.send(message);
        System.out.println("Verification email sent successfully");
        return verificationCode;
    }

    public static Message prepareMessage(javax.mail.Session session, String myAccountEmail, String recepientMail, String recepientName, String verificationCode) {
        try {
            javax.mail.Message message = new javax.mail.internet.MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientMail));
            message.setSubject("Account activation mail from Move Out Helpers");
            message.setText("Hi " + recepientName + ". Welcome to the family of Move Out Helpers. Experience ease in the process of moveout sale\n Please verify your account using this code: " + verificationCode);
            return message;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getRandomCode() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }
}
