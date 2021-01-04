package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDateFormatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Point {

	@JsProperty
	private String dateFormat;
	@JsProperty
	private PointDateFormatter dateFormatter;
	@JsProperty
	private PointDescriptionFormatter descriptionFormatter;
	@JsProperty
	private PointEvents events;
	@JsProperty
	private String valueDecimals;
	@JsProperty
	private String valueDescriptionFormat;
	@JsProperty
	private String valuePrefix;
	@JsProperty
	private String valueSuffix;

	@JsOverlay
	public final String getDateFormat() {
		return dateFormat;
	}

	@JsOverlay
	public final Point setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		return this;
	}

	@JsOverlay
	public final PointDateFormatter getDateFormatter() {
		return dateFormatter;
	}

	@JsOverlay
	public final Point setDateFormatter(PointDateFormatter dateFormatter) {
		this.dateFormatter = dateFormatter;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getDescriptionFormatter() {
		return descriptionFormatter;
	}

	@JsOverlay
	public final Point setDescriptionFormatter(PointDescriptionFormatter descriptionFormatter) {
		this.descriptionFormatter = descriptionFormatter;
		return this;
	}

	@JsOverlay
	public final String getValueDecimals() {
		return valueDecimals;
	}

	@JsOverlay
	public final Point setValueDecimals(String valueDecimals) {
		this.valueDecimals = valueDecimals;
		return this;
	}

	@JsOverlay
	public final String getValueDescriptionFormat() {
		return valueDescriptionFormat;
	}

	@JsOverlay
	public final Point setValueDescriptionFormat(String valueDescriptionFormat) {
		this.valueDescriptionFormat = valueDescriptionFormat;
		return this;
	}

	@JsOverlay
	public final String getValuePrefix() {
		return valuePrefix;
	}

	@JsOverlay
	public final Point setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		return this;
	}

	@JsOverlay
	public final String getValueSuffix() {
		return valueSuffix;
	}

	@JsOverlay
	public final Point setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		return this;
	}

}
