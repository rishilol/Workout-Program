package com.rishikoduri.workout_program;

public class Exercise {
    protected final String name;
    protected final int sets, reps;

    public Exercise(
        final String name, 
        final int sets, 
        final int reps) 
    {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }
}
