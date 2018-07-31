package us.ascendtech.client.highcharts.js.chartoptions.exporting;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ExportingCSV {

	@JsProperty
	private ColumnHeaderFormatter columnHeaderFormatter;
	@JsProperty
	private String dateFormat;
	@JsProperty
	private String decimalPoint;
	@JsProperty
	private String itemDelimiter;
	@JsProperty
	private String lineDelimiter;

	@JsFunction
	public interface ColumnHeaderFormatter {
		String getFormatter(Object item, double key, double keyLength);
	}

	@JsOverlay
	public final ColumnHeaderFormatter getColumnHeaderFormatter() {
		return columnHeaderFormatter;
	}

	@JsOverlay
	public final ExportingCSV setColumnHeaderFormatter(ColumnHeaderFormatter columnHeaderFormatter) {
		this.columnHeaderFormatter = columnHeaderFormatter;
		return this;
	}

	@JsOverlay
	public final String getDateFormat() {
		return dateFormat;
	}

	@JsOverlay
	public final ExportingCSV setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		return this;
	}

	@JsOverlay
	public final String getDecimalPoint() {
		return decimalPoint;
	}

	@JsOverlay
	public final ExportingCSV setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		return this;
	}

	@JsOverlay
	public final String getItemDelimiter() {
		return itemDelimiter;
	}

	@JsOverlay
	public final ExportingCSV setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
		return this;
	}

	@JsOverlay
	public final String getLineDelimiter() {
		return lineDelimiter;
	}

	@JsOverlay
	public final ExportingCSV setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
		return this;
	}
}
