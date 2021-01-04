package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Animation {

	@JsProperty
	private double defer;
	@JsProperty
	private double duration;

	@JsOverlay
	public final double getDefer() {
		return defer;
	}

	@JsOverlay
	public final Animation setDefer(double defer) {
		this.defer = defer;
		return this;
	}

	@JsOverlay
	public final double getDuration() {
		return duration;
	}

	@JsOverlay
	public final Animation setDuration(double duration) {
		this.duration = duration;
		return this;
	}
}
