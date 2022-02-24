package com.example.skeleton;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;

/**
 * MyApi skeleton endpoints sample
 * Add your first API methods in this class, or you may create another class.
 * In that case, update the src/main/webapp/WEB-INF/web.xml and modify
 * the class set to the services param as a comma separated list.
 *
 * For example:
 *  <init-param>
 *      <param-name>services</param-name>
 *      <param-value>com.example.skeleton.FirstApi, com.example.skeleton.SecondApi</param-value>
 *  </init-param>
 *
 */
@Api(
     name = "skeleton",
     version = "v1"
)
public class MyApi {
     //http://localhost:8080/_ah/api/skeleton/v1/ping
     @ApiMethod(name = "ping", httpMethod = ApiMethod.HttpMethod.GET, path = "ping" )
     public Message ping() {
          return new Message("OK");
     }
     //http://localhost:8080/_ah/api/skeleton/v1/echo
     @ApiMethod(name = "echo", httpMethod = ApiMethod.HttpMethod.POST, path = "echo")
     public Message echo(@Named("message") @Nullable String message) {
          return new Message("OK "+message);
     }
}

