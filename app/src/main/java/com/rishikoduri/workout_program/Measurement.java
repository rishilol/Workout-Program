package com.rishikoduri.workout_program;

public class Measurement 
{
    protected double magnitude;
    protected final UnitType unit_type;
    protected final MeasurementType measurement_type;

    /* Recommended Default Constructor */
    public Measurement(
        double magnitude,
        final UnitType unit_type,
        final MeasurementType measurement_type)
    {
        this.magnitude = magnitude;
        this.unit_type = unit_type;
        this.measurement_type = measurement_type;
    }

    public static enum MeasurementType {
        LENGTH,
        WEIGHT
    }

    public static enum UnitType {
        /* Length */
        INCHES,
        FEET,
        CENTIMETERS,
        METERS,

        /* Weight */
        POUNDS,
        GRAMS,
        KILOGRAMS
    }

    /* Conversion Factors */

    /* Length */
    private static final short INCHES_PER_FOOT = 12;
    private static final float FEET_PER_INCH = 1.0f / INCHES_PER_FOOT;

    private static final float CENTIMETERS_PER_INCH = 2.54f;
    private static final float INCHES_PER_CENTIMETER = 1.0f / CENTIMETERS_PER_INCH;

    private static final short CENTIMETERS_PER_METER = 100;
    private static final float METERS_PER_CENTIMETER = 1.0f / CENTIMETERS_PER_METER;

    private static final float CENTIMETERS_PER_FOOT = CENTIMETERS_PER_INCH * INCHES_PER_FOOT;
    private static final float FEET_PER_CENTIMETER = 1.0f / CENTIMETERS_PER_FOOT;

    private static final float METERS_PER_FOOT = CENTIMETERS_PER_FOOT / CENTIMETERS_PER_METER;
    private static final float FEET_PER_METER = FEET_PER_CENTIMETER * CENTIMETERS_PER_METER;

    /* Weight */
    private static final float GRAMS_PER_POUND = 453.5924f;
    private static final float POUNDS_PER_GRAM = 1.0f / GRAMS_PER_POUND;

    private static final short GRAMS_PER_KILOGRAM = 1000;
    private static final float KILOGRAMS_PER_GRAM = 1.0f / GRAMS_PER_KILOGRAM;

    private static final float POUNDS_PER_KILOGRAM = POUNDS_PER_GRAM * GRAMS_PER_KILOGRAM;
    private static final float KILOGRAMS_PER_POUND = 1.0f / POUNDS_PER_KILOGRAM;

    public static MeasurementType
    get_measurement_type_from_unit_type(
            final UnitType type)
    {
        switch (type) {
            case UnitType.INCHES:
            case UnitType.FEET:
            case UnitType.CENTIMETERS:
            case UnitType.METERS:
                return MeasurementType.LENGTH;

            case UnitType.POUNDS:
            case UnitType.GRAMS:
            case UnitType.KILOGRAMS:
                return MeasurementType.WEIGHT;
        }
    }

    public static Measurement
    convert(final Measurement from, final UnitType to)
    throws IllegalArgumentException;
    {
        /* 
         * If they are not the same measurement type,
         * return an error. 
         */

        final MeasurementType measurement_to =
            get_measurement_type_from_unit_type(to);

        if (from.measurement_type != measurement_to)
            throw new IllegalArgumentException(
                "Initial measurement is of type " + 
                from.measurement_type.toString() + 
                ", but conversion type is " + 
                measurement_to.toString()); 

        if (from.measurement_type == measurement_to)
            return from;

        double output_magnitude = 0.0f;

        switch (from) {
            /* Length Conversion */
            case UnitType.INCHES:
            {
                switch (to)
                {
                    /* Inches to Feet */
                    case UnitType.FEET:
                        output_magnitude = from.magnitude / INCHES_PER_FOOT;
                        break;

                    /* Inches to Centimeters */
                    case UnitType.CENTIMETERS:
                        output_magnitude = from.magnitude * CENTIMETERS_PER_INCH;
                        break;

                    /*
                     * TODO: Complete this section of conversions
                     */

                }
            }

            /* Weight Conversion */
        }
    }
}
