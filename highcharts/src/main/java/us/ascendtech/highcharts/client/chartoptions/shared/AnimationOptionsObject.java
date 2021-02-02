package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Complete;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Step;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnimationOptionsObject {

	@JsProperty
	private Complete complete;
	@JsProperty
	private Double defer;
	@JsProperty
	private Double duration;
	@JsProperty
	private String easing;
	@JsProperty
	private Step step;

	@JsOverlay
	public final Complete getComplete() {
		return complete;
	}

	@JsOverlay
	public final void setComplete(Complete complete) {
		this.complete = complete;
	}

	@JsOverlay
	public final Double getDefer() {
		return defer;
	}

	@JsOverlay
	public final void setDefer(Double defer) {
		this.defer = defer;
	}

	@JsOverlay
	public final Double getDuration() {
		return duration;
	}

	@JsOverlay
	public final void setDuration(Double duration) {
		this.duration = duration;
	}

	@JsOverlay
	public final String getEasing() {
		return easing;
	}

	@JsOverlay
	public final void setEasing(String easing) {
		this.easing = easing;
	}

	@JsOverlay
	public final Step getStep() {
		return step;
	}

	@JsOverlay
	public final void setStep(Step step) {
		this.step = step;
	}
}
