package fi.kapsi.kosmik.devmail.web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class DevMailApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return StartPage.class;
    }
}
