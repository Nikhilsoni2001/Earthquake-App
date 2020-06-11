package com.nikhil.earthquakereport;

public class Earthquake {

    private String mUrl;
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mDate;

    public Earthquake(double magnitude, String location, String date, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }

    public long getTime() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

}
