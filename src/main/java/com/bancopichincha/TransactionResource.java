package com.bancopichincha;

import com.bancopichincha.entity.Transaction;
import com.bancopichincha.service.ITransactionService;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/api/v1/transaction")
public class TransactionResource {

  @Inject
  ITransactionService transactionService;

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Transactional
  public Response saveTransaction(Transaction transaction) {

    Transaction trx = null;
    Map<String, Object> response = new HashMap<>();
    trx = transactionService.save(transaction);
    response.put("message", "Transaction successfully!!!");
    response.put("transaction", trx);
    return Response
        .status(Status.CREATED)
        .entity(response)
        .build();
  }

}
