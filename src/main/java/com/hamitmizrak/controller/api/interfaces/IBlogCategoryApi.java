package com.hamitmizrak.controller.api.interfaces;

import com.hamitmizrak.controller.api.ICrudApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBlogCategoryApi<D> extends ICrudApi<D> {

    // ALL DELETE
    public ResponseEntity<String> categoryApiAllDelete();

    // SPEED DATA
    public ResponseEntity<String> categoryApiSpeedData(Integer data);

}
