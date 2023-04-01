package org.acme;

import org.apache.camel.builder.RouteBuilder;

public class MyRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("aws2-s3://test?delay=1500")
                .log("Incoming file with content : ${body}");
    }
}
