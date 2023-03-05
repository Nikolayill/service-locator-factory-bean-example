# service-locator-factory-bean-example

## Success request example


```shell
curl -X POST localhost:8080/payment-service/pay \
-H "Content-Type: application/json" \
-d '{"amount": 42, "paymentMethod": "PAYTM"}'
```

Requests with paymentMethod is any of AMAZONPAY, PAYTM, PHONEPE
will return 200 status and the response like:
```
42 paid successfully using Paytm
```

## Failing request example
### NoSuchBeanDefinitionException
Request with paymentMethod "PAYXXX" will fail with 500 status, 
because we don't have components corresponding "PayXxX" name.

```shell
curl -X POST localhost:8080/payment-service/pay \
-H "Content-Type: application/json" \
-d '{"amount": 42, "paymentMethod": "PAYXXX"}'
```

in the application logs we'll see 
```shell
org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'PayXxX' available
```

This error is easy to prevent by checking  
`PaymentSystemType` and `PaymentSystemTypeConst` constant usages.
Each constant must be tied with the application component name.

### 400 response status
Any other "paymentMethod" value will produce "JSON parse error" and "Bad request" status.