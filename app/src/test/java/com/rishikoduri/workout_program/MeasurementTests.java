package com.rishikoduri.workout_program;

import org.junit.Test;

import com.rishikoduri.workout_program.Measurement.MeasurementType;

import static org.junit.Assert.*;

public class MeasurementTests {
    @Test public void inches_to_inches() 
    {
        final Measurement original   = new Measurement(12, Measurement.UnitType.INCHES);
        final Measurement conversion = Measurement.convert(original, Measurement.UnitType.INCHES);
        assertEquals(conversion.magnitude, original.magnitude, 0.00001);
    }

    /* Weight Tests */
    @Test(expected = IllegalArgumentException.class)
    public void kilograms_to_feet()
    {
        final Measurement original   = new Measurement(100, Measurement.UnitType.KILOGRAMS);
        final Measurement conversion = Measurement.convert(original, Measurement.UnitType.FEET);
        // assertEquals(conversion.magnitude, -1, 0.0000001);
    }

    /*
     * TODO: fix meter to inch conversion
     * 
     * problem is that the input unit type is copied to the output unit type,
     * so the conversion factor will always be 1
     */
    @Test public void meters_to_inches()
    {
        final Measurement original   = new Measurement(5, Measurement.UnitType.METERS);
        final Measurement conversion = Measurement.convert(original, Measurement.UnitType.INCHES);
        assertEquals(0, Measurement.UnitType.INCHES.index);
        assertEquals(3, Measurement.UnitType.METERS.index);
        // System.out.println(Measurement.UnitType.INCHES.index);
        // System.out.println(Measurement.UnitType.METERS.index);
        System.out.println(Measurement.get_conversion_coefficient(original.unit_type, conversion.unit_type));
        assertEquals(39.37, Measurement.get_conversion_coefficient(original.unit_type, conversion.unit_type), 0.00001);
        assertEquals(196.85f, conversion.magnitude, 0.00001);
    }
}
