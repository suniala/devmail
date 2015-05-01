package fi.kapsi.kosmik.devmail.mail;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.subethamail.smtp.server.SMTPServer;

@Service
/* package-private */ class SMTPService implements InitializingBean {
    @Autowired
    private MailStorageMessageHandlerFactory messageHandlerFactory;

    private SMTPServer smtpServer;

    @Override
    public void afterPropertiesSet() throws Exception {
        SMTPServer smtpServer = new SMTPServer(messageHandlerFactory);
        smtpServer.setPort(2525);
        smtpServer.start();
        this.smtpServer = smtpServer;
    }
}
