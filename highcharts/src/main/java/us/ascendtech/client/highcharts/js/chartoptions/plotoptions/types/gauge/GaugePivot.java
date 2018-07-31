package us.ascendtech.client.highcharts.js.chartoptions.plotoptions.types.gauge;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class GaugePivot {

	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private double radius;

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final GaugePivot setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final GaugePivot setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final GaugePivot setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final double getRadius() {
		return radius;
	}

	@JsOverlay
	public final GaugePivot setRadius(double radius) {
		this.radius = radius;
		return this;
	}
}
