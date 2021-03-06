package com.laz.creational.builder;

import com.laz.creational.builder.components.Engine;
import com.laz.creational.builder.components.GPSNavigator;
import com.laz.creational.builder.components.Transmission;
import com.laz.creational.builder.components.TripComputer;
import com.laz.creational.builder.products.Type;

/*
Abstract builder interface
*/
public interface Builder {
  Builder setType(Type type);

  Builder setSeats(int seats);

  Builder setEngine(Engine engine);

  Builder setTransmission(Transmission transmission);

  Builder setTripComputer(TripComputer tripComputer);

  Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
