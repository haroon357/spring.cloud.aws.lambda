if you build the project you will get target/spring.cloud.aws.lambda-0.0.1-SNAPSHOT.jar 
deploy this jar as aws lambda and provide lambda handler function as follow

org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest