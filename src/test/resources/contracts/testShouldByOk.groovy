package contracts

import org.springframework.cloud.contract.spec.Contract

/**
 * \$Id$
 * <p>
 * Created 21/01/2022 by maciasavila
 * </p>
 * <p>
 * [Add comment here]
 * </p>
 * <p>
 * Copyright: Copyright (c) 2020
 * Organisation: Igel Technology GmbH
 * </p>
 */

Contract.make {
  request {
    method "POST"
    url '/test'
    body([id: 1, data: "testData"])
    headers {
      contentType(applicationJson())
    }
  }
  response {
    status 200
    body([data: "it works", "status": "OK"])
    headers {
      contentType(applicationJson())
    }
  }
}