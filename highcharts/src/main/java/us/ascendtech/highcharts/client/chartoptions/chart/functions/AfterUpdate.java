package us.ascendtech.highcharts.client.chartoptions.chart.functions;

import elemental2.dom.Event;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface AfterUpdate {
	void afterUpdate(Event event);
}
