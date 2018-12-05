package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LinearGradient {

	@JsProperty
	private double x1;
	@JsProperty
	private double x2;
	@JsProperty
	private double y1;
	@JsProperty
	private double y2;

	@JsOverlay
	public final double getX1() {
		return x1;
	}

	@JsOverlay
	public final LinearGradient setX1(double x1) {
		this.x1 = x1;
		return this;
	}

	@JsOverlay
	public final double getX2() {
		return x2;
	}

	@JsOverlay
	public final LinearGradient setX2(double x2) {
		this.x2 = x2;
		return this;
	}

	@JsOverlay
	public final double getY1() {
		return y1;
	}

	@JsOverlay
	public final LinearGradient setY1(double y1) {
		this.y1 = y1;
		return this;
	}

	@JsOverlay
	public final double getY2() {
		return y2;
	}

	@JsOverlay
	public final LinearGradient setY2(double y2) {
		this.y2 = y2;
		return this;
	}
}
