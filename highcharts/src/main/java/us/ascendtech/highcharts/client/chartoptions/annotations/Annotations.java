package us.ascendtech.highcharts.client.chartoptions.annotations;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/annotations
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Annotations {

	@JsProperty
	private AnnotationsLabelOptions labelOptions;
	@JsProperty
	private JsArray<AnnotationsLabelOptions> labels;
	@JsProperty
	private AnnotationsShapeOptions shapeOptions;
	@JsProperty
	private JsArray<AnnotationsShapeOptions> shapes;
	@JsProperty
	private Boolean visible;
	@JsProperty
	private double zIndex;

	@JsOverlay
	public final AnnotationsLabelOptions getLabelOptions() {
		return labelOptions;
	}

	@JsOverlay
	public final Annotations setLabelOptions(AnnotationsLabelOptions labelOptions) {
		this.labelOptions = labelOptions;
		return this;
	}

	@JsOverlay
	public final JsArray<AnnotationsLabelOptions> getLabels() {
		return labels;
	}

	@JsOverlay
	public final Annotations setLabels(JsArray<AnnotationsLabelOptions> labels) {
		this.labels = labels;
		return this;
	}

	@JsOverlay
	public final AnnotationsShapeOptions getShapeOptions() {
		return shapeOptions;
	}

	@JsOverlay
	public final Annotations setShapeOptions(AnnotationsShapeOptions shapeOptions) {
		this.shapeOptions = shapeOptions;
		return this;
	}

	@JsOverlay
	public final JsArray<AnnotationsShapeOptions> getShapes() {
		return shapes;
	}

	@JsOverlay
	public final Annotations setShapes(JsArray<AnnotationsShapeOptions> shapes) {
		this.shapes = shapes;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Annotations setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final Annotations setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}
