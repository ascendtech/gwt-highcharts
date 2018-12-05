package us.ascendtech.highcharts.client.chartoptions.axis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.AfterBreaks;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.AfterSetExtremes;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.PointBreak;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.PointInBreak;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.SetExtremes;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisEvents {

	@JsProperty
	private AfterBreaks afterBreaks;

	@JsProperty
	private AfterSetExtremes afterSetExtremes;

	@JsProperty
	private PointBreak pointBreak;

	@JsProperty
	private PointInBreak pointInBreak;

	@JsProperty
	private SetExtremes setExtremes;

	@JsOverlay
	public final AfterBreaks getAfterBreaks() {
		return afterBreaks;
	}

	@JsOverlay
	public final void setAfterBreaks(AfterBreaks afterBreaks) {
		this.afterBreaks = afterBreaks;
	}

	@JsOverlay
	public final AfterSetExtremes getAfterSetExtremes() {
		return afterSetExtremes;
	}

	@JsOverlay
	public final void setAfterSetExtremes(AfterSetExtremes afterSetExtremes) {
		this.afterSetExtremes = afterSetExtremes;
	}

	@JsOverlay
	public final PointBreak getPointBreak() {
		return pointBreak;
	}

	@JsOverlay
	public final void setPointBreak(PointBreak pointBreak) {
		this.pointBreak = pointBreak;
	}

	@JsOverlay
	public final PointInBreak getPointInBreak() {
		return pointInBreak;
	}

	@JsOverlay
	public final void setPointInBreak(PointInBreak pointInBreak) {
		this.pointInBreak = pointInBreak;
	}

	@JsOverlay
	public final SetExtremes getSetExtremes() {
		return setExtremes;
	}

	@JsOverlay
	public final void setSetExtremes(SetExtremes setExtremes) {
		this.setExtremes = setExtremes;
	}
}
