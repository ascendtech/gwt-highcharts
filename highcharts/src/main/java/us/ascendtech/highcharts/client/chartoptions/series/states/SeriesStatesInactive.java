package us.ascendtech.highcharts.client.chartoptions.series.states;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.Animation;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesStatesInactive {

	@JsProperty
	private Animation animation;
	@JsProperty
	private boolean enabled;
	@JsProperty
	private double opacity;

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final SeriesStatesInactive setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final boolean isEnabled() {
		return enabled;
	}

	@JsOverlay
	public final SeriesStatesInactive setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getOpacity() {
		return opacity;
	}

	@JsOverlay
	public final SeriesStatesInactive setOpacity(double opacity) {
		this.opacity = opacity;
		return this;
	}
}
