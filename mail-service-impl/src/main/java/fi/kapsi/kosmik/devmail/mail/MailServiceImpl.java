package fi.kapsi.kosmik.devmail.mail;

import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    @Override
    public String getTestString() {
        return "test";
    }
}
