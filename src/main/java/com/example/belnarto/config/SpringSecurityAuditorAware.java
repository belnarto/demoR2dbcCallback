package com.example.belnarto.config;

import org.springframework.data.domain.ReactiveAuditorAware;
import reactor.core.publisher.Mono;

class SpringSecurityAuditorAware implements ReactiveAuditorAware<String> {

    @Override
    public Mono<String> getCurrentAuditor() {

        return Mono.just("anon");
    }

}
