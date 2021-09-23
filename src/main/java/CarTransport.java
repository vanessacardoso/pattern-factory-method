import vehicle.Car;
import vehicle.IVehicle;

//essa classe implementa o objeto car
public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
