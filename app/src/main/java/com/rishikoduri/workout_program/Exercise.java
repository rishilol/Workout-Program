package com.rishikoduri.workout_program;

public class Exercise {
    private final String name;
    /* Standard units for weight is in pounds */
    private int sets, reps;
    private Measurement weight;

    public Exercise(
        final String name, 
        int sets, 
        int reps,
        Measurement weight) 
    {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    /* Getters and Setters */
    public String get_name() { return name; }
    public void set_name(String name) { this.name = name; }

    public int get_sets() { return sets; }
    public void set_sets(int sets) { this.sets = sets; }

    public int get_reps() { return reps; }
    public void set_reps(int reps) { this.reps = reps; }

    public Measurement get_weight() { return weight; }
    public void set_weight(Measurement weight) { this.weight = weight; } 
}
