package com.company.dymrin16;

import java.io.File;

public class FileLoggerConfiguration {
    private File placeForInfo;
    private LoggingLevel loggingLevel;
    private int maxByteSize;
    private String writingFormat;

    public FileLoggerConfiguration(File placeForInfo, LoggingLevel loggingLevel, int maxByteSize, String writingFormat) {
        this.placeForInfo = placeForInfo;
        this.loggingLevel = loggingLevel;
        this.maxByteSize = maxByteSize;
        this.writingFormat = writingFormat;
    }

    public File getPlaceForInfo() {
        return placeForInfo;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public int getMaxByteSize() {
        return maxByteSize;
    }

    public String getWritingFormat() {
        return writingFormat;
    }

    @Override
    public String toString() {
        return writingFormat;
    }
}
