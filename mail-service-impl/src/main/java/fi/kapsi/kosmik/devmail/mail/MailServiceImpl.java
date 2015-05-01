package fi.kapsi.kosmik.devmail.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private MailStorage mailStorage;

    @Override
    public long getMessageCount() {
        return mailStorage.getMessageCount();
    }
}
