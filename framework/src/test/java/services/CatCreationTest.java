package services;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import models.requests.CatModel;
import models.responses.CatResponse;
import models.responses.ResponseContainer;

public class CatCreationTest extends CatServiceTest {

    @Test
    @Tag("Smoke")
    @DisplayName("Crear un nuevo gato, retorna data esperada, solo casos buenos")
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
    }

    @Test
    @Tag("Smoke")
    @DisplayName("Crear un nuevo gato, retorna data esperada, solo casos malos")
    void createNewCatFalse() {
        CatModel model = defaultCat();
        ResponseContainer<CatResponse> response = service.addCat(model, null);
        Assertions.assertEquals(201, response.getStatus());
        CatResponse responseModel = response.getData();

        Assertions.assertNotNull(response.getData());

        Assertions.assertNotEquals("Peludo", responseModel.getName());
        Assertions.assertNotEquals(5, responseModel.getAge());
        Assertions.assertNotEquals("Ragdoll", responseModel.getBreed());
        Assertions.assertNotEquals("2024-07-09T15:05:23.414Z", responseModel.getDateJoined());
        Assertions.assertNotEquals(false, responseModel.getVaccinated());
        Assertions.assertNotEquals(Arrays.asList("Aggressive"), responseModel.getTemperament());
        Assertions.assertNotEquals("00000000-0000-0000", responseModel.getStaffInCharge());
        Assertions.assertNotEquals(true, responseModel.getIsAdopted());
        Assertions.assertNotEquals(model.getAdopterId(), responseModel.getAdopterId());
    }
}
