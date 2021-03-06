## Extend Typedapi to fit your needs
You ended up in this file if:
 - the default implements for a HTTP framework doesn't fit your needs
 - if the framework you want to use is not supported
 - you exceed some of the limitations of this library

### Write your own Client backend
To write your own client backend you have to implement the [ApiRequest](https://github.com/pheymann/typedapi/blob/master/client/src/main/scala/typedapi/client/ApiRequest.scala) type-classes:
  - `GetRequest`
  - `PutRequest` and `PutWithBodyRequest`
  - `PostRequest` and `PostWithBodyRequest`
  - `DeleteRequest`

Take a look into [http4s-client](https://github.com/pheymann/typedapi/blob/master/http4s-client/src/main/scala/typedapi/client/http4s/package.scala) to get an idea how to do it.

You can implement all type-classes or just a subset to override implementations provided by TypedApi.

### Write your own Server backend
To write your own server backend you have to implement the [EndpointExecutor](https://github.com/pheymann/typedapi/blob/master/server/src/main/scala/typedapi/server/EndpointExecutor.scala) and [MountEndpoints](https://github.com/pheymann/typedapi/blob/master/server/src/main/scala/typedapi/server/ServerManager.scala) type-classes

Take a look into [http4s-server](https://github.com/pheymann/typedapi/blob/master/http4s-server/src/main/scala/typedapi/server/http4s/package.scala) to get an idea how to do it.

You can implement all type-classes or just a subset to override implementations provided by TypedApi.
