package com.rishikoduri.workout_program.Measurements;

public final class Units 
{
    public static enum MeasurementType {
        LENGTH,
        WEIGHT
    }

    public static enum UnitType {
        /* Length */
        INCHES(0),
        FEET(1),
        CENTIMETERS(2),
        METERS(3),

        /* Weight */
        POUNDS(4),
        GRAMS(5),
        KILOGRAMS(6);

        private final int index;

        private UnitType(int index) 
        {
            this.index = index;
        }

        public int get_index() { return index; }
    }

    public static MeasurementType
    unit_to_measurement(
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

        return null;
    }
}
