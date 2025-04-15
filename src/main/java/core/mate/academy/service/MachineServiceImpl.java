package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Object> getAll(Class type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else if (type == Truck.class) {
            return new ArrayList<>(new TruckProducer().get());
        } else if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        return Collections.emptyList(); // na wypadek typu np. Machine.class
    }

    @Override
    public void fill(List<Object> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
