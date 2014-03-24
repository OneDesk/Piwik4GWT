package com.onedesk.gwt.extensions.client.piwik;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface Configuration extends ConstantsWithLookup {
	public static Configuration CONFIG = GWT.create(Configuration.class);

	@Key("piwik.EXAMPLE") String piwikEXAMPLE();

}
