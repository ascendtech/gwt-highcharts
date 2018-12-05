package us.ascendtech.highcharts.client.chartoptions.shared;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class BackgroundColor {

	@JsProperty
	private LinearGradient linearGradient;
	@JsProperty
	private JsArray<JsArray<String>> stops;

	@JsOverlay
	public final LinearGradient getLinearGradient() {
		return linearGradient;
	}

	@JsOverlay
	public final BackgroundColor setLinearGradient(LinearGradient linearGradient) {
		this.linearGradient = linearGradient;
		return this;
	}

	@JsOverlay
	public final JsArray<JsArray<String>> getStops() {
		return stops;
	}

	@JsOverlay
	public final BackgroundColor setStops(JsArray<JsArray<String>> stops) {
		this.stops = stops;
		return this;
	}
}
