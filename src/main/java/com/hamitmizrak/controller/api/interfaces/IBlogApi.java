package com.hamitmizrak.controller.api.interfaces;

import com.hamitmizrak.controller.api.ICrudApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBlogApi<D> extends ICrudApi<D> {

    // ALL DELETE
    public ResponseEntity<String> blogApiAllDelete();

    // SPEED DATA
    public ResponseEntity<List<D>> blogApiSpeedData(Long key);

}
