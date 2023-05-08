public class Plot {
public String plantName;
public int numberOfPlants;
public boolean needsWater;

public Plot() {

    numberOfPlants = (int) (Math.random() * 90 + 10);

    int plantID = (int) (Math.random() *5);
    if (plantID == 0) {
        plantName = "tomato";
    } else if (plantID == 1) {
        plantName = "carrot";
    } else if (plantID == 2) {
        plantName = "lettuce";

    } else if (plantID == 3) {
        plantName = "tulip";
    } else if (plantID == 4) {
        plantName = "empty";
    }
    int waterID=(int)(Math.random()*2);
    if(waterID==0) {
        needsWater = true;
    }else{
        needsWater=false;
    }

}


    public void printPlotInfo(){

System.out.println("*****");
    System.out.println("Plant Name: "+plantName);
    System.out.println("number Of Plants:"+numberOfPlants);
    System.out.println("needs Water:"+needsWater);
        }
        }