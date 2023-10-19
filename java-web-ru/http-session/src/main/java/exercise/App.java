package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            String pageStr = ctx.queryParam("page");
            String perStr = ctx.queryParam("per");

            int page = (pageStr != null) ? Integer.parseInt(pageStr) : 1;
            int per = (perStr != null) ? Integer.parseInt(perStr) : 5;

            int offset = (page - 1) * per;

            java.util.List<java.util.Map<String, String>> paginatedUsers = new java.util.ArrayList<>();

            for (int i = offset; i < Math.min(offset + per, USERS.size()); i++) {
                paginatedUsers.add(USERS.get(i));
            }

            ctx.json(paginatedUsers);
        });
        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
