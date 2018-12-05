package us.ascendtech.highcharts.client.chartoptions.coloraxis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ColorAxisDataClass {

	@JsProperty
	private String color;
	@JsProperty
	private double from;
	@JsProperty
	private String name;
	@JsProperty
	private double to;

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final ColorAxisDataClass setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getFrom() {
		return from;
	}

	@JsOverlay
	public final ColorAxisDataClass setFrom(double from) {
		this.from = from;
		return this;
	}

	@JsOverlay
	public final String getName() {
		return name;
	}

	@JsOverlay
	public final ColorAxisDataClass setName(String name) {
		this.name = name;
		return this;
	}

	@JsOverlay
	public final double getTo() {
		return to;
	}

	@JsOverlay
	public final ColorAxisDataClass setTo(double to) {
		this.to = to;
		return this;
	}
}
