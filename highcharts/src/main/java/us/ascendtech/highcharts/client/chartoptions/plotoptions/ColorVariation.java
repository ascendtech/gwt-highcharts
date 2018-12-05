package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ColorVariation {

	@JsProperty
	private String key;
	@JsProperty
	private double to;

	@JsOverlay
	public final String getKey() {
		return key;
	}

	@JsOverlay
	public final ColorVariation setKey(String key) {
		this.key = key;
		return this;
	}

	@JsOverlay
	public final double getTo() {
		return to;
	}

	@JsOverlay
	public final ColorVariation setTo(double to) {
		this.to = to;
		return this;
	}
}
