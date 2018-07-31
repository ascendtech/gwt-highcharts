package us.ascendtech.client.highcharts.js.chartoptions.series.states;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.Animation;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesStatesSelect {

	@JsProperty
	private Animation animation;
	@JsProperty
	private String borderColor;
	@JsProperty
	private String color;
	@JsProperty
	private Boolean enabled;

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final SeriesStatesSelect setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final SeriesStatesSelect setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesStatesSelect setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final SeriesStatesSelect setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}
}
