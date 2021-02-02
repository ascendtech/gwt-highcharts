package us.ascendtech.highcharts.client;

import elemental2.core.JsArray;
import elemental2.dom.Element;
import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
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
import us.ascendtech.highcharts.client.chartoptions.shared.Style;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.GetJSONSuccessCallback;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Highcharts")
public class Highcharts {

	private Highcharts() {
	}

	@JsProperty
	private JsArray<Series> series;

	@JsProperty
	private SVGRenderer renderer;

	public native static Highcharts chart(String elementId, ChartOptions chartOptions);

	public native static Highcharts mapChart(String elementId, ChartOptions chartOptions);

	public native static SVGRenderer Renderer(Element container, Double width, Double height);

	public native static void addAnnotation(Annotations annotations);

	public native static void addAxis(Axis axis);

	public native static void addColorAxis(ColorAxis colorAxis);

	public native static void addCredits(Credits credits);

	public native void addSeries(Series series);

	public native void addSeriesAsDrillDown(SeriesPoint point);

	public native static void cancelSonify(boolean fadeOut);

	public native static void css(Element el, Style style);

	public native static void destroy();

	public native static void drillUp();

	public native static void exportChart(Exporting exporting, ChartOptions chartOptions);

	public native static void exportChartLocal(Exporting exporting, ChartOptions chartOptions);

	public native static void getJSON(String url, GetJSONSuccessCallback onSuccess);

	public native static Double getMagnitude(Double num);

	public native static void hideLoading();

	public native static void init(ChartOptions options);

	public native static boolean isInsideChart(Number plotX, Number plotY, boolean inverted);

	public native void mapZoom(double howMuch, double centerX, double centerY, double mouseX, double mouseY);

	public native static void pauseSonify(boolean fadeOut);

	public native void redraw(boolean animation);

	public native static void reflow(Event event);

	public native static void removeAnnotation(String id);

	public native static void removeAnnotation(Annotations annotations);

	public native static void resetSonifyCursor();

	public native static void resetSonifyCursorEnd();

	public native static void resumeSonify(OnEnd onEnd);

	public native static void rewindSonify(OnEnd onEnd);

	public native static void setCaption(Caption caption);

	public native static void setClassName(String className);

	public native static void setSize(Number width, Number height, boolean animation);

	public native static void setOptions(Object options);

	public native static Object getOptions();

	public native static void setSonifyCursor(SeriesPoint point);

	public native static void setSonifyCursor(JsArray<SeriesPoint> points);

	public native static void setSubtitle(Subtitle subtitle);

	public native static void setTitle(Title title, Subtitle subtitle, boolean redraw);

	public native static void showLoading(String loadingText);

	public native static void update(ChartOptions options, boolean redraw, boolean oneToOne, boolean animation);

	public native static void zoomOut();

	public native Object get(String id);

	@JsOverlay
	public final JsArray<Series> getSeries() {
		return series;
	}

	@JsOverlay
	public final SVGRenderer getRenderer() {
		return renderer;
	}
}
