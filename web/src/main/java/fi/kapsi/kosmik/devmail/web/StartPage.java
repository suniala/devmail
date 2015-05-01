package fi.kapsi.kosmik.devmail.web;

import fi.kapsi.kosmik.devmail.mail.MailService;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class StartPage extends WebPage {
    private static final long serialVersionUID = 1L;

    @SpringBean
    private MailService mailService;

    public StartPage() {
        add(new Label("count", new AbstractReadOnlyModel<Long>() {
            @Override
            public Long getObject() {
                return mailService.getMessageCount();
            }
        }));
    }
}
