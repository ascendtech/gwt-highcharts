package us.ascendtech.highcharts.client.chartoptions.series.states;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesStates {

	@JsProperty
	private SeriesStatesHover hover;
	@JsProperty
	private SeriesStatesSelect select;
	@JsProperty
	private SeriesStatesNormal normal;

	@JsOverlay
	public final SeriesStatesHover getHover() {
		return hover;
	}

	@JsOverlay
	public final SeriesStates setHover(SeriesStatesHover hover) {
		this.hover = hover;
		return this;
	}

	@JsOverlay
	public final SeriesStatesSelect getSelect() {
		return select;
	}

	@JsOverlay
	public final SeriesStates setSelect(SeriesStatesSelect select) {
		this.select = select;
		return this;
	}

	@JsOverlay
	public final SeriesStatesNormal getNormal() {
		return normal;
	}

	@JsOverlay
	public final SeriesStates setNormal(SeriesStatesNormal normal) {
		this.normal = normal;
		return this;
	}
}
