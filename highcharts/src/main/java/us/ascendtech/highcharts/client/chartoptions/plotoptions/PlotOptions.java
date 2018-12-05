package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.types.*;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.types.gauge.Gauge;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.types.wordcloud.WordCloud;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.types.xrange.XRange;
import us.ascendtech.highcharts.client.chartoptions.series.Series;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PlotOptions {

	@JsProperty
	private Area area;
	@JsProperty
	private AreaRange arearange;
	@JsProperty
	private AreaSpline areaspline;
	@JsProperty
	private AreaSplineRange areasplinerange;
	@JsProperty
	private Bar bar;
	@JsProperty
	private BellCurve bellCurve;
	@JsProperty
	private BoxPlot boxplot;
	@JsProperty
	private Bubble bubble;
	@JsProperty
	private Bullet bullet;
	@JsProperty
	private Column column;
	@JsProperty
	private ColumnRange columnrange;
	@JsProperty
	private ErrorBar errorbar;
	@JsProperty
	private Funnel funnel;
	@JsProperty
	private Gauge gauge;
	@JsProperty
	private HeatMap heatmap;
	@JsProperty
	private Histogram histogram;
	@JsProperty
	private Line line;
	@JsProperty
	private Pareto pareto;
	@JsProperty
	private Pie pie;
	@JsProperty
	private Polygon polygon;
	@JsProperty
	private Pyramid pyramid;
	@JsProperty
	private Sankey sankey;
	@JsProperty
	private Scatter scatter;
	@JsProperty
	private Scatter3d scatter3d;
	@JsProperty
	private Series series;
	@JsProperty
	private SolidGauge solidgauge;
	@JsProperty
	private Spline spline;
	@JsProperty
	private StreamGraph streamgraph;
	@JsProperty
	private Sunburst sunburst;
	@JsProperty
	private TileMap tilemap;
	@JsProperty
	private TreeMap treemap;
	@JsProperty
	private VariablePie variablepie;
	@JsProperty
	private VariWide variwide;
	@JsProperty
	private Vector vector;
	@JsProperty
	private WaterFall waterfall;
	@JsProperty
	private WindBarb windbarb;
	@JsProperty
	private WordCloud wordcloud;
	@JsProperty
	private XRange xrange;

	@JsOverlay
	public final Area getArea() {
		return area;
	}

	@JsOverlay
	public final PlotOptions setArea(Area area) {
		this.area = area;
		return this;
	}

	@JsOverlay
	public final AreaRange getArearange() {
		return arearange;
	}

	@JsOverlay
	public final PlotOptions setArearange(AreaRange arearange) {
		this.arearange = arearange;
		return this;
	}

	@JsOverlay
	public final AreaSpline getAreaspline() {
		return areaspline;
	}

	@JsOverlay
	public final PlotOptions setAreaspline(AreaSpline areaspline) {
		this.areaspline = areaspline;
		return this;
	}

	@JsOverlay
	public final AreaSplineRange getAreasplinerange() {
		return areasplinerange;
	}

	@JsOverlay
	public final PlotOptions setAreasplinerange(AreaSplineRange areasplinerange) {
		this.areasplinerange = areasplinerange;
		return this;
	}

	@JsOverlay
	public final Bar getBar() {
		return bar;
	}

	@JsOverlay
	public final PlotOptions setBar(Bar bar) {
		this.bar = bar;
		return this;
	}

	@JsOverlay
	public final BellCurve getBellCurve() {
		return bellCurve;
	}

	@JsOverlay
	public final PlotOptions setBellCurve(BellCurve bellCurve) {
		this.bellCurve = bellCurve;
		return this;
	}

	@JsOverlay
	public final BoxPlot getBoxplot() {
		return boxplot;
	}

	@JsOverlay
	public final PlotOptions setBoxplot(BoxPlot boxplot) {
		this.boxplot = boxplot;
		return this;
	}

	@JsOverlay
	public final Bubble getBubble() {
		return bubble;
	}

	@JsOverlay
	public final PlotOptions setBubble(Bubble bubble) {
		this.bubble = bubble;
		return this;
	}

	@JsOverlay
	public final Bullet getBullet() {
		return bullet;
	}

	@JsOverlay
	public final PlotOptions setBullet(Bullet bullet) {
		this.bullet = bullet;
		return this;
	}

	@JsOverlay
	public final Column getColumn() {
		return column;
	}

	@JsOverlay
	public final PlotOptions setColumn(Column column) {
		this.column = column;
		return this;
	}

	@JsOverlay
	public final ColumnRange getColumnrange() {
		return columnrange;
	}

	@JsOverlay
	public final PlotOptions setColumnrange(ColumnRange columnrange) {
		this.columnrange = columnrange;
		return this;
	}

	@JsOverlay
	public final ErrorBar getErrorbar() {
		return errorbar;
	}

	@JsOverlay
	public final PlotOptions setErrorbar(ErrorBar errorbar) {
		this.errorbar = errorbar;
		return this;
	}

	@JsOverlay
	public final Funnel getFunnel() {
		return funnel;
	}

	@JsOverlay
	public final PlotOptions setFunnel(Funnel funnel) {
		this.funnel = funnel;
		return this;
	}

	@JsOverlay
	public final Gauge getGauge() {
		return gauge;
	}

	@JsOverlay
	public final PlotOptions setGauge(Gauge gauge) {
		this.gauge = gauge;
		return this;
	}

	@JsOverlay
	public final HeatMap getHeatmap() {
		return heatmap;
	}

	@JsOverlay
	public final PlotOptions setHeatmap(HeatMap heatmap) {
		this.heatmap = heatmap;
		return this;
	}

	@JsOverlay
	public final Histogram getHistogram() {
		return histogram;
	}

	@JsOverlay
	public final PlotOptions setHistogram(Histogram histogram) {
		this.histogram = histogram;
		return this;
	}

	@JsOverlay
	public final Line getLine() {
		return line;
	}

	@JsOverlay
	public final PlotOptions setLine(Line line) {
		this.line = line;
		return this;
	}

	@JsOverlay
	public final Pareto getPareto() {
		return pareto;
	}

	@JsOverlay
	public final PlotOptions setPareto(Pareto pareto) {
		this.pareto = pareto;
		return this;
	}

	@JsOverlay
	public final Pie getPie() {
		return pie;
	}

	@JsOverlay
	public final PlotOptions setPie(Pie pie) {
		this.pie = pie;
		return this;
	}

	@JsOverlay
	public final Polygon getPolygon() {
		return polygon;
	}

	@JsOverlay
	public final PlotOptions setPolygon(Polygon polygon) {
		this.polygon = polygon;
		return this;
	}

	@JsOverlay
	public final Pyramid getPyramid() {
		return pyramid;
	}

	@JsOverlay
	public final PlotOptions setPyramid(Pyramid pyramid) {
		this.pyramid = pyramid;
		return this;
	}

	@JsOverlay
	public final Sankey getSankey() {
		return sankey;
	}

	@JsOverlay
	public final PlotOptions setSankey(Sankey sankey) {
		this.sankey = sankey;
		return this;
	}

	@JsOverlay
	public final Scatter getScatter() {
		return scatter;
	}

	@JsOverlay
	public final PlotOptions setScatter(Scatter scatter) {
		this.scatter = scatter;
		return this;
	}

	@JsOverlay
	public final Scatter3d getScatter3d() {
		return scatter3d;
	}

	@JsOverlay
	public final PlotOptions setScatter3d(Scatter3d scatter3d) {
		this.scatter3d = scatter3d;
		return this;
	}

	@JsOverlay
	public final Series getSeries() {
		return series;
	}

	@JsOverlay
	public final PlotOptions setSeries(Series series) {
		this.series = series;
		return this;
	}

	@JsOverlay
	public final SolidGauge getSolidgauge() {
		return solidgauge;
	}

	@JsOverlay
	public final PlotOptions setSolidgauge(SolidGauge solidgauge) {
		this.solidgauge = solidgauge;
		return this;
	}

	@JsOverlay
	public final Spline getSpline() {
		return spline;
	}

	@JsOverlay
	public final PlotOptions setSpline(Spline spline) {
		this.spline = spline;
		return this;
	}

	@JsOverlay
	public final StreamGraph getStreamgraph() {
		return streamgraph;
	}

	@JsOverlay
	public final PlotOptions setStreamgraph(StreamGraph streamgraph) {
		this.streamgraph = streamgraph;
		return this;
	}

	@JsOverlay
	public final Sunburst getSunburst() {
		return sunburst;
	}

	@JsOverlay
	public final PlotOptions setSunburst(Sunburst sunburst) {
		this.sunburst = sunburst;
		return this;
	}

	@JsOverlay
	public final TileMap getTilemap() {
		return tilemap;
	}

	@JsOverlay
	public final PlotOptions setTilemap(TileMap tilemap) {
		this.tilemap = tilemap;
		return this;
	}

	@JsOverlay
	public final TreeMap getTreemap() {
		return treemap;
	}

	@JsOverlay
	public final PlotOptions setTreemap(TreeMap treemap) {
		this.treemap = treemap;
		return this;
	}

	@JsOverlay
	public final VariablePie getVariablepie() {
		return variablepie;
	}

	@JsOverlay
	public final PlotOptions setVariablepie(VariablePie variablepie) {
		this.variablepie = variablepie;
		return this;
	}

	@JsOverlay
	public final VariWide getVariwide() {
		return variwide;
	}

	@JsOverlay
	public final PlotOptions setVariwide(VariWide variwide) {
		this.variwide = variwide;
		return this;
	}

	@JsOverlay
	public final Vector getVector() {
		return vector;
	}

	@JsOverlay
	public final PlotOptions setVector(Vector vector) {
		this.vector = vector;
		return this;
	}

	@JsOverlay
	public final WaterFall getWaterfall() {
		return waterfall;
	}

	@JsOverlay
	public final PlotOptions setWaterfall(WaterFall waterfall) {
		this.waterfall = waterfall;
		return this;
	}

	@JsOverlay
	public final WindBarb getWindbarb() {
		return windbarb;
	}

	@JsOverlay
	public final PlotOptions setWindbarb(WindBarb windbarb) {
		this.windbarb = windbarb;
		return this;
	}

	@JsOverlay
	public final WordCloud getWordcloud() {
		return wordcloud;
	}

	@JsOverlay
	public final PlotOptions setWordcloud(WordCloud wordcloud) {
		this.wordcloud = wordcloud;
		return this;
	}

	@JsOverlay
	public final XRange getXrange() {
		return xrange;
	}

	@JsOverlay
	public final PlotOptions setXrange(XRange xrange) {
		this.xrange = xrange;
		return this;
	}
}
