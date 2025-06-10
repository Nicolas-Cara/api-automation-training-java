package services;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import models.responses.CatResponse;
import models.responses.ResponseContainer;

public class CatRetrivalTest extends CatServiceTest {

    @Test
    void getCats() {
        ResponseContainer<List<CatResponse>> response = service.getCats(null);
        Assertions.assertEquals(200, response.getStatus());
    }
}
