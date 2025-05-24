package com.hamitmizrak.audit;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

// LOMBOK
@Log4j2

// StereoType
@Component
public class AuditingAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // org.springframework.security.core.Authentication
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();

        // Sisteme login olmuş kişi varsa onun bilgilerini bana ver.
        if (authentication!=null && authentication.isAuthenticated()){
            log.warn("Sistemdeki Kullanıcı Name Bilgisi: "+authentication.getName());
            System.err.println("Sistemdeki Kullanıcı Bilgisi: "+authentication.getName());
            log.warn("Sistemdeki Kullanıcı Bilgisi: "+authentication.getPrincipal().toString());
            return Optional.of(authentication.getName());
        }
        // Eğer sisteme login olmuş birisi yoksa "HamitM."
        return Optional.of("HamitM.");
    }
}
