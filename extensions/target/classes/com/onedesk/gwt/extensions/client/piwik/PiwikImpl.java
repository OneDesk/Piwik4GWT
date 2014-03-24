package com.onedesk.gwt.extensions.client.piwik;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;

public class PiwikImpl implements Piwik {
	public static final PiwikClientBundle clientbundle = GWT.create(PiwikClientBundle.class);

	private final JavaScriptObject piwikJSO;

	public PiwikImpl(int piwikId, String piwikUrl) {
		ScriptElement script = Document.get().createScriptElement(clientbundle.piwikJavaScript().getText());
		script.setType("text/javascript");
		Document.get().getBody().appendChild(script);

		piwikJSO = createInstance(piwikId, piwikUrl);
	}

	private native JavaScriptObject createInstance(int piwikId, String scriptUrl) /*-{
		return $wnd.Piwik.getTracker(scriptUrl, piwikId);
	}-*/;

	/**
	 * {@inheritDoc}
	 */
	@Override public native void trackPageView(String customTitle, String customData) /*-{
		(this.@com.onedesk.gwt.extensions.client.piwik.PiwikImpl::piwikJSO).trackPageView(customTitle, customData);
	}-*/;

	/**
	 * {@inheritDoc}
	 */
	@Override public native void trackGoal(int idGoal, int customRevenue, String customData) /*-{
		(this.@com.onedesk.gwt.extensions.client.piwik.PiwikImpl::piwikJSO).trackGoal(idGoal, customRevenue, customData);
	}-*/;

	/**
	 * {@inheritDoc}
	 */
	@Override public native void setCustomVariable(int index, String name, String value, String scope) /*-{
		(this.@com.onedesk.gwt.extensions.client.piwik.PiwikImpl::piwikJSO).setCustomVariable(index, name, value, scope)
	}-*/;

	/**
	 * {@inheritDoc}
	 */
	@Override public native void setCustomUrl(String url) /*-{
		(this.@com.onedesk.gwt.extensions.client.piwik.PiwikImpl::piwikJSO).setCustomUrl(url);
	}-*/;
}
