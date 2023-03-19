package com.OnJava.Chapter11.innerclasses.controller;

import java.util.ArrayList;

public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControllers gc = new GreenHouseControllers();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenHouseControllers.Terminate(5000));
        gc.run();
    }
}
