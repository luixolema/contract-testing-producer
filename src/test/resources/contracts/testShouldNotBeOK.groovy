package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
  request {
    method "POST"
    url '/test'
    body([id: 2, data: anyNonEmptyString()])
    headers {
      contentType(applicationJson())
    }
  }
  response {
    status 400
    body([data: "it works", "status": "NO_OK"])
    headers {
      contentType(applicationJson())
    }
  }
}