package us.ascendtech.highcharts.client;

import elemental2.core.JsArray;
import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import us.ascendtech.highcharts.client.chartoptions.shared.FontMetricsObject;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SVGRenderer {

	@JsProperty
	private Element box;
	@JsProperty
	private Element boxWrapper;
	@JsProperty
	private Element defs;
	@JsProperty
	private Element Element;
	@JsProperty
	private JsArray<Object> escapes;
	@JsProperty
	private SymbolDictionary symbols;

	public native SVGElement arc(Object... props);

	public native SVGElement button(Object... props);

	public native SVGElement circle(double x, double y, double r);

	public native SVGElement clipRect(double x, double y, double width, double height);

	public native SVGElement createElement(String nodeName);

	public native JsArray<String> crispLine(JsArray<Object> points, double width, String roundingFunction);

	public native SVGElement definition(Object... props);

	public native void destroy();

	public native void draw();

	public native FontMetricsObject fontMetrics(Object... props);

	public native SVGElement g(Object... props);

	public native String getContrast(Object... props);

	public native SVGElement image(Object... props);

	public native void init(Element container, Double width, Double height, Object... props);

	public native boolean isHidden();

	public native SVGElement label(Object... props);

	public native SVGElement path(Object... props);

	public native SVGElement rect(double x, double y, double width, double height, double r, double strokeWidth);

	public native void setSize(Double width, Double height, boolean animate);

	public native void setStyle(JsPropertyMap<Object> style);

	public native void symbol(Object... props);

	public native SVGElement text(String text, double x, double y, boolean useHTML);

	@JsOverlay
	public final Element getBox() {
		return box;
	}

	@JsOverlay
	public final SVGRenderer setBox(Element box) {
		this.box = box;
		return this;
	}

	@JsOverlay
	public final Element getBoxWrapper() {
		return boxWrapper;
	}

	@JsOverlay
	public final SVGRenderer setBoxWrapper(Element boxWrapper) {
		this.boxWrapper = boxWrapper;
		return this;
	}

	@JsOverlay
	public final Element getDefs() {
		return defs;
	}

	@JsOverlay
	public final SVGRenderer setDefs(Element defs) {
		this.defs = defs;
		return this;
	}

	@JsOverlay
	public final Element getElement() {
		return Element;
	}

	@JsOverlay
	public final SVGRenderer setElement(Element element) {
		Element = element;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getEscapes() {
		return escapes;
	}

	@JsOverlay
	public final SVGRenderer setEscapes(JsArray<Object> escapes) {
		this.escapes = escapes;
		return this;
	}

	@JsOverlay
	public final SymbolDictionary getSymbols() {
		return symbols;
	}

	@JsOverlay
	public final SVGRenderer setSymbols(SymbolDictionary symbols) {
		this.symbols = symbols;
		return this;
	}

}
