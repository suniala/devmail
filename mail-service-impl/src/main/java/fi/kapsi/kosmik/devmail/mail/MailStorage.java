package fi.kapsi.kosmik.devmail.mail;

public interface MailStorage {
    void store(String sender, String data);

    long getMessageCount();
}
