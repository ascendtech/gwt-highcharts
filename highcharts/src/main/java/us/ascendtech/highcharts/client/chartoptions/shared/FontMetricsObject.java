package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class FontMetricsObject {

	@JsProperty
	private Double b;
	@JsProperty
	private Double f;
	@JsProperty
	private Double h;

	@JsOverlay
	public final Double getB() {
		return b;
	}

	@JsOverlay
	public final void setB(Double b) {
		this.b = b;
	}

	@JsOverlay
	public final Double getF() {
		return f;
	}

	@JsOverlay
	public final void setF(Double f) {
		this.f = f;
	}

	@JsOverlay
	public final Double getH() {
		return h;
	}

	@JsOverlay
	public final void setH(Double h) {
		this.h = h;
	}
}
