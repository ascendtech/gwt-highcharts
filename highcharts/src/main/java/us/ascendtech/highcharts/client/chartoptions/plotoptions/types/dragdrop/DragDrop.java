package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.dragdrop;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DragDrop {

	@JsProperty
	private Boolean draggableX;
	@JsProperty
	private Boolean draggableY;
	@JsProperty
	private DragHandle dragHandle;
	@JsProperty
	private Double dragMaxX;
	@JsProperty
	private Double dragMaxY;
	@JsProperty
	private Double dragMinX;
	@JsProperty
	private Double dragMinY;
	@JsProperty
	private double dragPrecisionX;
	@JsProperty
	private double dragPrecisionY;
	@JsProperty
	private double dragSensitivity;
	@JsProperty
	private String groupBy;
	@JsProperty
	private String guideBox; //JSON style
	@JsProperty
	private boolean liveRedraw;

	@JsOverlay
	public final Boolean getDraggableX() {
		return draggableX;
	}

	@JsOverlay
	public final DragDrop setDraggableX(Boolean draggableX) {
		this.draggableX = draggableX;
		return this;
	}

	@JsOverlay
	public final Boolean getDraggableY() {
		return draggableY;
	}

	@JsOverlay
	public final DragDrop setDraggableY(Boolean draggableY) {
		this.draggableY = draggableY;
		return this;
	}

	@JsOverlay
	public final DragHandle getDragHandle() {
		return dragHandle;
	}

	@JsOverlay
	public final DragDrop setDragHandle(DragHandle dragHandle) {
		this.dragHandle = dragHandle;
		return this;
	}

	@JsOverlay
	public final Double getDragMaxX() {
		return dragMaxX;
	}

	@JsOverlay
	public final DragDrop setDragMaxX(Double dragMaxX) {
		this.dragMaxX = dragMaxX;
		return this;
	}

	@JsOverlay
	public final Double getDragMaxY() {
		return dragMaxY;
	}

	@JsOverlay
	public final DragDrop setDragMaxY(Double dragMaxY) {
		this.dragMaxY = dragMaxY;
		return this;
	}

	@JsOverlay
	public final Double getDragMinX() {
		return dragMinX;
	}

	@JsOverlay
	public final DragDrop setDragMinX(Double dragMinX) {
		this.dragMinX = dragMinX;
		return this;
	}

	@JsOverlay
	public final Double getDragMinY() {
		return dragMinY;
	}

	@JsOverlay
	public final DragDrop setDragMinY(Double dragMinY) {
		this.dragMinY = dragMinY;
		return this;
	}

	@JsOverlay
	public final double getDragPrecisionX() {
		return dragPrecisionX;
	}

	@JsOverlay
	public final DragDrop setDragPrecisionX(double dragPrecisionX) {
		this.dragPrecisionX = dragPrecisionX;
		return this;
	}

	@JsOverlay
	public final double getDragPrecisionY() {
		return dragPrecisionY;
	}

	@JsOverlay
	public final DragDrop setDragPrecisionY(double dragPrecisionY) {
		this.dragPrecisionY = dragPrecisionY;
		return this;
	}

	@JsOverlay
	public final double getDragSensitivity() {
		return dragSensitivity;
	}

	@JsOverlay
	public final DragDrop setDragSensitivity(double dragSensitivity) {
		this.dragSensitivity = dragSensitivity;
		return this;
	}

	@JsOverlay
	public final String getGroupBy() {
		return groupBy;
	}

	@JsOverlay
	public final DragDrop setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		return this;
	}

	@JsOverlay
	public final String getGuideBox() {
		return guideBox;
	}

	@JsOverlay
	public final DragDrop setGuideBox(String guideBox) {
		this.guideBox = guideBox;
		return this;
	}

	@JsOverlay
	public final boolean isLiveRedraw() {
		return liveRedraw;
	}

	@JsOverlay
	public final DragDrop setLiveRedraw(boolean liveRedraw) {
		this.liveRedraw = liveRedraw;
		return this;
	}
}
