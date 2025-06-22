package com.hamitmizrak.controller.api.interfaces;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.controller.api.ICrudApi;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

// API INTERFACE (IRegisterApi)
// D: Dto
public interface IRegisterApi<D> extends ICrudApi<D> {
    // Register SpeedData
    public ResponseEntity<?> registerApiSpeedData(Long data);

    // Register User All Delete
    public ResponseEntity<?> registerApiUserAllDelete();

    // CREATE Register(Api)
    ResponseEntity<?> objectApiCreate(Long rolesId, RegisterDto registerDto);

    /////////////////////////////////////////////////////////
    // Email adresinden kullanıcı rolünü bulmak

} //end Registerapi interface
