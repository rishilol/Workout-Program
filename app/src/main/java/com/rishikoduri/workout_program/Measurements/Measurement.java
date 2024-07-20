package com.rishikoduri.workout_program.Measurements;

import static Units.*;

public final class Measurement 
{
    private double magnitude; 
    private final UnitType unit_type;
    private final MeasurementType measurement_type;

    private Measurement(double magnitude, final UnitType unit_type, 
            final MeasurementType measurement_type)
    {
        this.magnitude = magnitude;
        this.unit_type = unit_type;
        this.measurement_type = measurement_type;
    }

    /* Recommended Default Constructor */
    public Measurement(double magnitude, final UnitType unit_type)
    {
        Measurement(magnitude, unit_type, unit_to_measurement(unit_type)); 
    }

    @Override public void toString()
    {
        return String.format("%.03f %s", magnitude, unit_type.name());
    }

    /* Getters and Setters */

    public double get_magnitude() { 
        return magnitude;
    }

    public void set_magnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public UnitType get_unit_type() {
        return unit_type;
    }

    public MeasurementType get_measurement_type() {
        return measurement_type;
    }
}
