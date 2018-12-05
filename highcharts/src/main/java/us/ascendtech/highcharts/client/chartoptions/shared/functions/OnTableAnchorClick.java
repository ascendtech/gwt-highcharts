package us.ascendtech.highcharts.client.chartoptions.shared.functions;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.Data;

@JsFunction
public interface OnTableAnchorClick {
	HTMLElement render(Data data);
}