package fi.kapsi.kosmik.devmail.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.subethamail.smtp.*;

import java.io.IOException;
import java.io.InputStream;

@Service
public class MailStorageMessageHandlerFactory implements MessageHandlerFactory {
    @Autowired
    private MailStorage mailStorage;

    @Override
    public MessageHandler create(MessageContext ctx) {
        return new MessageHandler() {
            private String from;

            private String data;

            @Override
            public void from(String from) throws RejectException {
                this.from = from;
            }

            @Override
            public void recipient(String recipient) throws RejectException {

            }

            @Override
            public void data(InputStream data) throws RejectException, TooMuchDataException, IOException {
                this.data = "Got data at " + System.currentTimeMillis();
            }

            @Override
            public void done() {
                mailStorage.store(from, data);
            }
        };
    }
}
