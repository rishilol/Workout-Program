package com.rishikoduri.workout_program;

public final class User 
{
    /*
     * All data for height is stored universally as inches
     * whereas all data for weight is stored internally as
     * pounds by default.
     */
    protected final Measurement height, weight;

    /* Default Constructor */
    private User (
        final Measurement height,
        final Measurement weight)
    {
        this.height = height;
        this.weight = weight;
    }

    public static User 
    parse_from_strings(
            final String height,
            final String weight)
    {
        
    }
}
