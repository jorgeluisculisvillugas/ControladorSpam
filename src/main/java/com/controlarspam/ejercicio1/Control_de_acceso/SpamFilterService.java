package com.controlarspam.ejercicio1.Control_de_acceso;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SpamFilterService {

    private final List<String> spamDomains = List.of(
            "spam.com",
            "phishing.com",
            "malware.com"
            // Añade aquí más dominios de spam
    );

    public boolean isSpam(String url) {
        return spamDomains.stream().anyMatch(url::contains);
    }
}

