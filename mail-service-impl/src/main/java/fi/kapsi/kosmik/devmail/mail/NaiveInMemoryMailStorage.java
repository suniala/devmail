package fi.kapsi.kosmik.devmail.mail;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
/* package-private */ class NaiveInMemoryMailStorage implements MailStorage {
    private List<String> storage = new ArrayList<>();

    @Override
    public void store(String sender, String data) {
        synchronized (storage) {
            storage.add(sender + ": " + data);
        }
    }

    @Override
    public long getMessageCount() {
        synchronized (storage) {
            return storage.size();
        }
    }
}
