class Bike{
    int speedlimit = 80;  

    void run(){
        System.out.println("Runn fast.");
    }
}


class honda extends Bike{
    int speedlimit = 390;

    void run(){
        System.out.println("Run the fastest.");
    }

    public static void main(String args[]){
        Bike b = new honda();
        System.out.println(b.speedlimit); //80 ->  //// so the function variables can'not be overridden

        b.run(); /// methods can be overridden and hence can be used to achieve runtime polyformism.

        
    }
}