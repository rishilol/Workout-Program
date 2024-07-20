package com.rishikoduri.workout_program;

import org.junit.Test;
import static org.junit.Assert.*;

import com.rishikoduri.workout_program.Measurements.*;
import static com.rishikoduri.workout_program.Units.*;

public class MeasurementTests {
    @Test public void inches_to_inches() 
    {
        final Measurement original   = new Measurement(12, UnitType.INCHES);
        final Measurement conversion = Conversions.convert(original, UnitType.INCHES);
        assertEquals(conversion.get_magnitude(), original.get_magnitude(), 0.00001);
    }

    /* Weight Tests */
    @Test(expected = IllegalArgumentException.class)
    public void kilograms_to_feet()
    {
        final Measurement original   = new Measurement(100, UnitType.KILOGRAMS);
        final Measurement conversion = Measurement.convert(original, UnitType.FEET);
        // assertEquals(conversion.get_magnitude(), -1, 0.0000001);
    }

    /*
     * TODO: fix meter to inch conversion
     * 
     * problem is that the input unit type is copied to the output unit type,
     * so the conversion factor will always be 1
     */
    @Test public void meters_to_inches()
    {
        final Measurement original   = new Measurement(5, UnitType.METERS);
        final Measurement conversion = Conversions.convert(original, UnitType.INCHES);
        assertEquals(0, UnitType.INCHES.index);
        assertEquals(3, UnitType.METERS.index);
        // System.out.println(UnitType.INCHES.get_index());
        // System.out.println(UnitType.METERS.get_index());
        System.out.println(Conversions
            .get_conversion_coefficient(original.get_unit_type(), conversion.unit_type));
        assertEquals(39.37, Conversions
            .get_conversion_coefficient(original.unit_type, conversion.unit_type), 0.00001);
        assertEquals(196.85f, conversion.get_magnitude(), 0.00001);
    }
}
