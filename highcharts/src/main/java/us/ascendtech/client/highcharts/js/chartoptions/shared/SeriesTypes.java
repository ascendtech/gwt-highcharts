package us.ascendtech.client.highcharts.js.chartoptions.shared;

public enum SeriesTypes {

	AREA("area"),
	AREA_RANGE("arearange"),
	AREA_SPLINE("areaspline"),
	AREA_SPLINE_RANGE("areasplinerange"),
	BAR("bar"),
	BELL_CURVE("bellcurve"),
	BOX_PLOT("boxplot"),
	BUBBLE("bubble"),
	COLUMN("column"),
	COLUMN_RANGE("columnrange"),
	ERROR_BAR("errorbar"),
	FUNNEL("funnel"),
	GAUGE("gauge"),
	HEATMAP("heatmap"),
	HISTOGRAM("histogram"),
	LINE("line"),
	PARETO("pareto"),
	PIE("pie"),
	POLYGON("polygon"),
	PYRAMID("pyramid"),
	SANKEY("sankey"),
	SCATTER("scatter"),
	SCATTER_3D("scatter3d"),
	SOLID_GAUGE("solidgauge"),
	SPLINE("spline"),
	STREAM_GRAPH("streamgraph"),
	SUNBURST("sunburst"),
	TILEMAP("tilemap"),
	TREEMAP("treemap"),
	VARIABLE_PIE("variablepie"),
	VARIWIDE("variwide"),
	VECTOR("vector"),
	WATERFALL("waterfall"),
	WINDBARB("windbarb"),
	WORDCLOUD("wordcloud"),
	X_RANGE("xrange");

	private final String seriesType;

	SeriesTypes(String seriesType) {
		this.seriesType = seriesType;
	}

	public String getSeriesType() {
		return seriesType;
	}
}
