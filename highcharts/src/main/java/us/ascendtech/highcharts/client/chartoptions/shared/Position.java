package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Position {

	@JsProperty
	private String align;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private double x;
	@JsProperty
	private double y;
	@JsProperty
	private double offsetX;
	@JsProperty
	private double offsetY;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final Position setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final Position setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final Position setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final Position setY(double y) {
		this.y = y;
		return this;
	}

	@JsOverlay
	public final double getOffsetX() {
		return offsetX;
	}

	@JsOverlay
	public final Position setOffsetX(double offsetX) {
		this.offsetX = offsetX;
		return this;
	}

	@JsOverlay
	public final double getOffsetY() {
		return offsetY;
	}

	@JsOverlay
	public final Position setOffsetY(double offsetY) {
		this.offsetY = offsetY;
		return this;
	}
}
