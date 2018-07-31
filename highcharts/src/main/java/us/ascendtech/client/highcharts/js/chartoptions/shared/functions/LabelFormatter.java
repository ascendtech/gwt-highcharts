package us.ascendtech.client.highcharts.js.chartoptions.shared.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.client.highcharts.js.chartoptions.series.Series;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesPoint;

@JsFunction
public interface LabelFormatter {
	String getFormatter(Series series, SeriesPoint point);
}