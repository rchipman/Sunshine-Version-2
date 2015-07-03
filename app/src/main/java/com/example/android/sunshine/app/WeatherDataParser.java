package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by rchipman on 7/2/15.
 */
public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
        throws JSONException {

        JSONObject data = new JSONObject(weatherJsonStr);
        JSONArray days = data.getJSONArray("list");
        JSONObject day = days.getJSONObject(dayIndex);
        JSONObject temperature = day.getJSONObject("temp");

        return temperature.getDouble("max");
    }
}
