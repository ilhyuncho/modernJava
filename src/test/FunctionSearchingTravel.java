package test;

public class FunctionSearchingTravel {

    public FunctionSearchingTravel(){

    }
    public static boolean isVietnam(TravelInfo travelInfo){
        if(travelInfo.getCountry().equals("vietnam")){
            return true;
        }
        return false;
    }
}
