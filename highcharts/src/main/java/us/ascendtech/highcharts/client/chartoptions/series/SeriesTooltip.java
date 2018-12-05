package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.DateTimeLabelFormats;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesTooltip {

	@JsProperty
	private DateTimeLabelFormats dateTimeLabelFormats;
	@JsProperty
	private double distance;
	@JsProperty
	private Boolean followPointer;
	@JsProperty
	private Boolean followTouchMove;
	@JsProperty
	private String footerFormat;
	@JsProperty
	private String headerFormat;
	@JsProperty
	private double hideDelay;
	@JsProperty
	private Boolean outside;
	@JsProperty
	private double padding;
	@JsProperty
	private String pointFormat;
	@JsProperty
	private Boolean split;
	@JsProperty
	private double valueDecimals;
	@JsProperty
	private String valuePrefix;
	@JsProperty
	private String valueSuffix;
	@JsProperty
	private String xDateFormat;

	@JsOverlay
	public final DateTimeLabelFormats getDateTimeLabelFormats() {
		return dateTimeLabelFormats;
	}

	@JsOverlay
	public final SeriesTooltip setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}

	@JsOverlay
	public final double getDistance() {
		return distance;
	}

	@JsOverlay
	public final SeriesTooltip setDistance(double distance) {
		this.distance = distance;
		return this;
	}

	@JsOverlay
	public final Boolean getFollowPointer() {
		return followPointer;
	}

	@JsOverlay
	public final SeriesTooltip setFollowPointer(Boolean followPointer) {
		this.followPointer = followPointer;
		return this;
	}

	@JsOverlay
	public final Boolean getFollowTouchMove() {
		return followTouchMove;
	}

	@JsOverlay
	public final SeriesTooltip setFollowTouchMove(Boolean followTouchMove) {
		this.followTouchMove = followTouchMove;
		return this;
	}

	@JsOverlay
	public final String getFooterFormat() {
		return footerFormat;
	}

	@JsOverlay
	public final SeriesTooltip setFooterFormat(String footerFormat) {
		this.footerFormat = footerFormat;
		return this;
	}

	@JsOverlay
	public final String getHeaderFormat() {
		return headerFormat;
	}

	@JsOverlay
	public final SeriesTooltip setHeaderFormat(String headerFormat) {
		this.headerFormat = headerFormat;
		return this;
	}

	@JsOverlay
	public final double getHideDelay() {
		return hideDelay;
	}

	@JsOverlay
	public final SeriesTooltip setHideDelay(double hideDelay) {
		this.hideDelay = hideDelay;
		return this;
	}

	@JsOverlay
	public final Boolean getOutside() {
		return outside;
	}

	@JsOverlay
	public final SeriesTooltip setOutside(Boolean outside) {
		this.outside = outside;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final SeriesTooltip setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final String getPointFormat() {
		return pointFormat;
	}

	@JsOverlay
	public final SeriesTooltip setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
		return this;
	}

	@JsOverlay
	public final Boolean getSplit() {
		return split;
	}

	@JsOverlay
	public final SeriesTooltip setSplit(Boolean split) {
		this.split = split;
		return this;
	}

	@JsOverlay
	public final double getValueDecimals() {
		return valueDecimals;
	}

	@JsOverlay
	public final SeriesTooltip setValueDecimals(double valueDecimals) {
		this.valueDecimals = valueDecimals;
		return this;
	}

	@JsOverlay
	public final String getValuePrefix() {
		return valuePrefix;
	}

	@JsOverlay
	public final SeriesTooltip setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		return this;
	}

	@JsOverlay
	public final String getValueSuffix() {
		return valueSuffix;
	}

	@JsOverlay
	public final SeriesTooltip setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		return this;
	}

	@JsOverlay
	public final String getxDateFormat() {
		return xDateFormat;
	}

	@JsOverlay
	public final SeriesTooltip setxDateFormat(String xDateFormat) {
		this.xDateFormat = xDateFormat;
		return this;
	}
}
