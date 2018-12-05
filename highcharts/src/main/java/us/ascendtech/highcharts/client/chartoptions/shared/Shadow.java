package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Shadow {

	@JsProperty
	private String color;
	@JsProperty
	private double offsetX;
	@JsProperty
	private double offsetY;
	@JsProperty
	private double opacity;
	@JsProperty
	private double width;

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Shadow setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getOffsetX() {
		return offsetX;
	}

	@JsOverlay
	public final Shadow setOffsetX(double offsetX) {
		this.offsetX = offsetX;
		return this;
	}

	@JsOverlay
	public final double getOffsetY() {
		return offsetY;
	}

	@JsOverlay
	public final Shadow setOffsetY(double offsetY) {
		this.offsetY = offsetY;
		return this;
	}

	@JsOverlay
	public final double getOpacity() {
		return opacity;
	}

	@JsOverlay
	public final Shadow setOpacity(double opacity) {
		this.opacity = opacity;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final Shadow setWidth(double width) {
		this.width = width;
		return this;
	}
}
