package us.ascendtech.client.highcharts.js.chartoptions.shared;

public enum DashStyle {
	SOLID("Solid"),
	SHORT_DASH("ShortDash"),
	SHORT_DOT("ShortDot"),
	SHORT_DASH_DOT("ShortDashDot"),
	SHORT_DASH_DOT_DOT("ShortDashDotDot"),
	DOT("Dot"),
	DASH("Dash"),
	LONG_DASH("LongDash"),
	DASH_DOT("DashDot"),
	LONG_DASH_DOT("LongDashDot"),
	LONG_DASH_DOT_DOT("LongDashDotDot");

	private String dashStyle;

	DashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
	}

	public String getDashStyle() {
		return dashStyle;
	}
}
