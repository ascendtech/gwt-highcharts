package us.ascendtech.client.highcharts.js.chartoptions.shared.functions;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsFunction;
import us.ascendtech.client.highcharts.js.chartoptions.Data;

@JsFunction
public interface OnTableAnchorClick {
	HTMLElement render(Data data);
}