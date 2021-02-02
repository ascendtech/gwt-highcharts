package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class RectangleObject {

	@JsProperty
	private Double number;
	@JsProperty
	private Double width;
	@JsProperty
	private Double x;
	@JsProperty
	private Double y;

	@JsOverlay
	public final Double getNumber() {
		return number;
	}

	@JsOverlay
	public final void setNumber(Double number) {
		this.number = number;
	}

	@JsOverlay
	public final Double getWidth() {
		return width;
	}

	@JsOverlay
	public final void setWidth(Double width) {
		this.width = width;
	}

	@JsOverlay
	public final Double getX() {
		return x;
	}

	@JsOverlay
	public final void setX(Double x) {
		this.x = x;
	}

	@JsOverlay
	public final Double getY() {
		return y;
	}

	@JsOverlay
	public final void setY(Double y) {
		this.y = y;
	}
}
