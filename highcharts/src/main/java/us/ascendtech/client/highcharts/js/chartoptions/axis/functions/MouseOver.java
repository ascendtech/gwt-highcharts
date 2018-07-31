package us.ascendtech.client.highcharts.js.chartoptions.axis.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.client.highcharts.js.chartoptions.axis.AxisPlotBand;
import us.ascendtech.client.highcharts.js.chartoptions.axis.AxisPlotLine;

@JsFunction
public interface MouseOver {
	void mouseOver(AxisPlotLine plotLine, AxisPlotBand plotBand);
}
