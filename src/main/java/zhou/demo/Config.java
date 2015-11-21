package zhou.demo;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;

/**
 * Created by zhou on 15-11-21.
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        loadPropertyFile("config.txt");
        me.setDevMode(getPropertyToBoolean("devMode", false));
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/", Hello.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }

    public static void main(String... args) {
        JFinal.start("src/main/webapp", 8080, "/", 5);
    }
}
