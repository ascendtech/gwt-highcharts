package us.ascendtech.highcharts.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.Subtitle;
import us.ascendtech.highcharts.client.chartoptions.Title;
import us.ascendtech.highcharts.client.chartoptions.annotations.Annotations;
import us.ascendtech.highcharts.client.chartoptions.axis.Axis;
import us.ascendtech.highcharts.client.chartoptions.caption.Caption;
import us.ascendtech.highcharts.client.chartoptions.chart.functions.OnEnd;
import us.ascendtech.highcharts.client.chartoptions.coloraxis.ColorAxis;
import us.ascendtech.highcharts.client.chartoptions.credits.Credits;
import us.ascendtech.highcharts.client.chartoptions.exporting.Exporting;
import us.ascendtech.highcharts.client.chartoptions.series.Series;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Highcharts")
public class Highcharts {

	private Highcharts() {
	}

	public native static Highcharts chart(String elementId, ChartOptions chartOptions);

	public native void addAnnotation(Annotations annotations);

	public native void addAxis(Axis axis);

	public native void addColorAxis(ColorAxis colorAxis);

	public native void addCredits(Credits credits);

	public native void addSeries(Series series);

	public native void addSeriesAsDrillDown(SeriesPoint point);

	public native void cancelSonify(boolean fadeOut);

	public native void destroy();

	public native void drillUp();

	public native void exportChart(Exporting exporting, ChartOptions chartOptions);

	public native void exportChartLocal(Exporting exporting, ChartOptions chartOptions);

	// TODO: The getter methods need more thought.

	public native void hideLoading();

	public native void init(ChartOptions options);

	public native boolean isInsideChart(Number plotX, Number plotY, boolean inverted);

	public native void pauseSonify(boolean fadeOut);

	public native void redraw();

	public native void reflow();

	public native void removeAnnotation(String id);

	public native void removeAnnotation(Annotations annotations);

	public native void resetSonifyCursor();

	public native void resetSonifyCursorEnd();

	public native void resumeSonify(OnEnd onEnd);

	public native void rewindSonify(OnEnd onEnd);

	public native void setCaption(Caption caption);

	public native void setClassName(String className);

	public native void setSize(Number width, Number height, boolean animation);

	public native void setSonifyCursor(SeriesPoint point);

	public native void setSonifyCursor(JsArray<SeriesPoint> points);

	public native void setSubtitle(Subtitle subtitle);

	public native void setTitle(Title title, Subtitle subtitle, boolean redraw);

	public native void showLoading(String loadingText);

	public native void update(ChartOptions options, boolean redraw, boolean oneToOne, boolean animation);

	public native void zoomOut();
}
