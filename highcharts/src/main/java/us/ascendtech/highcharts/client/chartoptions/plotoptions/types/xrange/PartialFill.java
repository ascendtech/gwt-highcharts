package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.xrange;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PartialFill {

	@JsProperty
	private String fill;

	@JsOverlay
	public final String getFill() {
		return fill;
	}

	@JsOverlay
	public final PartialFill setFill(String fill) {
		this.fill = fill;
		return this;
	}
}
