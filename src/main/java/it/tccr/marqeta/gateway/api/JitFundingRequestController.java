package it.tccr.marqeta.gateway.api;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/jit-funding-requests")
public class JitFundingRequestController {
  @PostMapping(produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<Void> requestJitFunding(@RequestBody JsonNode jitFundingRequest) {
    // TODO
    return ResponseEntity.ok(null);
  }
}
