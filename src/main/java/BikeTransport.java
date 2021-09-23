import vehicle.Bike;
import vehicle.IVehicle;

public class BikeTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
