package fi.kapsi.kosmik.devmail;

import org.joda.time.LocalDateTime;

public class Utils {
	public String getTestString() {
		return new LocalDateTime().toString();
	}
}