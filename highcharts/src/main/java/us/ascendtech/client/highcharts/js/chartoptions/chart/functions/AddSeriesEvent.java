package us.ascendtech.client.highcharts.js.chartoptions.chart.functions;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.series.Series;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AddSeriesEvent {

	@JsProperty
	public Series options;

}
