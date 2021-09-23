import vehicle.IVehicle;
import vehicle.Motorcycle;

//essa classe implementa o objeto moto
public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
