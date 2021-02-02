package us.ascendtech.highcharts.client.chartoptions.shared.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.ChartOptions;

@JsFunction
public interface Complete {
	void onComplete(ChartOptions chartOptions);
}