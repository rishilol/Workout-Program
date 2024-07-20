package com.rishikoduri.workout_program;

public class Exercise {
    protected final String name;
    /* Standard units for weight is in pounds */
    protected final int sets, reps;
    protected final Measurement weight;

    public Exercise(
        final String name, 
        final int sets, 
        final int reps,
        final Measurement weight) 
    {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }
}
