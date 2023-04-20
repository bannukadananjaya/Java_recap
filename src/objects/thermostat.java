package objects;

class thermostat {
    //private variables
    private float currentTemp;
    private float desiredTemp;
    //methods
    public void furnance_on(){
        //
    }

    public void furnance_off(){
        //
    }

    public static void main(String[] args) {
        //create two referance variables
        thermostat therm1,therm2;
        //create two objects and store refferance to them
        therm1= new thermostat();
        therm2= new thermostat();

        //Accessing objects
        therm1.furnance_on();
        therm2.furnance_off();
    }
}
