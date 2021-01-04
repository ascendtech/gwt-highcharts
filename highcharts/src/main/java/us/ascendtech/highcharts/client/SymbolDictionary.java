package us.ascendtech.highcharts.client;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SymbolDictionary {

	@JsProperty
	private Arc arc;
	@JsProperty
	private Callout callout;
	@JsProperty
	private Circle circle;
	@JsProperty
	private Diamond diamond;
	@JsProperty
	private Square square;
	@JsProperty
	private Triangle triangle;

	@JsFunction
	private interface Arc {
		void arc();
	}

	@JsFunction
	private interface Callout {
		void callout();
	}

	@JsFunction
	private interface Circle {
		void circle();
	}

	@JsFunction
	private interface Diamond {
		void diamond();
	}

	@JsFunction
	private interface Square {
		void square();
	}

	@JsFunction
	private interface Triangle {
		void traingle();
	}

	@JsOverlay
	public final Arc getArc() {
		return arc;
	}

	@JsOverlay
	public final SymbolDictionary setArc(Arc arc) {
		this.arc = arc;
		return this;
	}

	@JsOverlay
	public final Callout getCallout() {
		return callout;
	}

	@JsOverlay
	public final SymbolDictionary setCallout(Callout callout) {
		this.callout = callout;
		return this;
	}

	@JsOverlay
	public final Circle getCircle() {
		return circle;
	}

	@JsOverlay
	public final SymbolDictionary setCircle(Circle circle) {
		this.circle = circle;
		return this;
	}

	@JsOverlay
	public final Diamond getDiamond() {
		return diamond;
	}

	@JsOverlay
	public final SymbolDictionary setDiamond(Diamond diamond) {
		this.diamond = diamond;
		return this;
	}

	@JsOverlay
	public final Square getSquare() {
		return square;
	}

	@JsOverlay
	public final SymbolDictionary setSquare(Square square) {
		this.square = square;
		return this;
	}

	@JsOverlay
	public final Triangle getTriangle() {
		return triangle;
	}

	@JsOverlay
	public final SymbolDictionary setTriangle(Triangle triangle) {
		this.triangle = triangle;
		return this;
	}
}
