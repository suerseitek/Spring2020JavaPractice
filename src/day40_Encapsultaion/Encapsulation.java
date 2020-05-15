package day40_Encapsultaion;

public class Encapsulation {

    private long SSN;

    // getter: read only
    long getSSN(){
        return SSN;
    }

    // setter: write only
    void setSSN(long SSN){
        this.SSN = SSN;
    }


}
