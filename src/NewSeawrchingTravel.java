import test.TravelInfo;

import java.util.ArrayList;
import java.util.List;

public class NewSeawrchingTravel {

    public static final String COUNTRY_VIETNAM = "vietnam";
    public static final String COUNTRY_PHILLIPHINE = "philliphine";
    public static final String COUNTRY_TAILAND = "tailand";
    private List<TravelInfo> travelInfoList = new ArrayList<>();

    NewSeawrchingTravel(){
        initializeProduct();
    }

    private void initializeProduct(){
        TravelInfo cebu = new TravelInfo();
        cebu.setName("cebu travel");
        cebu.setCountry(COUNTRY_PHILLIPHINE);
        cebu.setCity("cebu");
        cebu.setDays(5);
        cebu.setNights(3);
        travelInfoList.add(cebu);

        TravelInfo boracay = new TravelInfo();
        boracay.setName("boracay travel");
        boracay.setCountry(COUNTRY_PHILLIPHINE);
        boracay.setCity("boracay");
        boracay.setDays(5);
        boracay.setNights(3);
        travelInfoList.add(boracay);

        TravelInfo hanoi = new TravelInfo();
        hanoi.setName("hanoi travel");
        hanoi.setCountry(COUNTRY_VIETNAM);
        hanoi.setCity("hanoi");
        hanoi.setDays(3);
        hanoi.setNights(2);
        travelInfoList.add(hanoi);

        TravelInfo danang = new TravelInfo();
        danang.setName("danang travel");
        danang.setCountry(COUNTRY_VIETNAM);
        danang.setCity("danang");
        danang.setDays(6);
        danang.setNights(4);
        travelInfoList.add(danang);

        TravelInfo bankok = new TravelInfo();
        bankok.setName("cebankokbu travel");
        bankok.setCountry(COUNTRY_TAILAND);
        bankok.setCity("bankok");
        bankok.setDays(5);
        bankok.setNights(3);
        travelInfoList.add(bankok);
    }

    public List<TravelInfo> searchTravelInfo(String country) {
        List<TravelInfo> result = new ArrayList<>();

        for(TravelInfo t : travelInfoList){
            if(country.equals( t.getCountry())){
                result.add(t);
            }
        }
        return result;
    }

    public List<TravelInfo> searchTravelInfo2(TravelInfoFilter filter){
        List<TravelInfo> result = new ArrayList<>();

        for(TravelInfo t : travelInfoList){
            if( filter.isMatched(t)){
                result.add(t);
            }
        }
        return result;
    }


}
