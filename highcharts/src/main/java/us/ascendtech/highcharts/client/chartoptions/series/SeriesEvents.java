package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.functions.AfterAnimate;
import us.ascendtech.highcharts.client.chartoptions.series.functions.CheckboxClick;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Click;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Hide;
import us.ascendtech.highcharts.client.chartoptions.series.functions.LegendItemClick;
import us.ascendtech.highcharts.client.chartoptions.series.functions.MouseOut;
import us.ascendtech.highcharts.client.chartoptions.series.functions.MouseOver;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Show;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesEvents {

	@JsProperty
	private AfterAnimate afterAnimate;

	@JsProperty
	private CheckboxClick checkboxClick;

	@JsProperty
	private Click click;

	@JsProperty
	private Hide hide;

	@JsProperty
	private LegendItemClick legendItemClick;

	@JsProperty
	private MouseOut mouseOut;

	@JsProperty
	private MouseOver mouseOver;

	@JsProperty
	private Show show;

	@JsOverlay
	public final AfterAnimate getAfterAnimate() {
		return afterAnimate;
	}

	@JsOverlay
	public final SeriesEvents setAfterAnimate(AfterAnimate afterAnimate) {
		this.afterAnimate = afterAnimate;
		return this;
	}

	@JsOverlay
	public final CheckboxClick getCheckboxClick() {
		return checkboxClick;
	}

	@JsOverlay
	public final SeriesEvents setCheckboxClick(CheckboxClick checkboxClick) {
		this.checkboxClick = checkboxClick;
		return this;
	}

	@JsOverlay
	public final Click getClick() {
		return click;
	}

	@JsOverlay
	public final SeriesEvents setClick(Click click) {
		this.click = click;
		return this;
	}

	@JsOverlay
	public final Hide getHide() {
		return hide;
	}

	@JsOverlay
	public final SeriesEvents setHide(Hide hide) {
		this.hide = hide;
		return this;
	}

	@JsOverlay
	public final LegendItemClick getLegendItemClick() {
		return legendItemClick;
	}

	@JsOverlay
	public final SeriesEvents setLegendItemClick(LegendItemClick legendItemClick) {
		this.legendItemClick = legendItemClick;
		return this;
	}

	@JsOverlay
	public final MouseOut getMouseOut() {
		return mouseOut;
	}

	@JsOverlay
	public final SeriesEvents setMouseOut(MouseOut mouseOut) {
		this.mouseOut = mouseOut;
		return this;
	}

	@JsOverlay
	public final MouseOver getMouseOver() {
		return mouseOver;
	}

	@JsOverlay
	public final SeriesEvents setMouseOver(MouseOver mouseOver) {
		this.mouseOver = mouseOver;
		return this;
	}

	@JsOverlay
	public final Show getShow() {
		return show;
	}

	@JsOverlay
	public final SeriesEvents setShow(Show show) {
		this.show = show;
		return this;
	}
}
