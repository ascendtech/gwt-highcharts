package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.wordcloud;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Rotation {

	@JsProperty
	private double from;
	@JsProperty
	private double orientations;
	@JsProperty
	private double to;

	@JsOverlay
	public final double getFrom() {
		return from;
	}

	@JsOverlay
	public final Rotation setFrom(double from) {
		this.from = from;
		return this;
	}

	@JsOverlay
	public final double getOrientations() {
		return orientations;
	}

	@JsOverlay
	public final Rotation setOrientations(double orientations) {
		this.orientations = orientations;
		return this;
	}

	@JsOverlay
	public final double getTo() {
		return to;
	}

	@JsOverlay
	public final Rotation setTo(double to) {
		this.to = to;
		return this;
	}
}
