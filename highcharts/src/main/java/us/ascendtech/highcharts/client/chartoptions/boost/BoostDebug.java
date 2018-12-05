package us.ascendtech.highcharts.client.chartoptions.boost;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class BoostDebug {

	@JsProperty
	private Boolean showSkipSummary;
	@JsProperty
	private Boolean timeBufferCopy;
	@JsProperty
	private Boolean timeKDTree;
	@JsProperty
	private Boolean timeRendering;
	@JsProperty
	private Boolean timeSeriesProcessing;
	@JsProperty
	private Boolean timeSetup;

	@JsOverlay
	public final Boolean getShowSkipSummary() {
		return showSkipSummary;
	}

	@JsOverlay
	public final BoostDebug setShowSkipSummary(Boolean showSkipSummary) {
		this.showSkipSummary = showSkipSummary;
		return this;
	}

	@JsOverlay
	public final Boolean getTimeBufferCopy() {
		return timeBufferCopy;
	}

	@JsOverlay
	public final BoostDebug setTimeBufferCopy(Boolean timeBufferCopy) {
		this.timeBufferCopy = timeBufferCopy;
		return this;
	}

	@JsOverlay
	public final Boolean getTimeKDTree() {
		return timeKDTree;
	}

	@JsOverlay
	public final BoostDebug setTimeKDTree(Boolean timeKDTree) {
		this.timeKDTree = timeKDTree;
		return this;
	}

	@JsOverlay
	public final Boolean getTimeRendering() {
		return timeRendering;
	}

	@JsOverlay
	public final BoostDebug setTimeRendering(Boolean timeRendering) {
		this.timeRendering = timeRendering;
		return this;
	}

	@JsOverlay
	public final Boolean getTimeSeriesProcessing() {
		return timeSeriesProcessing;
	}

	@JsOverlay
	public final BoostDebug setTimeSeriesProcessing(Boolean timeSeriesProcessing) {
		this.timeSeriesProcessing = timeSeriesProcessing;
		return this;
	}

	@JsOverlay
	public final Boolean getTimeSetup() {
		return timeSetup;
	}

	@JsOverlay
	public final BoostDebug setTimeSetup(Boolean timeSetup) {
		this.timeSetup = timeSetup;
		return this;
	}
}
