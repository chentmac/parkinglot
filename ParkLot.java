package parkinglot;

import java.util.HashMap;
import java.util.Map;
class ParkLot {
    private Map<String,Car> carMap = new HashMap<>();
    private int maxCount =50;
    boolean park(Car car) {
        if(carMap.size()< maxCount){
            carMap.put(car.getCarNum(),car);
            return true;
        }
        return false;
    }

    Car pick(String carNum) {
        if(carMap.containsKey(carNum)) {
            Car pickedCar = carMap.get(carNum);
            carMap.remove(carNum);
            return pickedCar;
        }
        return null;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
}
