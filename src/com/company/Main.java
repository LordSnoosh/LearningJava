package com.company;

import javax.lang.model.element.NestingKind;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String testInt = "1";
        int testInt2 = 2;
        int testInt3 = 3;

        System.out.println("Hello World!");

        System.out.println("The total of the two ints are:" + (testInt = Integer.toString(testInt3 + testInt2)));

        String together = testInt + testInt2;
        String apart = testInt + testInt3;

        System.out.println("together is: " + together);

        System.out.println(String.format("testInt is %s and testInt2 is %s and together is %s", testInt,testInt2,together));

        String speak = "Quack";
        boolean canFloat = true;
        boolean canFly = true;

        String speakRubber = "Squeak";
        boolean canFloatRubber = true;
        boolean canFlyRubber = false;

        Duck realDuck = new Duck(speak, canFly, canFloat, true);
        System.out.println("Speak " + realDuck.getSpeak());
        System.out.println("Fly " + realDuck.getFly());
        System.out.println("Float " + realDuck.getFloat());
        System.out.println("Walk " + realDuck.getWalk());

        Duck rubberDuck = new Duck(speakRubber, canFlyRubber, canFloatRubber, false);
        System.out.println("Speak " + rubberDuck.getSpeak());
        System.out.println("Fly " + rubberDuck.getFly());
        System.out.println("Float " + rubberDuck.getFloat());
        System.out.println("Walk " + rubberDuck.getWalk());

        Duck catDuck = new Duck();
        System.out.println("Speak " + catDuck.getSpeak());
        System.out.println("Fly " + catDuck.getFly());
        System.out.println("Float " + catDuck.getFloat());
        System.out.println("Walk " + catDuck.getWalk());

    }

    public static class Duck
    {
        public Duck() {
            speak = "meow?";
        }

        public Duck(String initSpeak,boolean initCanFly, boolean initCanFloat, boolean initCanWalk)
        {
            speak = initSpeak;
            canFloat = initCanFloat;
            canFly = initCanFly;
            canWalk = initCanWalk;
        }

        String speak;
        boolean canFloat;
        boolean canFly;
        boolean canWalk;


        public String getSpeak()
        {
            if (speak == "meow?") {
                return speak += " (I is not a duck... hehehe)";
            }
            return speak;
        }

        public boolean getFloat()
        {
            return canFloat;

        }
        public boolean getFly()
        {
            return canFly;

        }
        public  boolean getWalk()
         {
            return canWalk;

         }
    }
}
