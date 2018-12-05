package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Style {

	@JsProperty
	private String background;
	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String border;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private String color;
	@JsProperty
	private String cursor;
	@JsProperty
	private String fontSize;
	@JsProperty
	private String fontWeight;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private double opacity;
	@JsProperty
	private String padding;
	@JsProperty
	private String position;
	@JsProperty
	private String textAlign;
	@JsProperty
	private String textDecoration;
	@JsProperty
	private String textOutline;
	@JsProperty
	private String top;
	@JsProperty
	private String transition;

	@JsOverlay
	public final String getBackground() {
		return background;
	}

	@JsOverlay
	public final Style setBackground(String background) {
		this.background = background;
		return this;
	}

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final Style setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorder() {
		return border;
	}

	@JsOverlay
	public final Style setBorder(String border) {
		this.border = border;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Style setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Style setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Style setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final String getFontSize() {
		return fontSize;
	}

	@JsOverlay
	public final Style setFontSize(String fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	@JsOverlay
	public final String getFontWeight() {
		return fontWeight;
	}

	@JsOverlay
	public final Style setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final Style setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final double getOpacity() {
		return opacity;
	}

	@JsOverlay
	public final Style setOpacity(double opacity) {
		this.opacity = opacity;
		return this;
	}

	@JsOverlay
	public final String getPadding() {
		return padding;
	}

	@JsOverlay
	public final Style setPadding(String padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final String getPosition() {
		return position;
	}

	@JsOverlay
	public final Style setPosition(String position) {
		this.position = position;
		return this;
	}

	@JsOverlay
	public final String getTextAlign() {
		return textAlign;
	}

	@JsOverlay
	public final Style setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		return this;
	}

	@JsOverlay
	public final String getTextDecoration() {
		return textDecoration;
	}

	@JsOverlay
	public final Style setTextDecoration(String textDecoration) {
		this.textDecoration = textDecoration;
		return this;
	}

	@JsOverlay
	public final String getTextOutline() {
		return textOutline;
	}

	@JsOverlay
	public final Style setTextOutline(String textOutline) {
		this.textOutline = textOutline;
		return this;
	}

	@JsOverlay
	public final String getTop() {
		return top;
	}

	@JsOverlay
	public final Style setTop(String top) {
		this.top = top;
		return this;
	}

	@JsOverlay
	public final String getTransition() {
		return transition;
	}

	@JsOverlay
	public final Style setTransition(String transition) {
		this.transition = transition;
		return this;
	}
}
