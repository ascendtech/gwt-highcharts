package us.ascendtech.client.highcharts.js.chartoptions.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.AddSeries;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.AfterPrint;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.BeforePrint;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Click;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Drilldown;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Drillup;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Drillupall;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Load;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Redraw;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Render;
import us.ascendtech.client.highcharts.js.chartoptions.chart.functions.Selection;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartEvents {

	@JsProperty
	private AddSeries addSeries;

	@JsProperty
	private AfterPrint afterPrint;

	@JsProperty
	private BeforePrint beforePrint;

	@JsProperty
	private Click click;

	@JsProperty
	private Drilldown drilldown;

	@JsProperty
	private Drillup drillup;

	@JsProperty
	private Drillupall drillupall;

	@JsProperty
	private Load load;

	@JsProperty
	private Redraw redraw;

	@JsProperty
	private Render render;

	@JsProperty
	private Selection selection;

	@JsOverlay
	public final AddSeries getAddSeries() {
		return addSeries;
	}

	@JsOverlay
	public final void setAddSeries(AddSeries addSeries) {
		this.addSeries = addSeries;
	}

	@JsOverlay
	public final AfterPrint getAfterPrint() {
		return afterPrint;
	}

	@JsOverlay
	public final void setAfterPrint(AfterPrint afterPrint) {
		this.afterPrint = afterPrint;
	}

	@JsOverlay
	public final BeforePrint getBeforePrint() {
		return beforePrint;
	}

	@JsOverlay
	public final void setBeforePrint(BeforePrint beforePrint) {
		this.beforePrint = beforePrint;
	}

	@JsOverlay
	public final Click getClick() {
		return click;
	}

	@JsOverlay
	public final void setClick(Click click) {
		this.click = click;
	}

	@JsOverlay
	public final Drilldown getDrilldown() {
		return drilldown;
	}

	@JsOverlay
	public final void setDrilldown(Drilldown drilldown) {
		this.drilldown = drilldown;
	}

	@JsOverlay
	public final Drillup getDrillup() {
		return drillup;
	}

	@JsOverlay
	public final void setDrillup(Drillup drillup) {
		this.drillup = drillup;
	}

	@JsOverlay
	public final Drillupall getDrillupall() {
		return drillupall;
	}

	@JsOverlay
	public final void setDrillupall(Drillupall drillupall) {
		this.drillupall = drillupall;
	}

	@JsOverlay
	public final Load getLoad() {
		return load;
	}

	@JsOverlay
	public final void setLoad(Load load) {
		this.load = load;
	}

	@JsOverlay
	public final Redraw getRedraw() {
		return redraw;
	}

	@JsOverlay
	public final void setRedraw(Redraw redraw) {
		this.redraw = redraw;
	}

	@JsOverlay
	public final Render getRender() {
		return render;
	}

	@JsOverlay
	public final void setRender(Render render) {
		this.render = render;
	}

	@JsOverlay
	public final Selection getSelection() {
		return selection;
	}

	@JsOverlay
	public final void setSelection(Selection selection) {
		this.selection = selection;
	}
}
