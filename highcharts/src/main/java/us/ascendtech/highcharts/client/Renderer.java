package us.ascendtech.highcharts.client;

import elemental2.core.JsArray;
import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Renderer {

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

	public native Renderer add();

	public native Renderer arc(Object... props);

	public native Renderer button(Object... props);

	public native Renderer circle(double x, double y, double r);

	public native Renderer clipRect(double x, double y, double width, double height);

	public native Renderer createElement(String nodeName);

	public native Renderer crispLine(JsArray<Object> points, double width, String roundingFunction);

	public native Renderer definition(Object... props);

	public native Renderer destroy();

	public native Renderer draw();

	public native Object fontMetrics(Object... props);

	public native Renderer g(Object... props);

	public native Renderer getContrast(Object... props);

	public native Renderer image(Object... props);

	public native Renderer init(Element container, Double width, Double height, Object... props);

	public native Renderer isHidden();

	public native Renderer label(Object... props);

	public native Renderer path(Object... props);

	public native Renderer rect(double x, double y, double width, double height, double r, double strokeWidth);

	public native Renderer css(JsPropertyMap<Object> css);

	public native Renderer attr(JsPropertyMap<Object> attrs);

	public native Renderer setSize(Double width, Double height, boolean animate);

	public native Renderer setStyle(Object... props);

	public native Renderer symbol(Object... props);

	public native Renderer text(String text, double x, double y, boolean useHTML);

	@JsOverlay
	public final Element getBox() {
		return box;
	}

	@JsOverlay
	public final Renderer setBox(Element box) {
		this.box = box;
		return this;
	}

	@JsOverlay
	public final Element getBoxWrapper() {
		return boxWrapper;
	}

	@JsOverlay
	public final Renderer setBoxWrapper(Element boxWrapper) {
		this.boxWrapper = boxWrapper;
		return this;
	}

	@JsOverlay
	public final Element getDefs() {
		return defs;
	}

	@JsOverlay
	public final Renderer setDefs(Element defs) {
		this.defs = defs;
		return this;
	}

	@JsOverlay
	public final Element getElement() {
		return Element;
	}

	@JsOverlay
	public final Renderer setElement(Element element) {
		Element = element;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getEscapes() {
		return escapes;
	}

	@JsOverlay
	public final Renderer setEscapes(JsArray<Object> escapes) {
		this.escapes = escapes;
		return this;
	}

	@JsOverlay
	public final SymbolDictionary getSymbols() {
		return symbols;
	}

	@JsOverlay
	public final Renderer setSymbols(SymbolDictionary symbols) {
		this.symbols = symbols;
		return this;
	}

}
