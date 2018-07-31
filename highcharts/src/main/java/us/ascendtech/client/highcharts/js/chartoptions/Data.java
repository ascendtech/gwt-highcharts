package us.ascendtech.client.highcharts.js.chartoptions;

import elemental2.core.JsArray;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.ChartOptions;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesPoint;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/data
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Data {

	@JsProperty
	private BeforeParse beforeParse;
	@JsProperty
	private JsArray<Object> columns;
	@JsProperty
	private String columnsUrl;
	@JsProperty
	private Complete complete;
	@JsProperty
	private String csv;
	@JsProperty
	private String csvUrl;
	@JsProperty
	private Integer dataRefreshRate;
	@JsProperty
	private String dateFormat;
	@JsProperty
	private String decimalPoint;
	@JsProperty
	private Boolean enablePolling;
	@JsProperty
	private Long endColumn;
	@JsProperty
	private Long endRow;
	@JsProperty
	private Boolean firstRowAsNames;
	@JsProperty
	private String googleSpreadsheetKey;
	@JsProperty
	private String googleSpreadsheetWorksheet;
	@JsProperty
	private String itemDelimiter;
	@JsProperty
	private String lineDelimiter;
	@JsProperty
	private Parsed parsed;
	@JsProperty
	private ParseDate parseDate;
	@JsProperty
	private JsArray<Object> rows;
	@JsProperty
	private String rowsUrl;
	@JsProperty
	private JsArray<SeriesPoint> seriesMapping;
	@JsProperty
	private Integer startColumn;
	@JsProperty
	private Integer startRow;
	@JsProperty
	private Boolean switchRowsAndColumns;
	@JsProperty
	private String table;

	@JsFunction
	public interface BeforeParse {
		String getModifiedString(String input);
	}

	@JsFunction
	public interface Complete {
		void onComplete(ChartOptions chartOptions);
	}

	@JsFunction
	public interface Parsed {
		void modify(JsArray<Object> columns);
	}

	@JsFunction
	public interface ParseDate {
		Integer getParsedDate(String date);
	}

	@JsOverlay
	public final BeforeParse getBeforeParse() {
		return beforeParse;
	}

	@JsOverlay
	public final Data setBeforeParse(BeforeParse beforeParse) {
		this.beforeParse = beforeParse;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getColumns() {
		return columns;
	}

	@JsOverlay
	public final Data setColumns(JsArray<Object> columns) {
		this.columns = columns;
		return this;
	}

	@JsOverlay
	public final String getColumnsUrl() {
		return columnsUrl;
	}

	@JsOverlay
	public final Data setColumnsUrl(String columnsUrl) {
		this.columnsUrl = columnsUrl;
		return this;
	}

	@JsOverlay
	public final Complete getComplete() {
		return complete;
	}

	@JsOverlay
	public final Data setComplete(Complete complete) {
		this.complete = complete;
		return this;
	}

	@JsOverlay
	public final String getCsv() {
		return csv;
	}

	@JsOverlay
	public final Data setCsv(String csv) {
		this.csv = csv;
		return this;
	}

	@JsOverlay
	public final String getCsvUrl() {
		return csvUrl;
	}

	@JsOverlay
	public final Data setCsvUrl(String csvUrl) {
		this.csvUrl = csvUrl;
		return this;
	}

	@JsOverlay
	public final Integer getDataRefreshRate() {
		return dataRefreshRate;
	}

	@JsOverlay
	public final Data setDataRefreshRate(Integer dataRefreshRate) {
		this.dataRefreshRate = dataRefreshRate;
		return this;
	}

	@JsOverlay
	public final String getDateFormat() {
		return dateFormat;
	}

	@JsOverlay
	public final Data setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		return this;
	}

	@JsOverlay
	public final String getDecimalPoint() {
		return decimalPoint;
	}

	@JsOverlay
	public final Data setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		return this;
	}

	@JsOverlay
	public final Boolean getEnablePolling() {
		return enablePolling;
	}

	@JsOverlay
	public final Data setEnablePolling(Boolean enablePolling) {
		this.enablePolling = enablePolling;
		return this;
	}

	@JsOverlay
	public final Long getEndColumn() {
		return endColumn;
	}

	@JsOverlay
	public final Data setEndColumn(Long endColumn) {
		this.endColumn = endColumn;
		return this;
	}

	@JsOverlay
	public final Long getEndRow() {
		return endRow;
	}

	@JsOverlay
	public final Data setEndRow(Long endRow) {
		this.endRow = endRow;
		return this;
	}

	@JsOverlay
	public final Boolean getFirstRowAsNames() {
		return firstRowAsNames;
	}

	@JsOverlay
	public final Data setFirstRowAsNames(Boolean firstRowAsNames) {
		this.firstRowAsNames = firstRowAsNames;
		return this;
	}

	@JsOverlay
	public final String getGoogleSpreadsheetKey() {
		return googleSpreadsheetKey;
	}

	@JsOverlay
	public final Data setGoogleSpreadsheetKey(String googleSpreadsheetKey) {
		this.googleSpreadsheetKey = googleSpreadsheetKey;
		return this;
	}

	@JsOverlay
	public final String getGoogleSpreadsheetWorksheet() {
		return googleSpreadsheetWorksheet;
	}

	@JsOverlay
	public final Data setGoogleSpreadsheetWorksheet(String googleSpreadsheetWorksheet) {
		this.googleSpreadsheetWorksheet = googleSpreadsheetWorksheet;
		return this;
	}

	@JsOverlay
	public final String getItemDelimiter() {
		return itemDelimiter;
	}

	@JsOverlay
	public final Data setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
		return this;
	}

	@JsOverlay
	public final String getLineDelimiter() {
		return lineDelimiter;
	}

	@JsOverlay
	public final Data setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
		return this;
	}

	@JsOverlay
	public final Parsed getParsed() {
		return parsed;
	}

	@JsOverlay
	public final Data setParsed(Parsed parsed) {
		this.parsed = parsed;
		return this;
	}

	@JsOverlay
	public final ParseDate getParseDate() {
		return parseDate;
	}

	@JsOverlay
	public final Data setParseDate(ParseDate parseDate) {
		this.parseDate = parseDate;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getRows() {
		return rows;
	}

	@JsOverlay
	public final Data setRows(JsArray<Object> rows) {
		this.rows = rows;
		return this;
	}

	@JsOverlay
	public final String getRowsUrl() {
		return rowsUrl;
	}

	@JsOverlay
	public final Data setRowsUrl(String rowsUrl) {
		this.rowsUrl = rowsUrl;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesPoint> getSeriesMapping() {
		return seriesMapping;
	}

	@JsOverlay
	public final Data setSeriesMapping(JsArray<SeriesPoint> seriesMapping) {
		this.seriesMapping = seriesMapping;
		return this;
	}

	@JsOverlay
	public final Integer getStartColumn() {
		return startColumn;
	}

	@JsOverlay
	public final Data setStartColumn(Integer startColumn) {
		this.startColumn = startColumn;
		return this;
	}

	@JsOverlay
	public final Integer getStartRow() {
		return startRow;
	}

	@JsOverlay
	public final Data setStartRow(Integer startRow) {
		this.startRow = startRow;
		return this;
	}

	@JsOverlay
	public final Boolean getSwitchRowsAndColumns() {
		return switchRowsAndColumns;
	}

	@JsOverlay
	public final Data setSwitchRowsAndColumns(Boolean switchRowsAndColumns) {
		this.switchRowsAndColumns = switchRowsAndColumns;
		return this;
	}

	@JsOverlay
	public final String getTable() {
		return table;
	}

	@JsOverlay
	public final Data setTable(String table) {
		this.table = table;
		return this;
	}
}
