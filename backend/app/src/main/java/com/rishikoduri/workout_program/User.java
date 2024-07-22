package com.rishikoduri.workout_program;

import javax.measure.Quantity;

public final class User 
{
    /*
     * All data for height is stored universally as inches
     * whereas all data for weight is stored internally as
     * pounds by default.
     */
    private Quantity<Mass> weight;
    private Quantity<Length> height;

    /* Default Constructor */
    private User(final Quantity<Mass> weight, final Quantity<Length> height)
    {
        this.height = height;
        this.weight = weight;
    }

    public static User 
    parse_from_strings(final String height, final String weight)
    {
        return null;
    }

    /* Getters and Setters */
    public Measurement get_height() { return height; }
    public void set_height(Measurement height) { this.height = height; }

    public Measurement get_weight() { return weight; }
    public void set_weight(Measurement weight) { this.weight = weight; }
}
