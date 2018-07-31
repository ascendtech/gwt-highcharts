package us.ascendtech.client.highcharts.js.chartoptions.series.states;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesStatesNormal {

	@JsProperty
	private Boolean animation;

	@JsOverlay
	public final Boolean getAnimation() {
		return animation;
	}

	@JsOverlay
	public final SeriesStatesNormal setAnimation(Boolean animation) {
		this.animation = animation;
		return this;
	}
}
