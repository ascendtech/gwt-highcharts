package us.ascendtech.client.highcharts.js.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DateTimeLabelFormats {

	@JsProperty
	private String day;
	@JsProperty
	private String hour;
	@JsProperty
	private String millisecond;
	@JsProperty
	private String minute;
	@JsProperty
	private String month;
	@JsProperty
	private String second;
	@JsProperty
	private String week;
	@JsProperty
	private String year;

	@JsOverlay
	public final String getDay() {
		return day;
	}

	@JsOverlay
	public final DateTimeLabelFormats setDay(String day) {
		this.day = day;
		return this;
	}

	@JsOverlay
	public final String getHour() {
		return hour;
	}

	@JsOverlay
	public final DateTimeLabelFormats setHour(String hour) {
		this.hour = hour;
		return this;
	}

	@JsOverlay
	public final String getMillisecond() {
		return millisecond;
	}

	@JsOverlay
	public final DateTimeLabelFormats setMillisecond(String millisecond) {
		this.millisecond = millisecond;
		return this;
	}

	@JsOverlay
	public final String getMinute() {
		return minute;
	}

	@JsOverlay
	public final DateTimeLabelFormats setMinute(String minute) {
		this.minute = minute;
		return this;
	}

	@JsOverlay
	public final String getMonth() {
		return month;
	}

	@JsOverlay
	public final DateTimeLabelFormats setMonth(String month) {
		this.month = month;
		return this;
	}

	@JsOverlay
	public final String getSecond() {
		return second;
	}

	@JsOverlay
	public final DateTimeLabelFormats setSecond(String second) {
		this.second = second;
		return this;
	}

	@JsOverlay
	public final String getWeek() {
		return week;
	}

	@JsOverlay
	public final DateTimeLabelFormats setWeek(String week) {
		this.week = week;
		return this;
	}

	@JsOverlay
	public final String getYear() {
		return year;
	}

	@JsOverlay
	public final DateTimeLabelFormats setYear(String year) {
		this.year = year;
		return this;
	}
}
