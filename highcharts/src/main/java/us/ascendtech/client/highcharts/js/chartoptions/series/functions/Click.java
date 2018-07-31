package us.ascendtech.client.highcharts.js.chartoptions.series.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesPointEvents;

@JsFunction
public interface Click {
	void click(SeriesPointEvents event);
}
