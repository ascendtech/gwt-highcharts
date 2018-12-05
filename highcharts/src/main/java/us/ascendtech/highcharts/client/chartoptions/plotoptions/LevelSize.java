package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LevelSize {

	@JsProperty
	private String unit;
	@JsProperty
	private double value;

	@JsOverlay
	public final String getUnit() {
		return unit;
	}

	@JsOverlay
	public final LevelSize setUnit(String unit) {
		this.unit = unit;
		return this;
	}

	@JsOverlay
	public final double getValue() {
		return value;
	}

	@JsOverlay
	public final LevelSize setValue(double value) {
		this.value = value;
		return this;
	}
}
