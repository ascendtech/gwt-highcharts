package us.ascendtech.client.highcharts.js.chartoptions.shared.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesPoint;

@JsFunction
public interface Positioner {

	void positioner(double labelWidth, double labelHeight, SeriesPoint point);

}
