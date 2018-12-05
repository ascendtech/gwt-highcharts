package us.ascendtech.highcharts.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.Data;
import us.ascendtech.highcharts.client.chartoptions.Subtitle;
import us.ascendtech.highcharts.client.chartoptions.Time;
import us.ascendtech.highcharts.client.chartoptions.Title;
import us.ascendtech.highcharts.client.chartoptions.accessibility.Accessibility;
import us.ascendtech.highcharts.client.chartoptions.annotations.Annotations;
import us.ascendtech.highcharts.client.chartoptions.axis.XAxis;
import us.ascendtech.highcharts.client.chartoptions.axis.YAxis;
import us.ascendtech.highcharts.client.chartoptions.axis.ZAxis;
import us.ascendtech.highcharts.client.chartoptions.boost.Boost;
import us.ascendtech.highcharts.client.chartoptions.chart.Chart;
import us.ascendtech.highcharts.client.chartoptions.coloraxis.ColorAxis;
import us.ascendtech.highcharts.client.chartoptions.credits.Credits;
import us.ascendtech.highcharts.client.chartoptions.drilldown.Drilldown;
import us.ascendtech.highcharts.client.chartoptions.exporting.Exporting;
import us.ascendtech.highcharts.client.chartoptions.labels.Labels;
import us.ascendtech.highcharts.client.chartoptions.legend.Legend;
import us.ascendtech.highcharts.client.chartoptions.loading.Loading;
import us.ascendtech.highcharts.client.chartoptions.navigation.Navigation;
import us.ascendtech.highcharts.client.chartoptions.nodata.NoData;
import us.ascendtech.highcharts.client.chartoptions.pane.Pane;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.PlotOptions;
import us.ascendtech.highcharts.client.chartoptions.responsive.Responsive;
import us.ascendtech.highcharts.client.chartoptions.series.Series;
import us.ascendtech.highcharts.client.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartOptions {

	@JsProperty
	private Accessibility accessibility;
	@JsProperty
	private JsArray<Annotations> annotations;
	@JsProperty
	private Boost boost;
	@JsProperty
	private Chart chart;
	@JsProperty
	private ColorAxis colorAxis;
	@JsProperty
	private JsArray<String> colors;
	@JsProperty
	private Credits credits;
	@JsProperty
	private Data data;
	@JsProperty
	private String defs; // String json maybe!?
	@JsProperty
	private Drilldown drilldown;
	@JsProperty
	private Exporting exporting;
	@JsProperty
	private Labels labels;
	@JsProperty
	private Legend legend;
	@JsProperty
	private Loading loading;
	@JsProperty
	private Navigation navigation;
	@JsProperty
	private NoData noData;
	@JsProperty
	private Pane pane;
	@JsProperty
	private PlotOptions plotOptions;
	@JsProperty
	private Responsive responsive;
	@JsProperty
	private JsArray<Series> series;
	@JsProperty
	private Subtitle subtitle;
	@JsProperty
	private Time time;
	@JsProperty
	private Title title;
	@JsProperty
	private Tooltip tooltip;
	@JsProperty
	private XAxis xAxis;
	@JsProperty
	private YAxis yAxis;
	@JsProperty
	private ZAxis zAxis;

	@JsOverlay
	public final Accessibility getAccessibility() {
		return accessibility;
	}

	@JsOverlay
	public final ChartOptions setAccessibility(Accessibility accessibility) {
		this.accessibility = accessibility;
		return this;
	}

	@JsOverlay
	public final JsArray<Annotations> getAnnotations() {
		return annotations;
	}

	@JsOverlay
	public final ChartOptions setAnnotations(JsArray<Annotations> annotations) {
		this.annotations = annotations;
		return this;
	}

	@JsOverlay
	public final Boost getBoost() {
		return boost;
	}

	@JsOverlay
	public final ChartOptions setBoost(Boost boost) {
		this.boost = boost;
		return this;
	}

	@JsOverlay
	public final Chart getChart() {
		return chart;
	}

	@JsOverlay
	public final ChartOptions setChart(Chart chart) {
		this.chart = chart;
		return this;
	}

	@JsOverlay
	public final ColorAxis getColorAxis() {
		return colorAxis;
	}

	@JsOverlay
	public final ChartOptions setColorAxis(ColorAxis colorAxis) {
		this.colorAxis = colorAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final ChartOptions setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final Credits getCredits() {
		return credits;
	}

	@JsOverlay
	public final ChartOptions setCredits(Credits credits) {
		this.credits = credits;
		return this;
	}

	@JsOverlay
	public final Data getData() {
		return data;
	}

	@JsOverlay
	public final ChartOptions setData(Data data) {
		this.data = data;
		return this;
	}

	@JsOverlay
	public final String getDefs() {
		return defs;
	}

	@JsOverlay
	public final ChartOptions setDefs(String defs) {
		this.defs = defs;
		return this;
	}

	@JsOverlay
	public final Drilldown getDrilldown() {
		return drilldown;
	}

	@JsOverlay
	public final ChartOptions setDrilldown(Drilldown drilldown) {
		this.drilldown = drilldown;
		return this;
	}

	@JsOverlay
	public final Exporting getExporting() {
		return exporting;
	}

	@JsOverlay
	public final ChartOptions setExporting(Exporting exporting) {
		this.exporting = exporting;
		return this;
	}

	@JsOverlay
	public final Labels getLabels() {
		return labels;
	}

	@JsOverlay
	public final ChartOptions setLabels(Labels labels) {
		this.labels = labels;
		return this;
	}

	@JsOverlay
	public final Legend getLegend() {
		return legend;
	}

	@JsOverlay
	public final ChartOptions setLegend(Legend legend) {
		this.legend = legend;
		return this;
	}

	@JsOverlay
	public final Loading getLoading() {
		return loading;
	}

	@JsOverlay
	public final ChartOptions setLoading(Loading loading) {
		this.loading = loading;
		return this;
	}

	@JsOverlay
	public final Navigation getNavigation() {
		return navigation;
	}

	@JsOverlay
	public final ChartOptions setNavigation(Navigation navigation) {
		this.navigation = navigation;
		return this;
	}

	@JsOverlay
	public final NoData getNoData() {
		return noData;
	}

	@JsOverlay
	public final ChartOptions setNoData(NoData noData) {
		this.noData = noData;
		return this;
	}

	@JsOverlay
	public final Pane getPane() {
		return pane;
	}

	@JsOverlay
	public final ChartOptions setPane(Pane pane) {
		this.pane = pane;
		return this;
	}

	@JsOverlay
	public final PlotOptions getPlotOptions() {
		return plotOptions;
	}

	@JsOverlay
	public final ChartOptions setPlotOptions(PlotOptions plotOptions) {
		this.plotOptions = plotOptions;
		return this;
	}

	@JsOverlay
	public final Responsive getResponsive() {
		return responsive;
	}

	@JsOverlay
	public final ChartOptions setResponsive(Responsive responsive) {
		this.responsive = responsive;
		return this;
	}

	@JsOverlay
	public final JsArray<Series> getSeries() {
		return series;
	}

	@JsOverlay
	public final ChartOptions setSeries(JsArray<Series> series) {
		this.series = series;
		return this;
	}

	@JsOverlay
	public final Subtitle getSubtitle() {
		return subtitle;
	}

	@JsOverlay
	public final ChartOptions setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
		return this;
	}

	@JsOverlay
	public final Time getTime() {
		return time;
	}

	@JsOverlay
	public final ChartOptions setTime(Time time) {
		this.time = time;
		return this;
	}

	@JsOverlay
	public final Title getTitle() {
		return title;
	}

	@JsOverlay
	public final ChartOptions setTitle(Title title) {
		this.title = title;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final ChartOptions setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final XAxis getxAxis() {
		return xAxis;
	}

	@JsOverlay
	public final ChartOptions setxAxis(XAxis xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	@JsOverlay
	public final YAxis getyAxis() {
		return yAxis;
	}

	@JsOverlay
	public final ChartOptions setyAxis(YAxis yAxis) {
		this.yAxis = yAxis;
		return this;
	}

	@JsOverlay
	public final ZAxis getzAxis() {
		return zAxis;
	}

	@JsOverlay
	public final ChartOptions setzAxis(ZAxis zAxis) {
		this.zAxis = zAxis;
		return this;
	}
}
