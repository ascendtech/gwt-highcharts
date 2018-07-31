package us.ascendtech.client.highcharts.js.chartoptions.plotoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PlotTargetOptions {

	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String color;
	@JsProperty
	private double height;
	@JsProperty
	private String width;

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final PlotTargetOptions setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final PlotTargetOptions setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final PlotTargetOptions setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getHeight() {
		return height;
	}

	@JsOverlay
	public final PlotTargetOptions setHeight(double height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final String getWidth() {
		return width;
	}

	@JsOverlay
	public final PlotTargetOptions setWidth(String width) {
		this.width = width;
		return this;
	}
}
