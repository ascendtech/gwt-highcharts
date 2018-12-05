package us.ascendtech.highcharts.client.chartoptions.chart.functions;

import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.axis.XAxis;
import us.ascendtech.highcharts.client.chartoptions.axis.YAxis;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartClickEvent extends Event {

	public ChartClickEvent(String type) {
		super(type);
	}

	@JsProperty
	public XAxis xAxis;
	@JsProperty
	public YAxis yAxis;

}
