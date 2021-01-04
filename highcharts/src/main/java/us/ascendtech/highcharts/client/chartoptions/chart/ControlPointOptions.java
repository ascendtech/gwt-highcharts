package us.ascendtech.highcharts.client.chartoptions.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Positioner;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ControlPointOptions {

	@JsProperty
	private Positioner positioner;

	@JsOverlay
	public final Positioner getPositioner() {
		return positioner;
	}

	@JsOverlay
	public final ControlPointOptions setPositioner(Positioner positioner) {
		this.positioner = positioner;
		return this;
	}
}
