package us.ascendtech.highcharts.client.chartoptions.axis.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.axis.AxisPlotBand;
import us.ascendtech.highcharts.client.chartoptions.axis.AxisPlotLine;

@JsFunction
public interface MouseOver {
	void mouseOver(AxisPlotLine plotLine, AxisPlotBand plotBand);
}
