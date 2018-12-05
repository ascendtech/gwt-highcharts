package us.ascendtech.highcharts.client.chartoptions.tooltip;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.DateTimeLabelFormats;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Formatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Positioner;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/tooltip
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Tooltip {

	@JsProperty
	private Boolean animation;
	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private Boolean crosshairs;
	@JsProperty
	private DateTimeLabelFormats dateTimeLabelFormats;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private Boolean followPointer;
	@JsProperty
	private Boolean followTouchMove;
	@JsProperty
	private String footerFormat;
	@JsProperty
	private Formatter formatter;
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
	private Formatter pointFormatter;
	@JsProperty
	private Positioner positioner;
	@JsProperty
	private Boolean shadow;
	@JsProperty
	private String shape;
	@JsProperty
	private Boolean shared;
	@JsProperty
	private double snap;
	@JsProperty
	private Boolean split;
	@JsProperty
	private Style style;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private double valueDecimals;
	@JsProperty
	private String valuePrefix;
	@JsProperty
	private String valueSuffix;
	@JsProperty
	private String xDateFormat;

	@JsOverlay
	public final Boolean getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Tooltip setAnimation(Boolean animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final Tooltip setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Tooltip setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Tooltip setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Tooltip setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getCrosshairs() {
		return crosshairs;
	}

	@JsOverlay
	public final Tooltip setCrosshairs(Boolean crosshairs) {
		this.crosshairs = crosshairs;
		return this;
	}

	@JsOverlay
	public final DateTimeLabelFormats getDateTimeLabelFormats() {
		return dateTimeLabelFormats;
	}

	@JsOverlay
	public final Tooltip setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Tooltip setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final Boolean getFollowPointer() {
		return followPointer;
	}

	@JsOverlay
	public final Tooltip setFollowPointer(Boolean followPointer) {
		this.followPointer = followPointer;
		return this;
	}

	@JsOverlay
	public final Boolean getFollowTouchMove() {
		return followTouchMove;
	}

	@JsOverlay
	public final Tooltip setFollowTouchMove(Boolean followTouchMove) {
		this.followTouchMove = followTouchMove;
		return this;
	}

	@JsOverlay
	public final String getFooterFormat() {
		return footerFormat;
	}

	@JsOverlay
	public final Tooltip setFooterFormat(String footerFormat) {
		this.footerFormat = footerFormat;
		return this;
	}

	@JsOverlay
	public final Formatter getFormatter() {
		return formatter;
	}

	@JsOverlay
	public final Tooltip setFormatter(Formatter formatter) {
		this.formatter = formatter;
		return this;
	}

	@JsOverlay
	public final String getHeaderFormat() {
		return headerFormat;
	}

	@JsOverlay
	public final Tooltip setHeaderFormat(String headerFormat) {
		this.headerFormat = headerFormat;
		return this;
	}

	@JsOverlay
	public final double getHideDelay() {
		return hideDelay;
	}

	@JsOverlay
	public final Tooltip setHideDelay(double hideDelay) {
		this.hideDelay = hideDelay;
		return this;
	}

	@JsOverlay
	public final Boolean getOutside() {
		return outside;
	}

	@JsOverlay
	public final Tooltip setOutside(Boolean outside) {
		this.outside = outside;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final Tooltip setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final String getPointFormat() {
		return pointFormat;
	}

	@JsOverlay
	public final Tooltip setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
		return this;
	}

	@JsOverlay
	public final Formatter getPointFormatter() {
		return pointFormatter;
	}

	@JsOverlay
	public final Tooltip setPointFormatter(Formatter pointFormatter) {
		this.pointFormatter = pointFormatter;
		return this;
	}

	@JsOverlay
	public final Positioner getPositioner() {
		return positioner;
	}

	@JsOverlay
	public final Tooltip setPositioner(Positioner positioner) {
		this.positioner = positioner;
		return this;
	}

	@JsOverlay
	public final Boolean getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Tooltip setShadow(Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final String getShape() {
		return shape;
	}

	@JsOverlay
	public final Tooltip setShape(String shape) {
		this.shape = shape;
		return this;
	}

	@JsOverlay
	public final Boolean getShared() {
		return shared;
	}

	@JsOverlay
	public final Tooltip setShared(Boolean shared) {
		this.shared = shared;
		return this;
	}

	@JsOverlay
	public final double getSnap() {
		return snap;
	}

	@JsOverlay
	public final Tooltip setSnap(double snap) {
		this.snap = snap;
		return this;
	}

	@JsOverlay
	public final Boolean getSplit() {
		return split;
	}

	@JsOverlay
	public final Tooltip setSplit(Boolean split) {
		this.split = split;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final Tooltip setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final Tooltip setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final double getValueDecimals() {
		return valueDecimals;
	}

	@JsOverlay
	public final Tooltip setValueDecimals(double valueDecimals) {
		this.valueDecimals = valueDecimals;
		return this;
	}

	@JsOverlay
	public final String getValuePrefix() {
		return valuePrefix;
	}

	@JsOverlay
	public final Tooltip setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		return this;
	}

	@JsOverlay
	public final String getValueSuffix() {
		return valueSuffix;
	}

	@JsOverlay
	public final Tooltip setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		return this;
	}

	@JsOverlay
	public final String getxDateFormat() {
		return xDateFormat;
	}

	@JsOverlay
	public final Tooltip setxDateFormat(String xDateFormat) {
		this.xDateFormat = xDateFormat;
		return this;
	}
}
