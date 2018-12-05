package us.ascendtech.highcharts.client.chartoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.TimezoneOffset;

import java.util.Date;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/time
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Time {

	@JsProperty
	private Date date;
	@JsProperty
	private TimezoneOffset getTimezoneOffset;
	@JsProperty
	private String timezone;
	@JsProperty
	private double timezoneOffset;
	@JsProperty
	private Boolean useUTC;

	@JsOverlay
	public final Date getDate() {
		return date;
	}

	@JsOverlay
	public final Time setDate(Date date) {
		this.date = date;
		return this;
	}

	@JsOverlay
	public final TimezoneOffset getGetTimezoneOffset() {
		return getTimezoneOffset;
	}

	@JsOverlay
	public final Time setGetTimezoneOffset(TimezoneOffset getTimezoneOffset) {
		this.getTimezoneOffset = getTimezoneOffset;
		return this;
	}

	@JsOverlay
	public final String getTimezone() {
		return timezone;
	}

	@JsOverlay
	public final Time setTimezone(String timezone) {
		this.timezone = timezone;
		return this;
	}

	@JsOverlay
	public final double getTimezoneOffset() {
		return timezoneOffset;
	}

	@JsOverlay
	public final Time setTimezoneOffset(double timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		return this;
	}

	@JsOverlay
	public final Boolean getUseUTC() {
		return useUTC;
	}

	@JsOverlay
	public final Time setUseUTC(Boolean useUTC) {
		this.useUTC = useUTC;
		return this;
	}
}
