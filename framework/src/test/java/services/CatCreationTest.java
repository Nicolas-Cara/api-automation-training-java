package services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.requests.CatModel;
import models.responses.CatResponse;
import models.responses.ResponseContainer;

public class CatCreationTest extends CatServiceTest {

    @Test
    @DisplayName("Crear un nuevo gato, retorna data esperada")
    void createNewCat() {
        CatModel model = defaultCat();
        ResponseContainer<CatResponse> response = service.addCat(model, null);
        Assertions.assertEquals(201, response.getStatus());
        CatResponse responseModel = response.getData();

        Assertions.assertNotNull(response.getData());
        Assertions.assertEquals(model.getName(), responseModel.getName());
        Assertions.assertEquals(model.getAge(), responseModel.getAge());
        Assertions.assertEquals(model.getBreed(), responseModel.getBreed());
        Assertions.assertEquals(model.getDateJoined(), responseModel.getDateJoined());
        Assertions.assertEquals(model.getVaccinated(), responseModel.getVaccinated());
        Assertions.assertEquals(model.getTemperament(), responseModel.getTemperament());
        Assertions.assertEquals(model.getStaffInCharge(), responseModel.getStaffInCharge());
        Assertions.assertEquals(model.getIsAdopted(), responseModel.getIsAdopted());
        // Assertions.assertEquals(model.getAdopterId(), responseModel.getAdopterId());
    }

}
