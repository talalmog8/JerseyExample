module myModule {
    requires grizzly.http.server;
    requires jersey.server;
    requires jersey.container.grizzly2.http;
    requires jersey.common;
    requires java.ws.rs;
    requires java.json.bind;
    exports com.example;
}