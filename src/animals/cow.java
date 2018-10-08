package animals;

public class cow {
    static int weight = 300; //    limit 500
    static int age = 7;
    static int speed = 2; //km/h
    static int milk = 0; //L/day   // limit 10


    public static boolean eat(int food_kg) {

        if(weight < 500 && milk <10){
           weight += 0.1 * food_kg;
           milk +=0.2*food_kg;
           return true;
        }else{
            return false;
        }
    }

    public static void sounds(){

    }

    public static boolean walk(int distance){
        int x = 0;
        if(distance < 1 && distance>-1){

           while(x!=10){
               x++;
              if(weight<350 && milk<3){
                 System.out.println("Can Walk" );
                 //return true;
              }else if(weight>350&&weight<400&&milk>3&&milk<6) {
                 System.out.println("Can Walk 5km.");
                 return true;
              }else if(weight>400 && milk<9){
                 return false;
              }
           }
        }
    }


//HW return the empty calls of eat()  to 10 times.
    public static void aging(){

    }

    public static void info(){
        System.out.println("\tage:   " + age + "Years");
        System.out.println("\tmilk   " + milk + " Litters/day");
        System.out.println("\tweight: " + weight + " kg");

    }
}
