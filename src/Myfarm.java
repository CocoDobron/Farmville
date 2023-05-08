import org.w3c.dom.css.Counter;

import java.util.ArrayList;

public class Myfarm {
    ArrayList<Plot> row;
    public Plot jorgesPlot;

    //printPlantNames();
    public static void main(String[] args) {
        System.out.println("this is my farm");
        Myfarm LettuceCode = new Myfarm();
    }

    public Myfarm() {
        row = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            row.add(new Plot());
        }
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();


        }



        printPlantNames();
        totalPlants();
        // totalCarrots();
        // printRowInfo();
        //addLettuce();
        //addTulip();
        //tomatoLocations();
        //averageNumberOfPlants();
        //numberOfCarrotPlots();
        //numberOfEmptyPlots();
        //everyOtherNeedsWater();
        plantWithMaxNumber();
        //plantWithMinNumber();
        //plantWithMaxNumberNeedsWater(),


    }


    /////PP
    public void totalPlants() {
        int total = 0;
        System.out.println("******Total Plants*******");
        for (int s = 0; s < row.size(); s++) {
            total = total + row.get(s).numberOfPlants;

        }
        System.out.println("total plants in row" + total);


    }

    public void printPlantNames() {
        System.out.println("******Total Plants*******");
        for (int i = -0; i < row.size(); i++) {
            System.out.print(i + ": " + row.get(i).plantName + ", ");
        }
        System.out.println();
    }

    // public void printRowInfo();{}
    public void addLettuce() {
        System.out.println("******ADD LETTUCE*******");
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;
        printPlantNames();


    }

    public void addTulip() {
        System.out.println("******ADD TULIP*******");
        printPlantNames();
        row.get(3).plantName = "tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
        printPlantNames();


        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
    }


    public void tomatoLocations() {
        System.out.println("******ALL TOMATO*******");
        printPlantNames();
        // numberOfEmptyPlots();
        if (row.isEmpty())
            printPlantNames();


        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
    }

    public void totalCarrots() {
        System.out.println("******TOTAL CARROT*******");
        printPlantNames();
        int total = 0;
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                total = total + row.get(k).numberOfPlants;

            }
        }
        System.out.println("TOTAL CARROTS: " + total);


        // how many total carrot plants are there?
    }

    public void averageNumberOfPlants() {
        System.out.println("******AVERAGE NUMBER OF PLANTS*******");
        printPlantNames();
        int total = 0;
        int avg = 0;
        for (int index = 0; index < row.size(); index++) {
            total = total + row.get(index).numberOfPlants;
        }
        avg = total / 10; //or row.size()
        System.out.println("AVG NUMBER OF PLANTS" + avg);


        // what is the average number of plants across the whole row?
    }


    public void numberOfCarrotPlots() {
        System.out.println("******CARROT PLOTS*******");
        printPlantNames();
        int total = 0;
        for (int k = 0; k < row.size(); k++) {
            if (row.get(k).plantName.equals("carrot plot")) {
                total = total + 1;

            }
            System.out.println("Carrot Plots" + total);


            printPlantNames();

            // how many plots have carrots on them
// call printPlantNames() method to check
        }
    }


    public void numberOfEmptyPlots() {
        int total = 0;
        System.out.println("******Total Empty*******");
        for (int s = 0; s < row.size(); s++) {
            total = total + row.get(s).numberOfPlants;

        }
        System.out.println("total plants in row" + total);
    }


    public void everyOtherNeedsWater() {
        System.out.println("******NEEDSWATER COMMAND*******");
        int total = 0;
        int avg = 0;
        for (int k = 0; k < row.size(); k++) {
            for (int index = 0; index < row.size(); index = index + 2) {
                total = total + row.get(index).numberOfPlants;
                row.get(k).needsWater = true;
            }
            System.out.println("Everyother water" + 2);


            // change the value of needsWater to be true for every other plot
        }
    }

        public void greaterThan10 () {
            System.out.println("******MORE THAN 10*******");
            int total = 0;

        for (int s = 0; s < row.size(); s++) {
            if (row.get(s).numberOfPlants > 10) ;
        }
        System.out.println("MORE THAN 10");


        // how many plots have more than 10 plants in the plot?
    }

//    public void plantWithMaxNumber() {
//        System.out.println("PLANT W MAX NUMBER NEED WATER");
//        int total = 0;
//        int tomato = 0;
//        int lettuce = 0;
//        int tulip = 0;
//        int carrot;
//        for (int k = 0; k < row.size(); k++) {
//            if (row.get(k).plantName.equals("carrot")) {
//                total = row.get(k).numberOfPlants + total;
//            }
//            if (row.get(k).plantName.equals("tulip")) {
//                needsWater = true;
//            }
//            if (row.get(k).plantName.equals("lettuce")) {
//                needsWater = true;
//            }
//            if (row.get(k).plantName.equals("tomato")) {
//                needsWater = true;
//            }
//
//
//        }


        public void plantWithMinNumber () {
            System.out.println("PLANT W MIN NUMBER");
            int totalCarrots = 0;
            int totalTomatoes = 0;
            int totalTulips = 0;
            int totalLettuce = 0;

            //step 1: add up the total Carrots, total Tomatoes, total tulips, total Lettuce
            for (int k = 0; k < row.size(); k++) {
                if (row.get(k).plantName.equals("carrot")) {
                    totalCarrots = totalCarrots + row.get(k).numberOfPlants;
                }
                if (row.get(k).plantName.equals("tomato")) {
                    totalTomatoes = totalTomatoes + row.get(k).numberOfPlants;
                }
                if (row.get(k).plantName.equals("tulip")) {
                    totalTulips = totalTulips + row.get(k).numberOfPlants;
                }
                if (row.get(k).plantName.equals("lettuce")) {
                    totalLettuce = totalLettuce + row.get(k).numberOfPlants;
                }
            }
            //step 2: compare each individual plant total to find the smallest (greater than 0)
            int currentMin = 0;
            String plantType = "empty";

            if (totalCarrots < totalTomatoes) {
                currentMin = totalCarrots;
                plantType = "carrot";
            } else {
                currentMin = totalTomatoes;
                plantType = "tomato";
            }
            //current min vs. tulip
            if (totalTulips < currentMin && totalTulips > 0) {
                currentMin = totalTulips;
                plantType = "tulip";
            }
            //current min vs. lettuce
            if (totalLettuce < currentMin && totalLettuce > 0) {
                currentMin = totalLettuce;
                plantType = "lettuce";
            }
            System.out.println("The min plant type is " + plantType + " with " + currentMin + " plants.");

        }




    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        System.out.println("PLANT W MAX NUMBER");
        int totalCarrots = 0;
        int totalTomatoes = 0;
        int totalTulips = 0;
        int totalLettuce = 0;
        int currMax = row.get(0).numberOfPlants;
        String plantType = row.get(0).plantName;

        for (int k = 0; k > row.size(); k++) {
            if (row.get(k).plantName.equals("carrot")) {
                totalCarrots = totalCarrots + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("tulip")) {
                totalTulips = totalTulips + row.get(k).numberOfPlants;
            }
            if (row.get(k).plantName.equals("lettuce")) {
                totalLettuce = totalLettuce + row.get(k).numberOfPlants;

            }
            if (row.get(k).plantName.equals("tomato")) {
                totalTomatoes = totalTomatoes + row.get(k).numberOfPlants;
            }
        }
        if (totalCarrots > totalLettuce && totalCarrots > totalTulips && totalCarrots > totalTomatoes) {
            currMax = totalCarrots;
            plantType = "Carrot";
        }
        if (totalLettuce > totalCarrots && totalLettuce > totalTulips && totalLettuce > totalTomatoes) {
            currMax = totalLettuce;
            plantType = "Lettuce";
        }
        if (totalTulips > totalLettuce && totalTulips > totalCarrots && totalTulips > totalTomatoes) {
            currMax = totalTulips;
            plantType = "Tulips";
        }
        if (totalTomatoes > totalLettuce && totalTomatoes > totalTulips && totalTomatoes > totalTomatoes) {
            currMax = totalTomatoes;
            plantType = "tomato";
        }

        System.out.println(plantType+"has the least amount of plants with" + currMax + "plants");

    }
    }




