package us.ascendtech.client.highcharts.js.chartoptions.plotoptions.types.gauge;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class GaugeDial {

	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String baseLength;
	@JsProperty
	private double baseWidth;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String radius;
	@JsProperty
	private String rearLength;
	@JsProperty
	private double topWidth;

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final GaugeDial setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBaseLength() {
		return baseLength;
	}

	@JsOverlay
	public final GaugeDial setBaseLength(String baseLength) {
		this.baseLength = baseLength;
		return this;
	}

	@JsOverlay
	public final double getBaseWidth() {
		return baseWidth;
	}

	@JsOverlay
	public final GaugeDial setBaseWidth(double baseWidth) {
		this.baseWidth = baseWidth;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final GaugeDial setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final GaugeDial setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getRadius() {
		return radius;
	}

	@JsOverlay
	public final GaugeDial setRadius(String radius) {
		this.radius = radius;
		return this;
	}

	@JsOverlay
	public final String getRearLength() {
		return rearLength;
	}

	@JsOverlay
	public final GaugeDial setRearLength(String rearLength) {
		this.rearLength = rearLength;
		return this;
	}

	@JsOverlay
	public final double getTopWidth() {
		return topWidth;
	}

	@JsOverlay
	public final GaugeDial setTopWidth(double topWidth) {
		this.topWidth = topWidth;
		return this;
	}
}
