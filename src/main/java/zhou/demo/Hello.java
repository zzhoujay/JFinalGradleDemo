package zhou.demo;

import com.jfinal.core.Controller;

/**
 * Created by zhou on 15-11-21.
 */
public class Hello extends Controller {

    public void index() {
        renderHtml("<h1>Hello JFinal,Gradle</h1>");
    }
}
