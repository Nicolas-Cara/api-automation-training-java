package models.services;

import java.util.List;
import java.util.Map;

import base.ServiceBase;
import models.requests.CatModel;
import models.responses.CatResponse;
import models.responses.ResponseContainer;

public class CatService extends ServiceBase {
    public CatService() {
        super("/api/cats");
    }

    // GET
    public ResponseContainer<List<CatResponse>> getCats(Map<String, String> headers) {
        return this.getListOfObjects(this.url, headers);
    }

    // POST
    public ResponseContainer<CatResponse> addCat(CatModel model, Map<String, String> headers) {
        return this.post(this.url, model, headers, CatResponse.class);
    }

    // PUT {id}
    public ResponseContainer<CatResponse> editCatById(CatModel model, Long catId, Map<String, String> headers) {
        return this.put(this.url + "/" + catId, model, headers, CatResponse.class);
    }

    // GET {id}
    public ResponseContainer<CatResponse> getCatById(Long catId, Map<String, String> headers) {
        return this.getSingleObject(this.url + "/" + catId, headers, CatResponse.class);
    }

    // PATCH {id}
    public ResponseContainer<CatResponse> patchCatById(CatModel model, Long catId, Map<String, String> headers) {
        return this.patch(this.url + "/" + catId, model, headers, CatResponse.class);
    }

    // DELETE {id}
    public ResponseContainer<CatResponse> deleteCatById(CatModel model, Long catId, Map<String, String> headers) {
        return this.delete(this.url + "/" + catId, model, headers, CatResponse.class);
    }
}
