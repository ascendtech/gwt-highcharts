package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Click;
import us.ascendtech.highcharts.client.chartoptions.series.functions.MouseOut;
import us.ascendtech.highcharts.client.chartoptions.series.functions.MouseOver;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Remove;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Select;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Unselect;
import us.ascendtech.highcharts.client.chartoptions.series.functions.Update;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesDataEvents {

	@JsProperty
	private Click click;

	@JsProperty
	private MouseOut mouseOut;

	@JsProperty
	private MouseOver mouseOver;

	@JsProperty
	private Remove remove;

	@JsProperty
	private Select select;

	@JsProperty
	private Unselect unselect;

	@JsProperty
	private Update update;

}
