package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Background {

	@JsProperty
	private BackgroundColor backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private double innerRadius;
	@JsProperty
	private double outerRadius;
	@JsProperty
	private String shape;

	@JsOverlay
	public final BackgroundColor getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final Background setBackgroundColor(BackgroundColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Background setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Background setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Background setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final double getInnerRadius() {
		return innerRadius;
	}

	@JsOverlay
	public final Background setInnerRadius(double innerRadius) {
		this.innerRadius = innerRadius;
		return this;
	}

	@JsOverlay
	public final double getOuterRadius() {
		return outerRadius;
	}

	@JsOverlay
	public final Background setOuterRadius(double outerRadius) {
		this.outerRadius = outerRadius;
		return this;
	}

	@JsOverlay
	public final String getShape() {
		return shape;
	}

	@JsOverlay
	public final Background setShape(String shape) {
		this.shape = shape;
		return this;
	}
}
