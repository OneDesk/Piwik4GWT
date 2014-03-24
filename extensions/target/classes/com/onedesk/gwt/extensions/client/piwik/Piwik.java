package com.onedesk.gwt.extensions.client.piwik;

public interface Piwik {
	/**
	 * Log visit to this page
	 *
	 * @param customTitle page title
	 * @param customData JSON string with additional params
	 */
	void trackPageView(String customTitle, String customData);

	/**
	 * Trigger a goal
	 *
	 * @param idGoal goal id
	 * @param customRevenue amount to be recorded as revenue per click
	 * @param customData JSON string with additional params
	 */
	void trackGoal(int idGoal, int customRevenue, String customData);

	/**
	 * Set custom variable within this visit
	 *
	 * @param index
	 * @param name
	 * @param value
	 * @param scope Scope of Custom Variable:
	 *                     - "visit" will store the name/value in the visit and will persist it in the cookie for the duration of the visit,
	 *                     - "page" will store the name/value in the page view.
	 */
	void setCustomVariable(int index, String name, String value, String scope);

	/**
	 * Override url
	 *
	 * @param url
	 */
	void setCustomUrl(String url);
}
