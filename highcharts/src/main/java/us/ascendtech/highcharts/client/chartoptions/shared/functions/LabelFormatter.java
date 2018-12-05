package us.ascendtech.highcharts.client.chartoptions.shared.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.series.Series;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;

@JsFunction
public interface LabelFormatter {
	String getFormatter(Series series, SeriesPoint point);
}