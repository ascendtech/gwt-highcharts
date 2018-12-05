package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Theme {

	@JsProperty
	private String fill;
	@JsProperty
	private double padding;
	@JsProperty
	private String stroke;

	@JsOverlay
	public final String getFill() {
		return fill;
	}

	@JsOverlay
	public final Theme setFill(String fill) {
		this.fill = fill;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final Theme setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final String getStroke() {
		return stroke;
	}

	@JsOverlay
	public final Theme setStroke(String stroke) {
		this.stroke = stroke;
		return this;
	}
}
