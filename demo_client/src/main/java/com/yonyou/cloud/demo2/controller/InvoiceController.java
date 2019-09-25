package com.yonyou.cloud.demo2.controller;

import com.yonyou.cloud.util.JWTUtils;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class InvoiceController {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${practice.url}")
  private String PRACTICE_URL;

  @RequestMapping("/invoice/query/{id}")
  public String query(@PathVariable("id") String id) {
    URI uri = UriComponentsBuilder.fromUriString(PRACTICE_URL + "invoice/query").build().toUri();
    RequestEntity<String> requestEntity = RequestEntity.post(uri)
        .header("token", JWTUtils.generateToken("zhangwbin"))
        .body(id);
    ResponseEntity<String> result = restTemplate.exchange(requestEntity, String.class);
    return result.getBody();
  }

  @RequestMapping("/invoice/error/query/{id}")
  public String queryErrorToken(@PathVariable("id") String id) {
    URI uri = UriComponentsBuilder.fromUriString(PRACTICE_URL + "invoice/query").build().toUri();
    RequestEntity<String> requestEntity = RequestEntity.post(uri)
        .header("token", "qgewewer.wkguwkheq.wekfhwekh")
        .body(id);
    ResponseEntity<String> result = restTemplate.exchange(requestEntity, String.class);
    return result.getBody();
  }
}
