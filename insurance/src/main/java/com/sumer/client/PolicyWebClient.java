package com.sumer.client;

import com.sumer.dto.InsuranceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@Service
public class PolicyWebClient {
    private final WebClient webClient;

    @Autowired
    public PolicyWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://apiuat.genric.co.za/skiapi/v1")
                .build();
    }

    public Mono<InsuranceDTO> createPolicy(InsuranceDTO insuranceDTO) {
        return webClient.method(HttpMethod.POST)
                .uri("/policies")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(insuranceDTO))
                .retrieve()
                .bodyToMono(InsuranceDTO.class);
    }

    public Mono<InsuranceDTO> getPolicy(String policyId) {
        return webClient.get()
                .uri("/policies/{policyId}", policyId)
                .retrieve()
                .bodyToMono(InsuranceDTO.class);
    }

    public Mono<String> getPaymentTerms() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/configuration/lookups")
                        .queryParam("groups", "Payment Term")
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }
}
