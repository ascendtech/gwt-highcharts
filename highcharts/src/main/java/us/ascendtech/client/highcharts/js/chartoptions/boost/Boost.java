package us.ascendtech.client.highcharts.js.chartoptions.boost;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/boost
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Boost {

	@JsProperty
	private Boolean allowForce;
	@JsProperty
	private BoostDebug debug;
	@JsProperty
	private boolean enabled;
	@JsProperty
	private double seriesThreshold;
	@JsProperty
	private Boolean useGPUTranslations;

	@JsOverlay
	public final Boolean getAllowForce() {
		return allowForce;
	}

	@JsOverlay
	public final Boost setAllowForce(Boolean allowForce) {
		this.allowForce = allowForce;
		return this;
	}

	@JsOverlay
	public final BoostDebug getDebug() {
		return debug;
	}

	@JsOverlay
	public final Boost setDebug(BoostDebug debug) {
		this.debug = debug;
		return this;
	}

	@JsOverlay
	public final boolean isEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Boost setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getSeriesThreshold() {
		return seriesThreshold;
	}

	@JsOverlay
	public final Boost setSeriesThreshold(double seriesThreshold) {
		this.seriesThreshold = seriesThreshold;
		return this;
	}

	@JsOverlay
	public final Boolean getUseGPUTranslations() {
		return useGPUTranslations;
	}

	@JsOverlay
	public final Boost setUseGPUTranslations(Boolean useGPUTranslations) {
		this.useGPUTranslations = useGPUTranslations;
		return this;
	}
}
