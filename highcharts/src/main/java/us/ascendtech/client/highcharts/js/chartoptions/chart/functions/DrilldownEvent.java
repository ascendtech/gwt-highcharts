package us.ascendtech.client.highcharts.js.chartoptions.chart.functions;

import elemental2.core.JsArray;
import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.series.Series;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesPoint;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DrilldownEvent extends Event {

	public DrilldownEvent(String type) {
		super(type);
	}

	@JsProperty
	public String category;
	@JsProperty
	public SeriesPoint point;
	@JsProperty
	public Event originalEvent;
	@JsProperty
	public JsArray<SeriesPoint> points;
	@JsProperty
	public Series seriesOptions;

}
