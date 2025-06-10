package services;

import java.util.Arrays;

import models.requests.CatModel;
import models.services.CatService;

public class CatServiceTest {
    protected final CatService service = new CatService();

    protected CatModel defaultCat() {
        CatModel model = new CatModel();
        model.setName("Jhonny Walker");
        model.setAge(3);
        model.setBreed("Persian");
        model.setDateJoined("2025-06-09T15:05:23.414Z");
        model.setVaccinated(true);
        model.setTemperament(Arrays.asList("Calm"));
        model.setStaffInCharge("00000000-0000-0000-0000-000000000000");
        model.setIsAdopted(false);
        model.setAdopterId(1);
        return model;
    }
}
