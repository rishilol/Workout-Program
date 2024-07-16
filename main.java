import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) {

        workouts work = new workouts();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your height in inches");
        int height = scan.nextInt();
        System.out.println("Please input your weight in pounds");
        int weight = scan.nextInt();
        System.out.println("On a scale of 1-10, how good is your equipment to workout. 10 for high level, 1 for low level");
        int ge = scan.nextInt();

        if(weight > 200){
            workouttest(height, weight, ge);
        }
        else if(weight > 150){
            workoutB(height, weight);
        }
        
        else{
            workoutC(height, weight);
        }

        }

    public static void workouttest(int height, int weight, int cp){
        work.Chestpress(height, weight);
        System.out.println(cp);
    }

    public static void workoutA(int height, int weight){
        System.out.println("Day 1: PUSH");
        System.out.println("");
        System.out.println("Chest Press");
        System.out.println("Warm up: 50 pounds, 10 reps");
        System.out.println("Set 1: 50 pounds, 10 reps");
        System.out.println("Set 2: 40 pounds, 12 reps");
        System.out.println("Set 3: 50 pounds, 15 reps, 30 - ∞");
        System.out.println("");
        System.out.println("Pec Fly");
        System.out.println("Warm up: 40 pounds, 10 reps");
        System.out.println("Set 1: 50 pounds, 10 reps");
        System.out.println("Set 2: 40 pounds, 12 reps");
        System.out.println("Set 3: 50 pounds, 15 reps, 30 - ∞");
        System.out.println("");
        System.out.println("Reverse incline dumbbell press, superset dinner plates");
        System.out.println("Set 1: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("Set 2: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("Set 3: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("");
        System.out.println("Shoulder Press");
        System.out.println("Set 1: 10 pounds, 10 reps");
        System.out.println("Set 2: 10 pounds, 10 reps");
        System.out.println("Set 3: 10 pounds, 10 reps");
        System.out.println("Flys and straight dumbell lift");
        System.out.println("Set 1: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("Set 2: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("Set 3: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("");
        System.out.println("Tricep Pulley");
        System.out.println("Set 1: 30 pounds - 10 reps");
        System.out.println("Set 2: 30 pounds - 10 reps");
        System.out.println("Set 3: 30 pounds - 10 reps");
        System.out.println("");
        System.out.println("Tricep push down and standing skull crusher ");
        System.out.println("Set 1: 30 pounds - 10 reps, 10 pounds - 10 reps");
        System.out.println("Set 2: 30 pounds - 10 reps, 10 pounds - 10 reps");
        System.out.println("Set 3: 30 pounds - 10 reps, 10 pounds - 10 reps");

        System.out.println("");
        System.out.println("Day 2:Pull");
        System.out.println("");
        System.out.println("Lat Pull Down ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("");
        System.out.println("Rows ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("");
        System.out.println("Rear Delt Fly ");
        System.out.println("Set 1: 30 pouonds - 10");
        System.out.println("Set 2: 20 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("");
        System.out.println("Bicep Curl ");
        System.out.println("Set 1: 20 pouonds - 10");
        System.out.println("Set 2: 15 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("Hammer Curl ");
        System.out.println("Set 1: 20 pouonds - 10");
        System.out.println("Set 2: 15 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("Preacher curl one hand");
        System.out.println("Set 1: 15 pouonds - 10");
        System.out.println("Set 2: 10 pounds - 15");
        System.out.println("Set 3: 5 - ∞");
        System.out.println("");

        System.out.println("Day 3: Legs");
        System.out.println("Leg Press ");
        System.out.println("Set 1: 110 pouonds - 10");
        System.out.println("Set 2: 85 pounds - 15");
        System.out.println("Set 3: 70 - ∞");
        System.out.println("Leg Extension ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("Hamstrting Curl ");
        System.out.println("Set 1: 30 pouonds - 10");
        System.out.println("Set 2: 20 pounds - 15");
        System.out.println("Set 3: 10 - ∞");


    }

    public static void workoutB(int height, int weight){
        System.out.println("Day 1: PUSH");
        System.out.println("");
        System.out.println("Chest Press");
        System.out.println("Warm up: 50 pounds, 10 reps");
        System.out.println("Set 1: 50 pounds, 10 reps");
        System.out.println("Set 2: 40 pounds, 12 reps");
        System.out.println("Set 3: 50 pounds, 15 reps, 30 - ∞");
        System.out.println("");
        System.out.println("Pec Fly");
        System.out.println("Warm up: 40 pounds, 10 reps");
        System.out.println("Set 1: 50 pounds, 10 reps");
        System.out.println("Set 2: 40 pounds, 12 reps");
        System.out.println("Set 3: 50 pounds, 15 reps, 30 - ∞");
        System.out.println("");
        System.out.println("Reverse incline dumbbell press, superset dinner plates");
        System.out.println("Set 1: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("Set 2: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("Set 3: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("");
        System.out.println("Shoulder Press");
        System.out.println("Set 1: 10 pounds, 10 reps");
        System.out.println("Set 2: 10 pounds, 10 reps");
        System.out.println("Set 3: 10 pounds, 10 reps");
        System.out.println("Flys and straight dumbell lift");
        System.out.println("Set 1: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("Set 2: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("Set 3: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("");
        System.out.println("Tricep Pulley");
        System.out.println("Set 1: 30 pounds - 10 reps");
        System.out.println("Set 2: 30 pounds - 10 reps");
        System.out.println("Set 3: 30 pounds - 10 reps");
        System.out.println("");
        System.out.println("Tricep push down and standing skull crusher ");
        System.out.println("Set 1: 30 pounds - 10 reps, 10 pounds - 10 reps");
        System.out.println("Set 2: 30 pounds - 10 reps, 10 pounds - 10 reps");
        System.out.println("Set 3: 30 pounds - 10 reps, 10 pounds - 10 reps");

        System.out.println("");
        System.out.println("Day 2:Pull");
        System.out.println("");
        System.out.println("Lat Pull Down ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("");
        System.out.println("Rows ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("");
        System.out.println("Rear Delt Fly ");
        System.out.println("Set 1: 30 pouonds - 10");
        System.out.println("Set 2: 20 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("");
        System.out.println("Bicep Curl ");
        System.out.println("Set 1: 20 pouonds - 10");
        System.out.println("Set 2: 15 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("Hammer Curl ");
        System.out.println("Set 1: 20 pouonds - 10");
        System.out.println("Set 2: 15 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("Preacher curl one hand");
        System.out.println("Set 1: 15 pouonds - 10");
        System.out.println("Set 2: 10 pounds - 15");
        System.out.println("Set 3: 5 - ∞");
        System.out.println("");
        
        System.out.println("Day 3: Legs");
        System.out.println("Leg Press ");
        System.out.println("Set 1: 110 pouonds - 10");
        System.out.println("Set 2: 85 pounds - 15");
        System.out.println("Set 3: 70 - ∞");
        System.out.println("Leg Extension ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("Hamstrting Curl ");
        System.out.println("Set 1: 30 pouonds - 10");
        System.out.println("Set 2: 20 pounds - 15");
        System.out.println("Set 3: 10 - ∞");


    }

    public static void workoutC(int height, int weight){
        System.out.println("Day 1: PUSH");
        System.out.println("");
        System.out.println("Chest Press");
        System.out.println("Warm up: 50 pounds, 10 reps");
        System.out.println("Set 1: 50 pounds, 10 reps");
        System.out.println("Set 2: 40 pounds, 12 reps");
        System.out.println("Set 3: 50 pounds, 15 reps, 30 - ∞");
        System.out.println("");
        System.out.println("Pec Fly");
        System.out.println("Warm up: 40 pounds, 10 reps");
        System.out.println("Set 1: 50 pounds, 10 reps");
        System.out.println("Set 2: 40 pounds, 12 reps");
        System.out.println("Set 3: 50 pounds, 15 reps, 30 - ∞");
        System.out.println("");
        System.out.println("Reverse incline dumbbell press, superset dinner plates");
        System.out.println("Set 1: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("Set 2: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("Set 3: 15 pounds, 10 reps, 10 pounds, 10 reps");
        System.out.println("");
        System.out.println("Shoulder Press");
        System.out.println("Set 1: 10 pounds, 10 reps");
        System.out.println("Set 2: 10 pounds, 10 reps");
        System.out.println("Set 3: 10 pounds, 10 reps");
        System.out.println("Flys and straight dumbell lift");
        System.out.println("Set 1: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("Set 2: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("Set 3: 10 pounds, 10 reps, 5 pounds - 10 reps, each arm 5 pounds - 5 reps");
        System.out.println("");
        System.out.println("Tricep Pulley");
        System.out.println("Set 1: 30 pounds - 10 reps");
        System.out.println("Set 2: 30 pounds - 10 reps");
        System.out.println("Set 3: 30 pounds - 10 reps");
        System.out.println("");
        System.out.println("Tricep push down and standing skull crusher ");
        System.out.println("Set 1: 30 pounds - 10 reps, 10 pounds - 10 reps");
        System.out.println("Set 2: 30 pounds - 10 reps, 10 pounds - 10 reps");
        System.out.println("Set 3: 30 pounds - 10 reps, 10 pounds - 10 reps");

        System.out.println("");
        System.out.println("Day 2:Pull");
        System.out.println("");
        System.out.println("Lat Pull Down ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("");
        System.out.println("Rows ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("");
        System.out.println("Rear Delt Fly ");
        System.out.println("Set 1: 30 pouonds - 10");
        System.out.println("Set 2: 20 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("");
        System.out.println("Bicep Curl ");
        System.out.println("Set 1: 20 pouonds - 10");
        System.out.println("Set 2: 15 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("Hammer Curl ");
        System.out.println("Set 1: 20 pouonds - 10");
        System.out.println("Set 2: 15 pounds - 15");
        System.out.println("Set 3: 10 - ∞");
        System.out.println("Preacher curl one hand");
        System.out.println("Set 1: 15 pouonds - 10");
        System.out.println("Set 2: 10 pounds - 15");
        System.out.println("Set 3: 5 - ∞");
        System.out.println("");
        
        System.out.println("Day 3: Legs");
        System.out.println("Leg Press ");
        System.out.println("Set 1: 110 pouonds - 10");
        System.out.println("Set 2: 85 pounds - 15");
        System.out.println("Set 3: 70 - ∞");
        System.out.println("Leg Extension ");
        System.out.println("Set 1: 60 pouonds - 10");
        System.out.println("Set 2: 50 pounds - 15");
        System.out.println("Set 3: 40 - ∞");
        System.out.println("Hamstrting Curl ");
        System.out.println("Set 1: 30 pouonds - 10");
        System.out.println("Set 2: 20 pounds - 15");
        System.out.println("Set 3: 10 - ∞");


    }
    

}