package spring.project.msapiclient.configurations;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.web.reactive.function.server.RequestPredicates;import org.springframework.web.reactive.function.server.RouterFunction;import org.springframework.web.reactive.function.server.RouterFunctions;import org.springframework.web.reactive.function.server.ServerResponse;import spring.project.msapiclient.handlers.ProductHandler;@Configurationpublic class ProductRouterConfig {    @Bean    public RouterFunction<ServerResponse> routes(ProductHandler handler) {        return RouterFunctions                .route(RequestPredicates                        .GET("/api/clients/select"), handler::select)                .andRoute(RequestPredicates                        .GET("/api/clients/get/{id}"), handler::get)                .andRoute(RequestPredicates                        .POST("/api/clients/insert"), handler::insert)                .andRoute(RequestPredicates                        .PUT("/api/clients/update/{id}"), handler::update)                .andRoute(RequestPredicates                        .DELETE("/api/clients/delete/{id}"), handler::delete);    }}