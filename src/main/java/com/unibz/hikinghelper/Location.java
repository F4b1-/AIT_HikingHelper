package com.unibz.hikinghelper;

import com.unibz.hikinghelper.model.Difficulty;
import com.vaadin.tapio.googlemaps.client.LatLon;
import org.springframework.data.annotation.Id;

import java.time.Duration;
import java.util.ArrayList;


public class Location {

	@Id
	public String id;

	public String name;

	public LatLon latLon;

	public Difficulty difficulty;

	public Duration duration;

    ArrayList<LatLon> route;

    public Location() {
    }

    public Location(String name, LatLon latLon) {
		this.name = name;
		this.latLon = latLon;
	}

    public Location(String name, LatLon latLon, Difficulty difficulty, Duration duration, ArrayList<LatLon> route) {
        this.name = name;
        this.latLon = latLon;
        this.difficulty = difficulty;
        this.duration = duration;
        this.route = route;
    }

    public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LatLon getLatLon() {
		return latLon;
	}

	public void setLatLon(LatLon latLon) {
		this.latLon = latLon;
	}


    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public ArrayList<LatLon> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<LatLon> route) {
        this.route = route;
    }

    @Override
	public String toString() {
		return String.format("Location[id=%s, name='%s', latlon='%s']", id,
				name, "" + latLon.getLat() + "," + latLon.getLon());
	}



}