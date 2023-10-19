package exercise;

import io.javalin.Javalin;

public final class App {

    private static Javalin app;

    public static Javalin getApp() {
        if (app == null) {
            app = Javalin.create();
            app.get("/welcome", ctx -> ctx.result("Welcome to Hexlet!"));
        }
        return app;
    }

    public static void main(String[] args) {
        app = getApp();
        app.start(7070);
    }
}
