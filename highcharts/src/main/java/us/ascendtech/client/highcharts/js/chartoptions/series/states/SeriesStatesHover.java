package us.ascendtech.client.highcharts.js.chartoptions.series.states;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.Animation;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesStatesHover {

	@JsProperty
	private Animation animation;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double brightness;
	@JsProperty
	private String color;
	@JsProperty
	private Boolean enabled;

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final SeriesStatesHover setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final SeriesStatesHover setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBrightness() {
		return brightness;
	}

	@JsOverlay
	public final SeriesStatesHover setBrightness(double brightness) {
		this.brightness = brightness;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesStatesHover setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final SeriesStatesHover setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}
}
